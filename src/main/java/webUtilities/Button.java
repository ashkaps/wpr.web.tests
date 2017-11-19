package webUtilities;

public class Button {
	Elements common = new Elements();

	public void click(String uiObjectName) {
		try {
			common.object(uiObjectName).click();
		} catch (Exception e) {

		}
	}

}
