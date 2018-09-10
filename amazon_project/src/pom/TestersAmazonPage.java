package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class TestersAmazonPage extends BasePage {
	
	//9
	@FindBy(linkText="About Us")
	private WebElement abtuslk;
	
	public TestersAmazonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void aboutUs()
	{
		abtuslk.click();
	}

}
