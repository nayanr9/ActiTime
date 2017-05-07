package scripts;

import org.testng.annotations.Test;

import gemeric.BaseTest;
import gemeric.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest{

		@Test(priority=1)
		public void testLoginValid(){
			LoginPage lp = new LoginPage(driver);
			EnterTimeTrackPage hp = new EnterTimeTrackPage(driver);
			lp.setUserName(INPUT_PATH, "ValidLoginLogout", 1, 0);
			lp.setPassword(INPUT_PATH, "ValidLoginLogout", 1, 1);
			lp.clickLogin();
			lp.verifyTitle(Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1));
			hp.clickLogout();
			lp.verifyTitle(Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3));
		}

}
