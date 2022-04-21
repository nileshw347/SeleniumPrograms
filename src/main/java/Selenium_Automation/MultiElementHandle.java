package Selenium_Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElementHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> Elements = driver.findElements(By.xpath("//a"));
		System.out.println("Total Elements = " + Elements.size());
		
//		Iterator ele = Elements.iterator();
//		while(ele.hasNext())
//		{
//			System.out.println(ele.next());
//		}
		
		for(int i=0;i<Elements.size();i++)
		{
			System.out.println(Elements.get(i).getText());
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
