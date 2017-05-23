package scripts;

import org.testng.annotations.Test;

import gemeric.BaseTest;
import pom.LoginPage;

//there is a new change on my local, hoping this will work fine
/**There is a new change by the team mate hoping this is gonna work as expected*/


public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testLoginInvalid() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(INPUT_PATH, "InvalidLogin", 1, 0);
		lp.setPassword(INPUT_PATH, "InvalidLogin", 1, 0);
		lp.clickLogin();
		lp.errVerification();
	}

}
