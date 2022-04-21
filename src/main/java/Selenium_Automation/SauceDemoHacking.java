package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SauceDemoHacking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
		Thread.sleep(2000);
		
		WebElement AtoZ = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Actions down = new Actions(driver);
		down.moveToElement(AtoZ).click().build().perform();
		Thread.sleep(1000);
//		WebElement LowToHigh = driver.findElement(By.xpath("//option[@value='lohi']"));
		for(int i=0;i<2;i++)
		{
			down.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		down.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		WebElement AddFirst = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		AddFirst.click();
		Thread.sleep(1000);
		WebElement RemoveFirst = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
		RemoveFirst.click();
		Thread.sleep(1000);
		WebElement AddSecond = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		AddSecond.click();
		Thread.sleep(1000);
		
		WebElement AddToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		AddToCart.click();
		Thread.sleep(1000);
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		
		WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		Checkout.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("nilu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("wan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("253469");
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
//		je.executeScript("window.scrollBy(0,100)");
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		
		WebElement Menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		Menu.click();
		Thread.sleep(1000);
		WebElement LogOut = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		LogOut.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
//		--------------------------------------------------------------------------------------------------
		WebElement Username2 = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username2.sendKeys("locked_out_user");
		Thread.sleep(1000);
		WebElement Password2 = driver.findElement(By.xpath("//input[@id='password']"));
		Password2.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement Login2 = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login2.click();
		Thread.sleep(2000);
//		---------------------------------------------------------------------------------------------------
		
		WebElement Error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println("Error messege = " + Error.getText());
		
		String Exp = "Epic sadface: Sorry, this user has been locked out.";
		String Act = Error.getText();
		if(Exp.equals(Act))
		{
			System.out.println("Reached to destination");
		}
		else
		{
			System.out.println("Got the Wrong result");
		}
		
		
		
		
		
		
		
		
		driver.close();
	}
}
