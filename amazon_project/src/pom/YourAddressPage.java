package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class YourAddressPage extends BasePage {
	
	//1
	@FindBy(xpath="//h2[.='Add address']")
	private WebElement addadrlk;
	
	public YourAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addAddress()
	{
		addadrlk.click();
	}

}
