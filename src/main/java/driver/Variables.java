package driver;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Maps;

public class Variables {
	private WebDriver driver = null;
	private HashMap<String,By> locatorProps = Maps.newHashMap();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public HashMap<String,By> getLocatorProps() {
		return locatorProps;
	}

	public void setLocatorProps(HashMap<String, By> locatorProps) {
		this.locatorProps = locatorProps;
	}

}
