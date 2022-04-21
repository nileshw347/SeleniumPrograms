package WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement ClickAlert = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		ClickAlert.click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.close();
	}
}
