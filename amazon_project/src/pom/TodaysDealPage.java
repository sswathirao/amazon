package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class TodaysDealPage extends BasePage {
	
	@FindBy(xpath="(//div[@class='a-row layer backGround'])[1]")
	private WebElement pro;
	
	@FindBy(linkText="China")
	private WebElement chinalk;
	
	public TodaysDealPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void product()
	{
		pro.click();
	}
	
	public void chinaLanguage()
	{
		chinalk.click();
	}


}
