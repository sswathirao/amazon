package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.ActionLib;
import genericlib.BasePage;

public class HomePage {
	
	@FindBy(linkText="Today's Deals")
	private WebElement todaydeallk;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtf;
	
	@FindBy(className="s-suggestion")
	private List<WebElement> sug;
	
	@FindBy(xpath="//span[contains(.,' 5 32')]")
	private WebElement selpro;
	
	@FindBy(xpath=("//span[.='Hello, tester']"))
	private WebElement sigout;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signoutbtn;
	
	@FindBy(xpath="//span[.='Amazon']")
	private WebElement ama;
	
	//1
	@FindBy(xpath="//span[.='Hello, tester']")
	private WebElement myacclk;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement searchbtn;
	
	//8
	@FindBy(xpath="(//i[@class='a-icon a-icon-next-rounded'])[1]")
	private WebElement nextbtn;
	
	//8
	@FindBy(xpath="(//span[@class='nav-text'])[5]")
	private WebElement ecolxlk;
	
	//8
	@FindBy(xpath="(//span[@class='nav-line-1'])[6]")
	private WebElement shopbylk;
	
	//8
	@FindBy(linkText="Amazon Echo")
	private WebElement amaecolk;
	
	//8
	@FindBy(linkText="Kitchen & Dining")
	private WebElement kitdislk;
	
	//9
	@FindBy(xpath="(//span[.='Your Orders'])[1]")
	private WebElement myordlk;
	
	//10
	@FindBy(xpath="//a[@href='http://www.abebooks.com/']")
	private WebElement abtbooklk;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void todaydsDeal()
	{
		todaydeallk.click();
	}
	
	public void search(String pname)
	{
		searchtf.sendKeys(pname);
	}
	
	public void signout()
	{
		signoutbtn.click();
	}
	
	public void amazon()
	{
		ama.click();
	}
	
	public void ecoAndAlxa()
	{
		ecolxlk.click();
	}
	
	public void hellosignout(WebDriver driver)
	{
		ActionLib.mousehover(driver, sigout);
	}
	
	public void select()
	{
		selpro.click();
	}
	
	public void seaechEnter()
	{
		searchtf.sendKeys(Keys.ENTER);
	}
	
	public void yourAccount()
	{
		myacclk.click();
	}
	
	public void selectButton()
	{
		searchbtn.click();
	}
	
	public void next()
	{
		nextbtn.click();
	}
	
	public void shopBy()
	{
		shopbylk.click();
	}
	
	public void amazonEco()
	{
		amaecolk.click();
	}
	
	public void kitchenAndDining()
	{
		kitdislk.click();
	}
	
	public void myOrder()
	{
		myordlk.click();
	}
	
	public void mousehover(WebDriver driver)
	{
		ActionLib.mousehover(driver, myacclk);
	}
	
	public void aboutBook()
	{
		abtbooklk.click();
	}
	

}
