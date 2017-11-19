package driver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Maps;

public class Variables {
	private WebDriver driver = null;
	private HashMap<String,WebElement> locatorProps = Maps.newHashMap();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public HashMap<String,WebElement> getLocatorProps() {
		return locatorProps;
	}

	public void setLocatorProps(HashMap<String, WebElement> locatorProps) {
		this.locatorProps = locatorProps;
	}

}
