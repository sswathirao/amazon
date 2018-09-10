package script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductPage;
import pom.SelectedProductPage;

public class AmazonTC6 extends BaseClass {
	
	@Test
	public void CheckDropDown()
	{
		String un =  Excel.getdata("sheet1", 57, 3);
		String pas = Excel.getdata("sheet1", 59, 3);
		String pname = Excel.getdata("sheet1", 98, 3);
		
		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		l.signin();
		l.userNama(un);
		l.continuee();
		l.password(pas);
		l.login();
		
		HomePage h = new HomePage(driver);
		h.search(pname);
		h.selectButton();
		
		ProductPage p = new ProductPage(driver);
		p.enterPname();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		SelectedProductPage s = new SelectedProductPage(driver);
		//s.image();
		s.sizeDropdown();
		s.sizeChart();
		s.closeSizeChart();	
		
		driver.switchTo().window(parent);
		
		h.amazon();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		h.hellosignout(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		h.signout();
	}
}
