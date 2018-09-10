package genericlib;

import java.sql.Driver;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseClass extends Excel {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void openapplication()
	{
		System.setProperty( key, value);
		String url = Excel.getdata("sheet1", 2, 3);
		driver = new ChromeDriver();
		driver.navigate().to(url);
		
	}
	
	@AfterMethod
	
	public void closeapplication(ITestResult test)
	{
		String name = test.getName();
		int status = test.getStatus();
		if(status==2)
		{
			TakePhoto.getPhoto(photopath, name, driver);
		}
		driver.quit();
	}
	

}
