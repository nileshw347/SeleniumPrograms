package Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Prog {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement SearchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		SearchBar.sendKeys("seleniu");
		Thread.sleep(2000);
	
		List<WebElement> AutoSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<AutoSuggestion.size();i++)
		{
			String Exp = "selenium testing";
			String Act = AutoSuggestion.get(i).getText();
			if(Exp.equals(Act))
			{
				AutoSuggestion.get(i).click();
				break;
			}
			System.out.println(AutoSuggestion.get(i).getText());
		}
		

		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}


//selenium
//selenium interview questions
//selenium download
//selenium webdriver
//selenium testing
//selenium architecture
//selenium maven dependency
//selenium ide
//selenium tutorial
//seleniumhq











