package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class KitchenAndDiningPage extends BasePage {
	
	//8
	@FindBy(xpath="(//span[@class='a-size-base a-color-secondary stateTab '])[1]")
	private WebElement upcominglk;
	
	//8
	@FindBy(xpath="(//span[@class='a-size-base a-color-secondary stateTab '])[2]")
	private WebElement missedlk;
	
	public KitchenAndDiningPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void upcoming()
	{
		upcominglk.click();
	}
	
	public void missed()
	{
		missedlk.click();
	}

}
