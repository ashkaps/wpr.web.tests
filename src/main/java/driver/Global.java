package driver;

import webUtilities.Button;
import webUtilities.Checkbox;
import webUtilities.Dropdown;
import webUtilities.Elements;
import webUtilities.InputField;
import webUtilities.Link;
import webUtilities.Screenshot;
import webUtilities.Validate;
import webUtilities.Wait;
import webUtilities.Window;

public class Global {
	public static Button button = null;
	public static Checkbox checkbox = null;
	public static Dropdown dropdown = null;
	public static Elements elements = null;
	public static InputField inputfield = null;
	public static Link link = null;
	public static Screenshot screenshot = null;
	public static Validate validate = null;
	public static Wait wait = null;
	public static Window window = null;
	
	public Global() {
		button = new Button();
		checkbox = new Checkbox();
		dropdown = new Dropdown();
		elements = new Elements();
		inputfield = new InputField();
		link = new Link();
		screenshot = new Screenshot();
		validate = new Validate();
		wait = new Wait();
		window = new Window();
		button = new Button();
		button = new Button();
	}
}