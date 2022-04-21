package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Prog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		WebElement Close = driver.findElement(By.xpath("//button[text()='✕']"));
		Close.click();
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		
	    Actions Act = new Actions(driver);
	    Act.moveToElement(Login).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement GiftCards = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
	    GiftCards.click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
