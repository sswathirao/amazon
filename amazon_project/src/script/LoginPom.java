package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginPom {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		LoginPage  l = new LoginPage(driver);
		l.hello(driver);
		l.signin();
		l.userNama("testerqsp28@gmail.com");
		l.continuee();
		l.password("manager");
		l.login();
		String t = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		
		if(t.equals("Amazon Sign In"))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.close();

	}

}
