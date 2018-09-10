package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class AddToCartPage extends BasePage {
	
	@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]")
	private WebElement dropbtn;
	
	@FindBy(xpath="(//a[@class='a-dropdown-link'])[2]")
	private WebElement seldrop;
	
	@FindBy(xpath="//input[@name='proceedToCheckout']")
	private WebElement procedbtn;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dropDown()
	{
		dropbtn.click();
	}
	
	public void selectFronDropdown()
	{
		seldrop.click();
	}
	
	public void proceideToCheckOut()
	{
		procedbtn.click();
	}
	
	

}
