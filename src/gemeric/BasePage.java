package gemeric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle){
		wait = new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("PASS: Title is matching. '"+eTitle+"'", true);
		}
		catch(Exception e){
			Reporter.log("FAIL: Title is not matching.", true);
			Assert.fail();
		}
	}

}
