package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class YourAccountPage extends BasePage {
	
	//1
	@FindBy(xpath="//h2[contains(.,'Your Addresses')]")
	private WebElement uraddlk;
	
	public YourAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void yourAddress()
	{
		uraddlk.click();
	}

}
