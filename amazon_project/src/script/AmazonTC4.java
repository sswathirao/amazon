package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.AddToCartPage;
import pom.AddressPage;
import pom.HomePage;
import pom.LoginPage;
import pom.PaymentPage;
import pom.ProductPage;

public class AmazonTC4 extends BaseClass{
	
	@Test
	public void BuyProduct()
	{
		String un =  Excel.getdata("sheet1", 20, 3);
		String pas = Excel.getdata("sheet1", 22, 3);
		String search_text = Excel.getdata("sheet1", 43, 3);
		SoftAssert s = new SoftAssert();
		
		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		String t1=driver.getTitle();
		System.out.println(t1);
		//s.assertEquals(t1, "Amazon Sign In");
		//Reporter.log(t1,true);
		
		HomePage h = new HomePage(driver);
		h.search(search_text);
		h.seaechEnter();
		
		String t2=driver.getTitle();
		System.out.println(t2);
		//s.assertEquals(t2, "Amazon Sign In");
		//Reporter.log(t2,true);
		
		ProductPage p = new ProductPage(driver);
		p.addToCart();
		
		String t3=driver.getTitle();
		System.out.println(t3);
		//s.assertEquals(t3, "Amazon Sign In");
		//Reporter.log(t3,true);
		
		AddToCartPage atc = new AddToCartPage(driver);
		atc.dropDown();
		atc.selectFronDropdown();
		atc.proceideToCheckOut();//(staleelement)
		
		String t4=driver.getTitle();
		System.out.println(t4);
		//s.assertEquals(t4, "Amazon Sign In");
		//Reporter.log(t4,true);
		
		AddressPage ap = new AddressPage(driver);
		ap.selecrAddress();
		
		String t5=driver.getTitle();
		System.out.println(t5);
		//s.assertEquals(t5, "Amazon Sign In");
		//Reporter.log(t5,true);
		
		PaymentPage pp = new PaymentPage(driver);
		pp.paymentOption();
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
}
