package script;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.TestersAmazonPage;
import pom.YourOrderPage;

public class AmazonTC9 extends BaseClass {
	
	@Test(priority=8)
	
	public void SellLink() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 131, 3);
		String pas = Excel.getdata("sheet1", 133, 3);
		String info = Excel.getdata("sheet1", 156, 3);

		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		HomePage h = new HomePage(driver);
		h.mousehover(driver);
		
		h.myOrder();
		
		YourOrderPage yo = new YourOrderPage(driver);
		yo.select();
		yo.sixMonths();
		yo.search(info);
		yo.testerAmazon();
		
		TestersAmazonPage ta = new TestersAmazonPage(driver);
		ta.aboutUs();
		driver.navigate().back();
		
	}
}
