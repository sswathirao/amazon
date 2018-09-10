package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class AddNewAddressPage extends BasePage {
	
	//1
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	private WebElement fulnmetf;
	
	//1
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	private WebElement mobtf;
	
	//1
	@FindBy(id="address-ui-widgets-landmark")
	private WebElement lanmarktf;
	
	//1
	@FindBy(className="a-button-input")
	private WebElement addadrbtn;
	
	public AddNewAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fullname(String name)
	{
		fulnmetf.sendKeys(name);
	}
	
	public void mobileNo(String mob)
	{
		fulnmetf.sendKeys(mob);
	}
	
	public void landmark(String lanmrk)
	{
		fulnmetf.sendKeys(lanmrk);
	}
	
	public void addAddressBtn()
	{
		addadrbtn.click();
	}

}
