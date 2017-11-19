package webUtilities;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import driver.Variables;

public class Common {
	Variables vars = new Variables();

	public WebElement returnWebElement(String locType, String locator) {
		By by = null;
		switch (StringUtils.lowerCase(locType.trim())) {
		case "id":
			by = By.id(locator);
			break;
		case "tagName":
			by = By.tagName(locator);
			break;
		case "xpath":
			by = By.xpath(locator);
			break;
		case "cssSelector":
			by = By.cssSelector(locator);
			break;
		case "className":
			by = By.className(locator);
			break;
		case "name":
			by = By.name(locator);
			break;
		case "linkText":
			by = By.linkText(locator);
			break;
		case "partialLinkText":
			by = By.partialLinkText(locator);
			break;
		default:
		}
		return findElement(by);
	}
	
	public WebElement findElement(By by) {
		WebElement element = null;
		try {
			element = vars.getDriver().findElement(by);
		} catch (NoSuchElementException e) {
			
		} catch (Exception e) {
			
		}
		return element;
	}

}
