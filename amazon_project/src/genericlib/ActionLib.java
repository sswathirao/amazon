package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionLib {
	

	public static void mousehover(WebDriver driver, WebElement target)
	{
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

}
