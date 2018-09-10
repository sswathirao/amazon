package script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;

import genericlib.BaseClass;
import genericlib.Excel;
import genericlib.JavascriptExecutorLib;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.SelectedProductPage;

public class AmazonTC3 extends BaseClass {
	
	@Test (priority = -2)
	public void checkForProduct() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 20, 3);
		String pas = Excel.getdata("sheet1", 22, 3);
		String pname = Excel.getdata("sheet1", 25, 3);
		String que = Excel.getdata("sheet1", 28, 3);
		int x=0, y=500;
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
		h.search(pname);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		h.select();
		
		String t2=driver.getTitle();
		System.out.println(t2);
		s.assertEquals(t2, "Amazon.in: redmi 5 32 - Smartphones / Smartphones & Basic Mobiles: Electronics");
		Reporter.log(t2,true);
		
		ProductPage p = new ProductPage(driver);
		p.product();
		
		String t3=driver.getTitle();
		System.out.println(t3);
		s.assertEquals(t3, "Amazon.in: redmi 5 32 - Smartphones / Smartphones & Basic Mobiles: Electronics");
		Reporter.log(t3,true);
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 SelectedProductPage spp = new  SelectedProductPage(driver);
		 spp.searchtfSpp(que);
		 
		 driver.switchTo().defaultContent();
		 driver.navigate().back();
		 
		 JavascriptExecutorLib j = new JavascriptExecutorLib();
		 j.scrollDown(driver, x, y);
		 
		 spp.imdb();
		 
		 String t4=driver.getTitle();
		 System.out.println(t4);
		 s.assertEquals(t4, "IMDb - Movies, TV and Celebrities - IMDb");
	     Reporter.log(t4,true);
		 
		 driver.switchTo().window(parent);
	
		h.amazon();
		h.hellosignout(driver);
		h.signout();
		/*
		String t5=driver.getTitle();
		System.out.println(t5);
		s.assertEquals(t5, "Amazon Sign In");
		Reporter.log(t5,true);
		*/
		
	} 

}
