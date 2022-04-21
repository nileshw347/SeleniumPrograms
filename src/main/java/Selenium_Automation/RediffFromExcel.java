package Selenium_Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class RediffFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);
		
		WebElement FullName = driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]"));
		WebElement RediffId = driver.findElement(By.xpath("(//input[contains(@name,'login')])[1]"));
		WebElement Password = driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]"));
		WebElement RePassword = driver.findElement(By.xpath("(//input[contains(@name,'confirm_passwd')])[1]"));
		WebElement AlterMail = driver.findElement(By.xpath("(//input[contains(@name,'altemail')])[1]"));
		WebElement MoNum = driver.findElement(By.xpath("(//input[contains(@name,'mobno')])[1]"));
		WebElement DayDrop = driver.findElement(By.xpath("(//select[contains(@name,'DOB_Day')])[1]"));
		WebElement MonthDrop = driver.findElement(By.xpath("(//select[contains(@name,'DOB_Month')])[1]"));
		WebElement YearDrop = driver.findElement(By.xpath("(//select[contains(@name,'DOB_Year')])[1]"));
		WebElement Gender = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement CountryDrop = driver.findElement(By.xpath("//select[contains(@name,'country')]"));
		WebElement CityDrop = driver.findElement(By.xpath("//select[contains(@name,'city')]"));
		WebElement Captcha = driver.findElement(By.xpath("//input[@class='captcha']"));
		
		FileInputStream file = new FileInputStream("E:\\software testing videos\\Automation\\Automation setup files\\eclipse\\JavaAndSelenium\\Excel\\Book1.xlsx");
		Sheet Excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String Value1 = Excel.getRow(0).getCell(0).getStringCellValue();
		String Value2 = Excel.getRow(0).getCell(1).getStringCellValue();
		String Value3 = Excel.getRow(0).getCell(2).getStringCellValue();
		String Value4 = Excel.getRow(0).getCell(4).getStringCellValue();
		String Value5 = Excel.getRow(0).getCell(5).getStringCellValue();
		String Value6 = Excel.getRow(0).getCell(6).getStringCellValue();
		String Value7 = Excel.getRow(0).getCell(7).getStringCellValue();
		String Value8 = Excel.getRow(0).getCell(8).getStringCellValue();
		String Value9 = Excel.getRow(0).getCell(9).getStringCellValue();
		String Value10 = Excel.getRow(0).getCell(10).getStringCellValue();
		String Value11 = Excel.getRow(0).getCell(11).getStringCellValue();
		
		FullName.sendKeys(Value1);
		Thread.sleep(2000);
		RediffId.sendKeys(Value2);
		Thread.sleep(2000);
		Password.sendKeys(Value3);
		Thread.sleep(2000);
		RePassword.sendKeys(Value3);
		Thread.sleep(2000);
		AlterMail.sendKeys(Value4);
		Thread.sleep(2000);
		MoNum.sendKeys(Value5);
		Thread.sleep(2000);
		Select s = new Select(DayDrop);
		s.selectByVisibleText(Value6);
		Thread.sleep(1000);
		Select s2 = new Select(MonthDrop);
		s2.selectByVisibleText(Value7);
		Thread.sleep(1000);
		Select s3 = new Select(YearDrop);
		s3.selectByVisibleText(Value8);
		Thread.sleep(2000);
		Gender.click();
		Thread.sleep(2000);
		Select s4 = new Select(CountryDrop);
		s4.selectByVisibleText(Value9);	
		Thread.sleep(2000);
		Select s5 = new Select(CityDrop);
		s5.selectByVisibleText(Value10);
		Thread.sleep(2000);
		Captcha.sendKeys(Value11);
		Thread.sleep(3000);
		
		
		
		driver.close();
	}
}
