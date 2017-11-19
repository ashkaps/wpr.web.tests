package webUtilities;

import driver.Variables;

public class Window {
	Variables vars = new Variables();
	private static String parentWinHandle = null;

	public void switchToChild() {
		parentWinHandle = vars.getDriver().getWindowHandle();
		for (String winHandle : vars.getDriver().getWindowHandles()) {
			if (!winHandle.equalsIgnoreCase(parentWinHandle)) {
				vars.getDriver().switchTo().window(winHandle);
			}
		}
	}
	
	public void switchToParent() {
		vars.getDriver().switchTo().window(parentWinHandle);
	}
	
	public void closeChildAndSwitchToParent() {
		vars.getDriver().close();
		vars.getDriver().switchTo().window(parentWinHandle);
	}

}
