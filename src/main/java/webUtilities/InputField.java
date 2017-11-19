package webUtilities;

public class InputField {
	
	Common common = new Common();

	public void inputText(String uiObjectName, String text) {
		common.object(uiObjectName).sendKeys(text);
	}
}
