package script;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.AboutBookPage;
import pom.HomePage;
import pom.LoginPage;
import pom.NewsLettersPage;
import pom.RareBookPage;

public class AmazonTC10 extends BaseClass {
	
	@Test(priority=-1)
	
	public void SellLink() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 131, 3);
		String pas = Excel.getdata("sheet1", 133, 3);
		String name = Excel.getdata("sheet1", 174, 3);
		String email = Excel.getdata("sheet1", 175, 3);
		String conemail = Excel.getdata("sheet1", 176, 3);
		SoftAssert s = new SoftAssert();

		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		Thread.sleep(4000);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		String t1=driver.getTitle();
		System.out.println(t1);
		s.assertEquals(t1, "Amazon Sign In");
		Reporter.log(t1,true);
		
		HomePage h = new HomePage(driver);
		h.aboutBook();
		
		String t2=driver.getTitle();
		System.out.println(t2);
		s.assertEquals(t2, "Amazon Sign In");
		Reporter.log(t2,true);
		
		AboutBookPage ab = new AboutBookPage(driver);
		
		ab.subscribe();
		String t3=driver.getTitle();
		System.out.println(t3);
		s.assertEquals(t3, "Amazon Sign In");
		Reporter.log(t3,true);
		
		NewsLettersPage nl = new NewsLettersPage(driver);
		nl.name(name);
		nl.email(email);
		nl.conformEmail(conemail);
		nl.subscribe();
		nl.startSelling();
		nl.rareBook();
		
		String t4=driver.getTitle();
		System.out.println(t4);
		s.assertEquals(t4, "Amazon Sign In");
		Reporter.log(t4,true);
		
		RareBookPage rb = new RareBookPage(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		rb.findOneNearYou();
		
		for(int i = 0; i<6; i++)
		{
			driver.navigate().back();
		}
		
		String t5=driver.getTitle();
		System.out.println(t5);
		s.assertEquals(t5, "Amazon Sign In");
		Reporter.log(t5,true);
		
		h.amazon();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		h.hellosignout(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		h.signout();
		
		String t6=driver.getTitle();
		System.out.println(t6);
		s.assertEquals(t6, "Amazon Sign In");
		Reporter.log(t6,true);
	}

}
