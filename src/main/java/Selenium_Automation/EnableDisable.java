package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		Thread.sleep(2000);
		WebElement DisButton = driver.findElement(By.xpath("//button[@id='disable']"));
		WebElement EnButton = driver.findElement(By.xpath("//button[@id='enable-button']"));
		
		//Checking the Properties of Disable Button
		System.out.println("Disable button = " + DisButton.isDisplayed());
		System.out.println("Disable button = " + DisButton.isEnabled());
		System.out.println("Disable button = " + DisButton.isSelected());
		
		System.out.println("------------------------");
		//Checking the properties of Enable Button
		System.out.println("Enable button = " + EnButton.isDisplayed());
		System.out.println("Enable button = " + EnButton.isEnabled());
		System.out.println("Enable button = " + EnButton.isSelected());
		
		System.out.println("------------------------");
		WebElement Checkbox = driver.findElement(By.xpath("//input[@id='ch']"));
		System.out.println("Checking before click = " + Checkbox.isSelected());
		System.out.println("------------------------");
		Checkbox.click();
		System.out.println("Checking after click = " + Checkbox.isSelected());
		
		driver.close();
		
	}
}
