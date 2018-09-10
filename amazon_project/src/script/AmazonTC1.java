package script;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.AddNewAddressPage;
import pom.HomePage;
import pom.LoginPage;
import pom.YourAccountPage;
import pom.YourAddressPage;

public class AmazonTC1 extends BaseClass {
	
	@Test (priority = -1)
	public void checkForProduct() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 57, 3);
		String pas = Excel.getdata("sheet1", 59, 3);
		String name = Excel.getdata("sheet1", 65, 3);
		String mob = Excel.getdata("sheet1", 66, 3);
		String lanmk = Excel.getdata("sheet1", 67, 3);
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
		h.yourAccount();
		
		String t2=driver.getTitle();
		System.out.println(t2);
		s.assertEquals(t2, "Your Account");
		Reporter.log(t2,true);
		
		YourAccountPage ya = new YourAccountPage(driver);
		ya.yourAddress();
		
		String t3=driver.getTitle();
		System.out.println(t3);
		s.assertEquals(t3, "Your Addresses");
		Reporter.log(t3,true);
		
		YourAddressPage yad = new YourAddressPage(driver);
		yad.addAddress();
		String t4=driver.getTitle();
		System.out.println(t4);
		s.assertEquals(t4, "Your Addresses");
		Reporter.log(t4,true);
		
		AddNewAddressPage ana = new AddNewAddressPage(driver);
		ana.fullname(name);
		ana.mobileNo(mob);
		ana.landmark(lanmk);
		ana.addAddressBtn();
		
		String t5=driver.getTitle();
		System.out.println(t5);
		s.assertEquals(t5, "Your Addresses");
		Reporter.log(t5,true);
		
		h.amazon();
		h.hellosignout(driver);
		//Thread.sleep(3000);
		h.signout();
		
		String t6=driver.getTitle();
		System.out.println(t6);
		s.assertEquals(t1, "Amazon Sign In");
		Reporter.log(t6,true);
		
	}
}
