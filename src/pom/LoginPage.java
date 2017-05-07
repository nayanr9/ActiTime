package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import gemeric.BasePage;
import gemeric.Excel;

public class LoginPage extends BasePage {
	@FindBy(id="username")
	private WebElement uName;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement logInButton;
	@FindBy(xpath="//span[contains(.,'Username')]")
	private WebElement errMsg;
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String path, String sheet, int row, int cell){
		String s=Excel.getCellValue(path, sheet, row, cell);
		uName.sendKeys(s);
	}
	public void setPassword(String path, String sheet, int row, int cell){
		String s=Excel.getCellValue(path, sheet, row, cell);
		password.sendKeys(s);
	}
	public void clickLogin(){
		logInButton.click();
	}
	public void errVerification() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Error message is displayed.", true);
		}
		catch(Exception e){
			Reporter.log("Error message is not displayed.",true);
			Assert.fail();
		}		
	}
}
