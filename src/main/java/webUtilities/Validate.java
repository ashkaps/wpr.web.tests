package webUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import driver.Variables;

public class Validate {
	Variables vars = new Variables();
	Wait wait = new Wait();

	public boolean isElementDisplayed(String uiObjectName) {
		try {
			return wait.fluentForElement(uiObjectName).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementDisplayedInSecs(String uiObjectName, int seconds) {
		try {
			return wait.fluentForElementForSecs(uiObjectName, seconds).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementDisplayedImmediately(String uiObjectName) {
		try {
			return wait.fluentForElementWithoutWait(uiObjectName).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}

}
