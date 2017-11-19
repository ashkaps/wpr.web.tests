package runners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	  private static final Logger LOGGER = LogManager.getLogger(Test.class.getName());
	     
		public static void main(String[] args) {
			
			
			
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", "/Users/aishvaryakapoor/Downloads/selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://wprdev.azurewebsites.net/account/login");
			driver.findElement(By.id("LoginUserName")).sendKeys("");;
			driver.findElement(By.id("LoginPassword")).sendKeys("");
			driver.findElement(By.xpath("//button[\"@type='submit'\"]")).click();
			

		}
	    

}
