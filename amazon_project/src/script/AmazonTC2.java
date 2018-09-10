package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.TodaysDealPage;

public class AmazonTC2 extends BaseClass {
	
		@Test
		public void todaysDeals() throws InterruptedException
		{
			String un =  Excel.getdata("sheet1", 5, 3);
			String pas = Excel.getdata("sheet1", 7, 3);
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
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage h = new HomePage(driver);
			h.todaydsDeal();
			
			String t2=driver.getTitle();
			System.out.println(t2);
			s.assertEquals(t2, "Amazon.in Today's Deals: Great Savings. Every Day.");
			Reporter.log(t2,true);
			
			TodaysDealPage t = new TodaysDealPage(driver);
			t.product();
			
			String t3=driver.getTitle();
			System.out.println(t3);
			s.assertEquals(t3, "Amazon.in: Home Improvement: Home & Kitchen: Hardware, Power & Hand Tools, Kitchen & Bath Fixtures, Electrical & More");
			Reporter.log(t3,true);
			
			driver.switchTo().defaultContent();
			ProductPage pp = new ProductPage(driver);
			pp.checkbox();
			Thread.sleep(3000);
			pp.costomerRating();
			
			String t4=driver.getTitle();
			System.out.println(t4);
			s.assertEquals(t4, "Amazon.in: Prestige - Home Improvement: Home & Kitchen");
			Reporter.log(t4,true);
			
			h.amazon();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			h.hellosignout(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			h.signout();
			
			String t5=driver.getTitle();
			System.out.println(t5);
			s.assertEquals(t5, "Amazon Sign In");
			Reporter.log(t5,true);
	
		}

}
