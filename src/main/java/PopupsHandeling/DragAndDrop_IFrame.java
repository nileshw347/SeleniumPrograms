package PopupsHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_IFrame {
	
	public static void main(String[]agrs) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Nilesh");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement hTatras = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions dAndD = new Actions(driver);
		dAndD.dragAndDrop(hTatras, trash).build().perform(); 
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys(" Wankhede");
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
