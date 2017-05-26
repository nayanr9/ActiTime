package gemeric;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Liberary {
	public static void getSnapShot(WebDriver driver, String folder) {
		Date d = new Date();
		String now = d.toString().replace(":", "-");
		String path = folder + " " + now + ".png";
		System.out.println(path);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File srcFile = shot.getScreenshotAs(OutputType.FILE);
		System.out.println(now);
		File destFile = new File(path);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			Reporter.log("Error taking screenshot.", true);
		}
	}

	public static void sendEmail() {
		
		Email email = new SimpleEmail();
		EmailAttachment attachment = new EmailAttachment();
		DefaultAuthenticator d = new DefaultAuthenticator("nayanr9@gmail.com", "Ihcmhslciy@2008");
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(d);
		email.setSSLOnConnect(true);
		try {
			email.setFrom("nayanr9@gmail.com");
		} catch (EmailException e) {
			e.printStackTrace();
		}
//		email.setSubject("Test Failed");
		try {
			email.setMsg("Test Failed");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		try {
			email.addTo("nayanr9@hotmail.com");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		email.setSubject("Test Failed");
		try {
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
