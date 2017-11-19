package webUtilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.Variables;

public class Screenshot {
	private static final String SCREENSHOT_OUTPUT = "screenshotOutput";
	Variables vars = new Variables();

	public void take(String outputPath) throws Exception {
		File scrFile = ((TakesScreenshot) vars.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(outputPath));
	}

	public void take() throws Exception {
		String outputPath = System.getProperty(SCREENSHOT_OUTPUT);
		take(outputPath);
	}
	
	public void takeFullscreen() {
//	Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//    ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:///FullPageScreenshot.png"));
	}
    
    

}
