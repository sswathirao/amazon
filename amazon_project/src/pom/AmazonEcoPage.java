package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class AmazonEcoPage extends BasePage {
	
	//8
	@FindBy(id="cr-lighthouse-term-speaker")
	private WebElement speakerbtn;
	
	public AmazonEcoPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void speaker()
	{
		speakerbtn.click();
	}

}
