package script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.SelectedProductPage;
import pom.TodaysDealPage;
import pom.YourListPage;

public class AmazonTC5 extends BaseClass {
	
	@Test
	public void addToCart() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 57, 3);
		String pas = Excel.getdata("sheet1", 59, 3);
		String fildata = Excel.getdata("sheet1", 84, 3);
		String pname = Excel.getdata("sheet1", 98, 3);
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
		s.assertEquals(t1, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Reporter.log(t1,true);
		
		HomePage h = new HomePage(driver);
		h.todaydsDeal();
		h.search(pname);
		h.selectButton();
		
		String t2=driver.getTitle();
		System.out.println(t2);
		s.assertEquals(t2, "Amazon.in: Omikka Floral Design");
		Reporter.log(t2,true);
		
		ProductPage p = new ProductPage(driver);
		p.enterPname();
		
		String t3=driver.getTitle();
		System.out.println(t3);
		s.assertEquals(t3, "Amazon.in: Omikka Floral Design");
		Reporter.log(t3,true);
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
		
		SelectedProductPage spp = new SelectedProductPage(driver);
		spp.addToCartButton();
		spp.yourList();
		
		YourListPage yl = new YourListPage(driver);
		yl.filterAndSort(fildata);
		yl.createList();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		yl.popupClear();
		
		String t4=driver.getTitle();
		System.out.println(t4);
		s.assertEquals(t4, "Amazon.in");
		Reporter.log(t4,true);
		
		driver.switchTo().window(parent);
		 
		h.amazon();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		h.hellosignout(driver);
		Thread.sleep(3000);
		h.signout();
		
		String t5=driver.getTitle();
		System.out.println(t5);
		s.assertEquals(t5, "Amazon Sign In");
		Reporter.log(t5,true);
		
		
	}
}
