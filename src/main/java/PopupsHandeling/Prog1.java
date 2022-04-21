package PopupsHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		WebElement OpenPopup = driver.findElement(By.xpath("//input[@onclick='OpenPopup()']"));
		OpenPopup.click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String Win[] = new String[10];
		System.out.println("Total windows = " + windows.size());
		
		
		
		
		
		
		
		driver.close();	
	}
}
