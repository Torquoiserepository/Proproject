package createaccount;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCreateAccount {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.ca/");
	
	driver.navigate().to("https://www.amazon.ca/");
Thread.sleep(200);
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile( srcfile,new File("E.//screenshot.jpeg"));

		boolean result = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	System.out.println(result);	
	
	
	Actions obj = new Actions(driver);
	obj.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
	}
}