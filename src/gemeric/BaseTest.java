package gemeric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst {
	public WebDriver driver;
	@BeforeMethod
	public void openApplication(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
			
	@AfterMethod
	public void closeApplication(ITestResult result){		
		String testName = result.getName();
		int status = result.getStatus();
		if(status==ITestResult.FAILURE){
			Liberary.getSnapShot(driver, SNAP_PATH + "" +testName);
			Reporter.log("i got executed after snapshot.", true);
		}
		driver.close();
		driver.quit();
	}

}
