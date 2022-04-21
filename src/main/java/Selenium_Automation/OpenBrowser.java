package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
	
		System.getProperty("webdriver.chrome.driver", "C://Users//Lenovo//workspace//SeleniumPrograms//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}
}
