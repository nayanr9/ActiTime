package gemeric;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Liberary {
	public static void getSnapShot(WebDriver driver, String folder){
		Date d = new Date();
		String now = d.toString().replace(":", "-");
		System.out.println(now);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File srcFile = shot.getScreenshotAs(OutputType.FILE);
		System.out.println(now);
		File destFile = new File(folder+"abc.png");
		try{
			FileUtils.copyFile(srcFile, destFile);			
		}catch(Exception e){
			Reporter.log(e.getMessage(),true);
		}
	}

}
