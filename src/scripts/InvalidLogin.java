package scripts;

import org.testng.annotations.Test;

import gemeric.BaseTest;
import pom.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testLoginInvalid() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(INPUT_PATH, "ValidLoginLogout", 1, 0);
		lp.setPassword(INPUT_PATH, "ValidLoginLogout", 1, 1);
		lp.clickLogin();
		lp.errVerification();
	}

}
