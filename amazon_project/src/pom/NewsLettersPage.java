package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class NewsLettersPage extends BasePage {
	
	//10
	@FindBy(id="name")
	private WebElement nametf;
	
	//10
	@FindBy(id="email")
	private WebElement emailtf;
	
	//10
	@FindBy(id="emailConfirmation")
	private WebElement conemailtf;
	
	//10
	@FindBy(xpath="//input[@type='image']")
	private WebElement subbtn;
	
	//10
	@FindBy(linkText="Start Selling")
	private WebElement startsellinglk;
	
	//10
	@FindBy(linkText="Rare Books")
	private WebElement rarebooklk;
	
	public NewsLettersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void name(String name)
	{
		nametf.sendKeys(name);
	}
	
	public void email(String email)
	{
		emailtf.sendKeys(email);
	}
	
	public void conformEmail(String cemail)
	{
		conemailtf.sendKeys(cemail);
	}
	
	public void subscribe()
	{
		subbtn.click();
	}
	
	public void startSelling()
	{
		startsellinglk.click();
	}
	
	public void rareBook()
	{
		rarebooklk.click();
	}

}
