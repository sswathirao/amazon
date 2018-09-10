package script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.AmazonEcoPage;
import pom.HomePage;
import pom.KitchenAndDiningPage;
import pom.LoginPage;

public class AmazonTC8 extends BaseClass {
	
	@Test (priority = 2)
	
	public void SellLink() throws InterruptedException
	{
		String un =  Excel.getdata("sheet1", 131, 3);
		String pas = Excel.getdata("sheet1", 133, 3);

		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		Thread.sleep(3000);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		HomePage h = new HomePage(driver);
		h.next();
		h.shopBy();
		
		h.amazonEco();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		AmazonEcoPage ae = new AmazonEcoPage(driver);
		ae.speaker();
		
		driver.switchTo().window(parent);
		
		h.kitchenAndDining();
		
		KitchenAndDiningPage kd = new KitchenAndDiningPage(driver);
		kd.upcoming();
		kd.missed();	
	}
	
}
