package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.ActionLib;
import genericlib.BasePage;


public class LoginPage extends BasePage {
	
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement hsi;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	private WebElement signinbtn;
	
	
	@FindBy(id="ap_email")
	private WebElement usertb;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id="ap_password")
	private WebElement passtb;
	
	@FindBy(id="signInSubmit")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userNama(String un)
	{
		usertb.sendKeys(un);
	}
	
	public void continuee()
	{
		continuebtn.click();
	}
	
	public void password(String pas)
	{
		passtb.sendKeys(pas);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	public void hello(WebDriver driver)
	{
		ActionLib.mousehover(driver, hsi);
	}
	
	public void signin()
	{
		signinbtn.click();
	}

}
