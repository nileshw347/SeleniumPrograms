package Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://is.rediff.com/signup/register");
		Thread.sleep(2000);
		//select[@name='date_mon']
		//select[@name='date_day']
		
		WebElement DayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s = new Select(DayDropDown);
		s.selectByIndex(20);
		System.out.println("All day elements = " + (s.getOptions().size()));
		List<WebElement> DayAllOption = s.getAllSelectedOptions();
		String Day = DayAllOption.get(0).getText();
		System.out.println(Day);
		
		WebElement MonthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select s1 = new Select(MonthDropDown);
		List<WebElement> AllMonOpt = s1.getOptions();
		System.out.println("All Months Elements = " + AllMonOpt.size());
		for(int i=0;i<AllMonOpt.size();i++)
		{
			System.out.println(AllMonOpt.get(i).getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}
