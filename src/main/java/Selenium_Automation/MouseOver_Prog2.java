package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Prog2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		Thread.sleep(2000);
		
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(AboutUs).build().perform();
		Thread.sleep(2000);
		
		WebElement Careers = driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
		Careers.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
