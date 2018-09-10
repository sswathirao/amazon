package genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorLib {
	
	public WebDriver driver;
	
	public static void scrollDown(WebDriver driver, int x, int y)
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		for(int i=0; i<5; i++)
		{
		j.executeScript("window.scrollBy("+x+", "+y+")");
		}
	}

}
