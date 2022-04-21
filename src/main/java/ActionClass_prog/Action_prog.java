package ActionClass_prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_prog {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		System.out.println(driver.getTitle());
		String ExpTitle = "IRCTC Login | IRCTC Registration | Create IRCTC Account - RailYatri";
		String ActTitle = driver.getTitle();
		if(ExpTitle.equals(ActTitle))
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case fail");
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username-id']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='usr_pwd']"));
		WebElement SeePass = driver.findElement(By.xpath("//img[@class='field-icon toggle-password']"));
		WebElement ConfPass = driver.findElement(By.xpath("//input[@id='cnfm_pass']"));
		WebElement MoNumber = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='email_id']"));
		WebElement SecDropDown = driver.findElement(By.xpath("(//button[contains(text(),'Select')])[1]"));
		WebElement SecAns = driver.findElement(By.xpath("//input[@id='sec_ans_field']"));
		
		FileInputStream file = new FileInputStream("E:\\software testing videos\\Automation\\Automation setup files\\eclipse\\JavaAndSelenium\\Excel\\Railyatri acc details.xlsx");
		Sheet RailDetail = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Username.sendKeys(RailDetail.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		Password.sendKeys(RailDetail.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		SeePass.click();
		Thread.sleep(1000);
		SeePass.click();
		Thread.sleep(1000);
		ConfPass.sendKeys(RailDetail.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		MoNumber.sendKeys(RailDetail.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		Email.sendKeys(RailDetail.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		
		Actions Drop = new Actions(driver);
		Drop.moveToElement(SecDropDown).click().build().perform();
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{
			Drop.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		Drop.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		SecAns.sendKeys(RailDetail.getRow(0).getCell(4).getStringCellValue());
		
		WebElement Continue = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		Continue.click();
		Thread.sleep(5000);
		
		WebElement FirName = driver.findElement(By.xpath("//input[@id='f_name_field']"));
		FirName.sendKeys("Nilesh");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='l_name_field']"));
		LastName.sendKeys("Wankhede");
		driver.findElement(By.xpath("//input[@id='dob_field']")).click();
//		DOB.sendKeys(RailDetail.getRow(0).getCell(5).getStringCellValue());
		driver.findElement(By.xpath("//th[contains(text(),'March 2004')]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//th[contains(text(),'2004')])[2]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//th[contains(text(),'«')])[3]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'1998')]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Jul')]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(text(),'20')]")).click();;
		
		
		//th[contains(text(),'March 2004')]
//		(//th[contains(text(),'2004')])[2]
//		(//th[contains(text(),'«')])[3]
		//span[contains(text(),'1998')]
		//span[contains(text(),'Jul')]
		//td[contains(text(),'20')]
//		/html/body/div[4]/div[3]/form/div[2]/div/div/div/div[3]/input
		
		Thread.sleep(2000);
		driver.close();
	}
}
