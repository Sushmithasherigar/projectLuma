package Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

	WebDriver driver;

	public CreateAccount(WebDriver idriver) 
	{		
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (name = "firstname")WebElement fname;
	@FindBy (name = "lastname")WebElement lname;
	@FindBy (name = "email")WebElement email;
	@FindBy (name = "password")WebElement pwd;
	@FindBy (name = "password_confirmation")WebElement cpwd;
	@FindBy (xpath = "//button[@title='Create an Account']")WebElement createaccount;
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	public void enterFirstname()
	{
		fname.sendKeys("KajolT");
	}
	
	public void enterLastname()
	{
		lname.sendKeys("Hebbar");
	}
	
	public void enterEmail()
	{
		email.sendKeys("KajolTHebbar@gmail.com");
	}
	
	public void enterPassword()
	{
		pwd.sendKeys("Kajol@12345");
	}
	
	public void enterConfirmpassword()
	{
		cpwd.sendKeys("Kajol@12345");
	}
	
	public void clickCreateAnAccount() throws InterruptedException
	{
		createaccount.click();
		Thread.sleep(2000);
	}
	
	
}
