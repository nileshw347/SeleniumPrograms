package WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		WebElement ele = driver.findElement(By.xpath("//h2[@id='h2']"));
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.textToBePresentInElement(ele, "Selenium Webdriver"));
		
		driver.close();
	}
}
