package datastructures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import gemeric.AutoConst;

public class DropBox implements AutoConst {

	public static void main(String[] args) {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dropbox.com/");
		driver.findElement(By.id("sign-in")).click();
		WebElement email = driver.findElement(By.xpath("(//input[@name='login_email'])[1]"));
		email.sendKeys("abc");
		driver.findElement(By.xpath("(//input[@name='login_password'])[1]")).sendKeys("ancb");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

	}

}
