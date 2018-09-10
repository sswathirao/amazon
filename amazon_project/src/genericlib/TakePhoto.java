package genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakePhoto {
	
	public static String getPhoto(String folder, String testcasename, WebDriver driver)
	{
		String path = "";
		
		try
		{
			Date d = new Date();
			String Date = d.toString().replace(":", "-");
			path = folder+testcasename+Date+".png";
			TakesScreenshot t = (TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));	
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return path;
	}

}
