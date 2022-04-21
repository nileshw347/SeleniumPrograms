package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		String expected = "Google";
		String actual = driver.getTitle();
		if(expected.equals(actual))
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case fail");
		driver.close();
	}

}
