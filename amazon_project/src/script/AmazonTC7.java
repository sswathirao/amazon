package script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.SelectedProductPage;
import pom.TodaysDealPage;

public class AmazonTC7 extends BaseClass {
	
	@Test
	public void CheckDropDown() throws InterruptedException {
		String un =  Excel.getdata("sheet1", 112, 3);
		String pas = Excel.getdata("sheet1", 114, 3);
		
		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomePage h = new HomePage(driver);
		h.todaydsDeal();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		TodaysDealPage t = new TodaysDealPage(driver);
		t.product();
		
		
		ProductPage p = new ProductPage(driver);
		p.product2();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
		
		SelectedProductPage s = new SelectedProductPage(driver);
		
		s.whishlist();
		s.viewPopup();
		s.delete();
		
		driver.switchTo().window(parent);
		
		t.chinaLanguage();
		driver.navigate().back();
	
	}
}
