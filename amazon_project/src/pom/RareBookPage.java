package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class RareBookPage extends BasePage {
	
	//10
	@FindBy(xpath="//a[@href='/bookfairs/?cm_sp=home-_-pill_5-_-bookfairs']")
	private WebElement findonenearlk;;
	
	public RareBookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void findOneNearYou()
	{
		findonenearlk.click();
	}

}
