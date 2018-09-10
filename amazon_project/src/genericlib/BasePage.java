package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public void elementPresent(WebDriver driver, WebElement element)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 4);
			w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element visible", true);
		}
		catch(Exception e)
		{
			Reporter.log("element noe visible");
			Assert.fail();
		}		
	}
	
	/*
	public void Title(WebDriver driver, WebElement element)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 4);
			w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element visible", true);
		}
		catch(Exception e)
		{
			Reporter.log("element noe visible");
			Assert.fail();
		}		
	}*/

}
