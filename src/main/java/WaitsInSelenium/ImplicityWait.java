package WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
//		driver.get("https://is.rediff.com/signup/register");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Nilesh");
//		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("nilesh@gmail.com");
		
		WebElement SearchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		SearchBar.sendKeys("Seleniu");
		WebElement seleniun = driver.findElement(By.xpath("(//li[@role='presentation'])[7]"));
		seleniun.click();
		
//		Thread.sleep(3000);
		driver.close();
	}
}
