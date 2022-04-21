package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\SeleniumPrograms\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
//	    Thread.sleep(3000);
//	    driver.navigate().to("https://www.youtube.com/");
//	    Thread.sleep(3000);
//	    driver.navigate().back();
//	    Thread.sleep(3000);
//	    driver.navigate().forward();
//	    Thread.sleep(3000);
//	    driver.navigate().refresh();
//	    Thread.sleep(5000);
	    String Expected = "Google";
	    String Actual = driver.getTitle();
	    if(Expected.equals(Actual))
	    {
	    	System.out.println("Test case pass");
	    }
	    else
	    	System.out.println("Test case fail");
	    driver.close();
	}
}
