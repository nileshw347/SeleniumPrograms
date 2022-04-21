package PopupsHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Handle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driber", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
//		there are three ways to switch frame
//		1st way --> By Attribute Value
	  //driver.switchTo().frame("iframeResult");
		
//		2nd way --> By WebElement 
	    WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	    driver.switchTo().frame(frame);
		
//		3rd way --> By Index of Iframe
	  //driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
//		return on Parent/Main Frame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
