package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectLib {
	
public WebElement element;
	
	public static void scrollDown(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}

}
