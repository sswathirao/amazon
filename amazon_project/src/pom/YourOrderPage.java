package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class YourOrderPage extends BasePage {
	
	//9
	@FindBy(className="a-dropdown-prompt")
	private WebElement selectdd;		
		
	//9
	@FindBy(xpath="//a[contains(.,'past 6 months')]")
	private WebElement sixmonlk;
	
	//9
	@FindBy(id="searchOrdersInput")
	private WebElement searchtf;
	
	//9
	@FindBy(id="nav-your-amazon-text")
	private WebElement testeramwlk;
	
	public YourOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select()
	{
		selectdd.click();
	}
	
	public void sixMonths()
	{
		sixmonlk.click();
	}
	
	public void search(String info)
	{
		searchtf.sendKeys(info);
		searchtf.sendKeys(Keys.ENTER);
	}
	
	public void testerAmazon()
	{
		testeramwlk.click();
	}

}
