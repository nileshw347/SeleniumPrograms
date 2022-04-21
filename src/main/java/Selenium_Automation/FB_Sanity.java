package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Sanity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nilesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wankhede");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nileshw@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nileshw@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement BirthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(BirthDay);
		s.selectByIndex(19);
		Thread.sleep(2000);
		
		WebElement BirthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(BirthMonth);
		s1.selectByIndex(6);
		Thread.sleep(2000);
		
		WebElement BirthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(BirthYear);
		s2.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
