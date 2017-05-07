package datastructures;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class abc {
	
	

	private static final String GECKO_EXE = "./drivers/geckodriver.exe";
	private static final String GECKO_DRIVER = "webdriver.gecko.driver";

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty(GECKO_DRIVER, GECKO_EXE);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://phptravels.net/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement currencies =  driver.findElement(By.id("currency"));
		Select currency = new Select(currencies);
		List<WebElement> allOptions = currency.getOptions();
		List<String> allText = new ArrayList<String>();
		for(int i=0; i <allOptions.size(); i++){
			String text = allOptions.get(i).getText();
			allText.add(text);
			System.out.println(text);
		}
		System.out.println("--------------");
		Collections.sort(allText);
		for (String a:allText){
			System.out.println(a);
		}
		currency.selectByValue("18");
		System.out.println(allOptions.size());
		Thread.sleep(3000);
//		driver.findElement(By.xpath("html/body/div[3]/div[3]/div/ul/li[4]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//*[@id='select2-drop-mask']")).click();
//		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./snapshot/screen12312312.png") );
		String source = driver.getPageSource();
		System.out.println(source);
		driver.quit();
		

	}

}
