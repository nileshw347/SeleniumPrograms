package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_Sanity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://is.rediff.com/signup/register");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Nilesh Wankhede");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("nileshw@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='repass']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		Thread.sleep(3000);
		
		WebElement daydropdown = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s = new Select(daydropdown);
		s.selectByVisibleText("20");
		Thread.sleep(3000);
		
		WebElement mondropdown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select s1 = new Select(mondropdown);
		s1.selectByIndex(7);;
		Thread.sleep(3000);
		
		WebElement yeardropdown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s2 = new Select(yeardropdown);
		s2.selectByVisibleText("1997");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys("Aurangabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='school']")).sendKeys("XYZ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='college']")).sendKeys("ABC");
		Thread.sleep(3000);
		
		driver.close();
	}
}
