package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class ProductPage extends BasePage {
	
	@FindBy(xpath="(//input[@type='checkbox'])[5]")
	private WebElement checkbx;
	
	@FindBy(xpath="(//span[@class='a-size-small a-color-base'])[4]")
	private WebElement custrt;
	
	@FindBy(xpath="//h2[contains(.,'Redmi 5 (Gold, 32GB)')]")
	private WebElement prolis;
	
	@FindBy(xpath="//h2[contains(.,'Redmi 5 (Black, 32GB')]")
	private WebElement pro;
	
	@FindBy(id="nav-cart")
	private WebElement cartbtn;
	
	//6
	@FindBy(xpath="//h2[@data-attribute='Omikka Floral Design Embroidery Work Double Layered Kurtis (S, M, L, XL, XXL, 3XL, 4XL)']")
	private WebElement pname;
	
	//7
	@FindBy(xpath="(//h2[@class='a-size-base s-inline  s-access-title  a-text-normal'])[1]")
	private WebElement pro2;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkbox()
	{
		checkbx.click();
	}
	
	public void costomerRating()
	{
		custrt.click();
	}
	
	public void productlist()
	{
		prolis.click();
	}
	
	public void product()
	{
		pro.click();
	}
	
	public void addToCart()
	{
		cartbtn.click();
	}
	
	public void enterPname()
	{
		pname.click();
	}
	
	public void product2()
	{
		pro2.click();
	}
}
