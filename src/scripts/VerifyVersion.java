package scripts;

import org.testng.annotations.Test;

import gemeric.BaseTest;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyVersion extends BaseTest{
	@Test(priority=3)
	public void checkVersion(){
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage homePage = new EnterTimeTrackPage(driver);
		lp.setUserName(INPUT_PATH, "ValidLoginLogout", 1, 0);
		lp.setPassword(INPUT_PATH, "ValidLoginLogout", 1, 1);
		lp.clickLogin();
		homePage.clickHelp();
		homePage.clickAbout();
	}

}
