package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(3000);
		
		String ExpectedTitle = "Rediff.com";
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Rediff page title test case is pass and title is = " + ActualTitle);
		}
		else
		{
			System.out.println("Rediff page title test case is fail");
		}
		System.out.println("------------------------------------------------------------------------------");
		WebElement PageLink = driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
		WebElement PgLogo = driver.findElement(By.xpath("//img[@alt='Rediff']"));
		WebElement NewUserLable = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement Paragraph1 = driver.findElement(By.xpath("//p[@class='grey1']"));
		WebElement FNameLable = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		WebElement EmailId = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		WebElement Paragraph2 = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
		WebElement NewPass = driver.findElement(By.xpath("//div[text()='New password']"));
		WebElement RetypePass = driver.findElement(By.xpath("//div[text()='Retype password']"));
		WebElement Gender = driver.findElement(By.xpath("//div[text()='Gender:']"));
		WebElement MaleRadio = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement FemaleRadio = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement BirthDate = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
		WebElement DayDropDown = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement MonDropDown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement YrDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement Location = driver.findElement(By.xpath("//div[text()='Location']"));
		WebElement School = driver.findElement(By.xpath("//div[text()='School']"));
		WebElement College = driver.findElement(By.xpath("//div[text()='College']"));
		WebElement CodeImgLable = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
		WebElement SignUp = driver.findElement(By.xpath("//input[@value='Sign up']"));
		WebElement RediffOnTheNetLogo = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		WebElement InvInfoLink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
		WebElement AddWithUs = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement Disclaimer = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement PrivPolicy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement Feedback = driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement TermsOfUse = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		
		int count=0;
		if(PageLink.isDisplayed())
		{
			System.out.println("Rediff page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Rediff page link is not available on web application");
		}
		if(PgLogo.isDisplayed())
		{
			System.out.println("Rediff page logo is available on web application");
			count++;
		}
		else
		{
			System.out.println("Rediff page logo is not available on web application");
		}
		if(NewUserLable.isDisplayed())
		{
			System.out.println("New user name lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("New user name lable is not available on web application");
		}
		if(Paragraph1.isDisplayed())
		{
			System.out.println("Paragraph is available on web application");
			count++;
		}
		else
		{
			System.out.println("Paragraph is not available on web application");
		}
		if(FNameLable.isDisplayed())
		{
			System.out.println("Your first name lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("Your first name lable is not available on web application");
		}
		if(EmailId.isDisplayed())
		{
			System.out.println("Email Id lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("Email Id lable is not available on web application");
		}
		if(Paragraph2.isDisplayed())
		{
			System.out.println("Eg Paragraph of email is available on web application");
			count++;
		}
		else
		{
			System.out.println("Eg Paragraph of email is not available on web application");
		}
		if(NewPass.isDisplayed())
		{
			System.out.println("New Password lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("New Password lable is not available on web application");
		}
		if(RetypePass.isDisplayed())
		{
			System.out.println("Retype Password lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("Retype Password lable is not available on web application");
		}
		if(Gender.isDisplayed())
		{
			System.out.println("Gender lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("Gender lable is not available on web application");
		}
		if(MaleRadio.isDisplayed())
		{
			System.out.println("Male radio is available on web application");
			count++;
		}
		else
		{
			System.out.println("Male radio is not available on web application");
		}
		if(FemaleRadio.isDisplayed())
		{
			System.out.println("Female radio is available on web application");
			count++;
		}
		else
		{
			System.out.println("Female radio is not available on web application");
		}
		if(BirthDate.isDisplayed())
		{
			System.out.println("Date of Birth is available on web application");
			count++;
		}
		else
		{
			System.out.println("Date of Birth is not available on web application");
		}
		if(DayDropDown.isDisplayed())
		{
			System.out.println("Day drop down is available on web application");
			count++;
		}
		else
		{
			System.out.println("Day drop down is not available on web application");
		}
		if(MonDropDown.isDisplayed())
		{
			System.out.println("Month drop down is available on web application");
			count++;
		}
		else
		{
			System.out.println("Month drop down is not available on web application");
		}
		if(YrDropDown.isDisplayed())
		{
			System.out.println("Year drop down is available on web application");
			count++;
		}
		else
		{
			System.out.println("Year drop down is not available on web application");
		}
		if(Location.isDisplayed())
		{
			System.out.println("Location lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("Location lable is not available on web application");
		}
		if(School.isDisplayed())
		{
			System.out.println("School lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("School lable is not available on web application");
		}
		if(College.isDisplayed())
		{
			System.out.println("College lable is available on web application");
			count++;
		}
		else
		{
			System.out.println("College lable is not available on web application");
		}
		if(CodeImgLable.isDisplayed())
		{
			System.out.println("Enter the code given in the above image is available on web application");
			count++;
		}
		else
		{
			System.out.println("Enter the code given in the above image is not available on web application");
		}
		if(SignUp.isDisplayed())
		{
			System.out.println("Signup botton is available on web application");
			count++;
		}
		else
		{
			System.out.println("Signup botton is not available on web application");
		}
		if(RediffOnTheNetLogo.isDisplayed())
		{
			System.out.println("Rediff On The Net Logo is available on web application");
			count++;
		}
		else
		{
			System.out.println("Rediff On The Net Logo is not available on web application");
		}
		if(InvInfoLink.isDisplayed())
		{
			System.out.println("Investor information page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Investor information page link is not available on web application");
		}
		if(AddWithUs.isDisplayed())
		{
			System.out.println("Advertise with us page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Advertise with us page link is not available on web application");
		}
		if(Disclaimer.isDisplayed())
		{
			System.out.println("Disclaimer page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Disclaimer page link is not available on web application");
		}
		if(PrivPolicy.isDisplayed())
		{
			System.out.println("Privacy policy page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Privacy policy page link is not available on web application");
		}
		if(Feedback.isDisplayed())
		{
			System.out.println("Feedback page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Feedback page link is not available on web application");
		}
		if(TermsOfUse.isDisplayed())
		{
			System.out.println("Terms of use page link is available on web application");
			count++;
		}
		else
		{
			System.out.println("Terms of use page link is not available on web application");
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Total counted elements = " + count);
		int ExpectedElements = 28;
		int ActualElement = count;
		if(ExpectedElements==ActualElement)
		{
			System.out.println("Sanity Testing of checking total elements on Rediff Webpage is pass.");
		}
		else
		{
			System.out.println("Sanity Test is failed");
		}
		
		driver.close();
	}
}
