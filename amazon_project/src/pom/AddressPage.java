package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class AddressPage extends BasePage {
	
	@FindBy(xpath="(//a[@class='a-declarative a-button-text '])[1]")
	private WebElement add;
	
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selecrAddress()
	{
		add.click();
	}

}
