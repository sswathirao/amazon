package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.WebWindow;

import genericlib.BasePage;
import genericlib.SelectLib;

public class SelectedProductPage extends BasePage {
	
	@FindBy(xpath="(//input[@type='search'])[1]")
	private WebElement sppselect;
	
	@FindBy(xpath="//a[@href='http://www.imdb.in/']")
	private WebElement imdbbtn;
	
	//5
	@FindBy(id="add-to-cart-button")
	private WebElement addtocrtbtn;
	
	//5
	@FindBy(xpath="//span[.='Your']")
	private WebElement urlstlk;
	
	//6
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement img;
	
	//6
	@FindBy(id="native_dropdown_selected_size_name")
	private WebElement sizedd;
	
	//6
	@FindBy(id="size-chart-url")
	private WebElement sizechartlk;
	
	//6
	@FindBy(xpath="//button[@data-action='a-popover-close']")
	private WebElement closesizechtbtn;
	
	//7
	@FindBy(id="add-to-wishlist-button-submit")
	private WebElement wishlstbtn;
	
	//7
	@FindBy(xpath="(//span[.='View Wish List'])[1]")
	private WebElement viewpup;
	
	//7
	@FindBy(xpath="(//input[@class='a-button-input a-declarative'])[2]")
	private WebElement deletebtn;
	
	public SelectedProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchtfSpp(String que)
	{
		sppselect.sendKeys(que);
	}
	
	public void imdb()
	{
		imdbbtn.click();
	}
	
	public void addToCartButton()
	{
		addtocrtbtn.click();
	}
	
	public void yourList()
	{
		urlstlk.click();
	}
	
	public void image()
	{
		img.click();
	}
	
	public void sizeDropdown()
	{
		sizedd.click();
		SelectLib.scrollDown(sizedd, 1);
	}
	
	public void sizeChart()
	{
		sizechartlk.click();
	}
	
	public void closeSizeChart()
	{
		closesizechtbtn.click();
	}
	
	public void whishlist()
	{
		wishlstbtn.click();
	}
	
	public void viewPopup()
	{
		viewpup.click();
	}
	
	public void delete()
	{
		deletebtn.click();
	}
	
}
