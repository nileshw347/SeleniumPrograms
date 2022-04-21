package Collection_Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		WebElement SelDrop = driver.findElement(By.xpath("(//button[contains(text(),'Select')])[1]"));
		
		
		Actions drop = new Actions(driver);
		drop.moveToElement(SelDrop).click().build().perform();
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{
		drop.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		}
		drop.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
