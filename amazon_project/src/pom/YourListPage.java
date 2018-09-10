package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class YourListPage extends BasePage {
	
	//5
	@FindBy(id="itemSearchTextInput")
	private WebElement fltrtf;
	
	//5
	@FindBy(id="createList")
	private WebElement createlstlk;
	
	//5
	@FindBy(xpath="(//input[@class='a-button-input a-declarative'])[7]")
	private WebElement popupclrbtn;
	
	public YourListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void filterAndSort(String fdata)
	{
		fltrtf.sendKeys(fdata);
		fltrtf.sendKeys(Keys.ENTER);
	}
	
	public void createList()
	{
		createlstlk.click();
	}
	
	public void popupClear()
	{
		popupclrbtn.click();
	}

}
