package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import gemeric.BasePage;

public class EnterTimeTrackPage extends BasePage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	@FindBy(xpath="//div[@class='topMenuButton'][3]")
	private WebElement helpButton;
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActitime;
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeButton;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickHelp() {
		helpButton.click();			
	}
	
	public void clickLogout(){
		logoutButton.click();
		Reporter.log("logout successful",true);
	}

	public void clickAbout() {
		aboutActitime.click();
	}
	
	public void clickClose(){
		closeButton.click();
	}
	
	public void version(){
		
	}
	

}
