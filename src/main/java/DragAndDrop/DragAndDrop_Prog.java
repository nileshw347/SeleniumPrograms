package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Prog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement Bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		WebElement Ele5000 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']//a[@class='button button-orange'])[1]"));
		WebElement Sale = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
		WebElement El5000 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']//a[@class='button button-orange'])[2]"));
		WebElement AccDeb = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']//li"));
		WebElement AmtDeb = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable']//li)[1]"));
		WebElement AccCred = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']//li"));
		WebElement AmtCred = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable']//li)[2]"));
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);  //This method is for page Scrolling down
		je.executeScript("window.scrollBy(0,1000)");           //Where javascriptExecutor is a interface
		Thread.sleep(2000);
		
		Actions DragDrop = new Actions(driver);
		
		DragDrop.moveToElement(Bank).clickAndHold().moveToElement(AccDeb).release().build().perform();
		Thread.sleep(2000);
		DragDrop.moveToElement(Ele5000).clickAndHold().moveToElement(AmtDeb).release().build().perform();
		Thread.sleep(2000);
		DragDrop.moveToElement(Sale).clickAndHold().moveToElement(AccCred).release().build().perform();
		Thread.sleep(2000);
		DragDrop.moveToElement(El5000).clickAndHold().moveToElement(AmtCred).release().build().perform();
		Thread.sleep(2000);
		
		WebElement Perfect = driver.findElement(By.xpath("//div[@class='table4_result']//a[@class='button button-green']"));
		String Exp = "Perfect!";
		String Act = Perfect.getText();
		if(Exp.equals(Act))
		{
			System.out.println("Drag and Drop test case Pass");
		}
		else
		{
			System.out.println("Drag and Drop test case Fail");
		}
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
