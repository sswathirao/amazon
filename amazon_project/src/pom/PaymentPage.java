package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class PaymentPage extends BasePage {
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement payradbtn;
	
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void paymentOption()
	{
		payradbtn.click();
	}

}
