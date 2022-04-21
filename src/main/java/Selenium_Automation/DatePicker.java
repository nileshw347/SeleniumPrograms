package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		Thread.sleep(1000);
		int date = 25;
		WebElement MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String Date = MonthYear.getText();   //get the element (MonthYear) as string
		System.out.println(Date);
		
		//Splitting the Month and Year
		String Month = Date.split(" ")[0];   //Getting month by Split with index[0]
		System.out.println(Month);
		String Year = Date.split(" ")[1];    //Getting year by split with index[1]
		System.out.println(Year);
		
		while(!(Month.equals("December") && Year.equals("2023")))
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		    MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			Date = MonthYear.getText();
			
			Month = Date.split(" ")[0];   
			Year = Date.split(" ")[1];    
			System.out.println(Month +" "+ Year);
		}
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		
	    
		
		Thread.sleep(3000);
		driver.close();
	}
}
