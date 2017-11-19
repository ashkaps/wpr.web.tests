package webUtilities;

public class InputField {

	Elements common = new Elements();

	public void setText(String uiObjectName, String text) {
		try {
			common.object(uiObjectName).sendKeys(text);
		} catch (Exception e) {

		}
	}

	public void setPassword(String uiObjectName, String password) {
		try {
			common.object(uiObjectName).sendKeys(password);
		} catch (Exception e) {

		}
	}

	public String getText(String uiObjectName) {
		try {
			return common.object(uiObjectName).getText();
		} catch (Exception e) {
			return null;
		}
	}
}
