package Selenium_Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.microsoft.com/en-in/sql-server/sql-server-downloads");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File ss = new File("C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\ScreenShot\\ss1.jpg");
		FileHandler.copy(source, ss);
		
		
//		driver.navigate().to("http://is.rediff.com/signup/register");
//		File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\ScreenShot\\ss2.jpeg");
//		FileUtils.copyFile(srs, dest);
		
		driver.close();
	}

}
