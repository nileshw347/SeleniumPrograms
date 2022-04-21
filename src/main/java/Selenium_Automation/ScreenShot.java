package Selenium_Automation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File ss = new File("C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\ScreenShot\\Screenshot3.jpg");
	    FileUtils.copyFile(Source, ss);
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.microsoft.com/en-in/sql-server/sql-server-downloads");
	    File SQL = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File ss2 = new File("C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\ScreenShot\\SQL2.jpg");
	    FileUtils.copyFile(SQL, ss2);
	    
		driver.close();
	}
}
