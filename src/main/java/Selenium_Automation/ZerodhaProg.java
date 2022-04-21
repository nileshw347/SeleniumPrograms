package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.Cancelable;

public class ZerodhaProg {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		String ExpTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActTiltle = driver.getTitle();
		if(ExpTitle.equals(ActTiltle))
			System.out.println("Test case of Title is Pass");
		else
			System.out.println("Test case of Title is fail");
		
		WebElement KiteLogo = driver.findElement(By.xpath("//img[@alt='Kite']"));
		System.out.println("Kite Logo Is Displayed = " + KiteLogo.isDisplayed());
		WebElement ZerodhaLogo = driver.findElement(By.xpath("//img[@alt='Zerodha']"));
		System.out.println("Zerodha Logo Is Displayed = " + ZerodhaLogo.isDisplayed());
		WebElement SignUpLink = driver.findElement(By.xpath("//a[@class='text-light']"));
		System.out.println("Sign Up Link is Enabled = " + SignUpLink.isEnabled());
		WebElement ForgetPass = driver.findElement(By.xpath("//a[@class='text-light forgot-link']"));
		System.out.println("Forget Password Link is Enabled = " + ForgetPass.isEnabled());
		
		WebElement UserId = driver.findElement(By.xpath("//input[@type='text']"));
		UserId.sendKeys("UMC868");
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("nilesh@123");
		Thread.sleep(1000);
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		SubmitBtn.click();
		Thread.sleep(1000);
		
		WebElement Forget2FA = driver.findElement(By.xpath("//a[@class='text-light forgot-link']"));
		System.out.println("Forget Pin Link is Enabled = " + Forget2FA.isEnabled());
		WebElement PinTextBox = driver.findElement(By.xpath("//input[@type='password']"));
		PinTextBox.sendKeys("738727");
		Thread.sleep(1000);
		WebElement ContinueBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		ContinueBtn.click();
		Thread.sleep(2000);
		
		WebElement MyProfile = driver.findElement(By.xpath("//span[@class='user-id']"));
		MyProfile.click();
		Thread.sleep(1000);
		WebElement AccHoldName = driver.findElement(By.xpath("//h4[@class='username']"));
		String ExpName = "Nilesh Ambadas Wankhede";
		String ActName = AccHoldName.getText();
		System.out.println("Expected name is same as Actual name = " + ExpName.equals(ActName));
		WebElement AccHoldEmail = driver.findElement(By.xpath("//div[@class='email']"));
		String ExpEmail = "nileshw347@gmail.com";
		String ActEmail = AccHoldEmail.getText();
		System.out.println("Expected Email is same as Actual Email = " + ExpEmail.equals(ActEmail));
		MyProfile.click();
		Thread.sleep(1000);
		
		WebElement StartInve = driver.findElement(By.xpath("//button[text()='Start investing ']"));
		StartInve.click();
		Thread.sleep(1000);
		WebElement SearchStock = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		SearchStock.sendKeys("tcs");
		Thread.sleep(1000);
		WebElement TCS = driver.findElement(By.xpath("//li[@class='search-result-item selected']"));
		TCS.click();
		Thread.sleep(1000);
		WebElement BuyBtn = driver.findElement(By.xpath("//button[text()='Buy ']"));
		BuyBtn.click();
		Thread.sleep(1000);
		WebElement QtyTextBox = driver.findElement(By.xpath("//input[@step='1']"));
		QtyTextBox.clear();
		QtyTextBox.sendKeys("10");
		Thread.sleep(1000);
		WebElement PriceTextBox = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		PriceTextBox.clear();
		PriceTextBox.sendKeys("3700");
		Thread.sleep(1000);
		WebElement CancelBtn = driver.findElement(By.xpath("//button[@class='button-outline cancel']"));
		CancelBtn.click();
		Thread.sleep(1000);
		WebElement CloseBtn = driver.findElement(By.xpath("//button[text()='Close ']"));
		CloseBtn.click();
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
