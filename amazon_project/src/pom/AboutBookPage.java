package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class AboutBookPage extends BasePage {
	
	//10
	@FindBy(xpath="//a[.='Subscribe']")
	private WebElement subbtn;
	
	public AboutBookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void subscribe()
	{
		subbtn.click();
	}

}
