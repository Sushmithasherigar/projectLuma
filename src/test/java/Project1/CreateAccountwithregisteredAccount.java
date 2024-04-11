package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountwithregisteredAccount {

WebDriver driver;
	
	public CreateAccountwithregisteredAccount(WebDriver idriver) 
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
	
	public void fname()
	{
		fname.sendKeys("Luna");
	}
	public void lname()
	{
		lname.sendKeys("Bender");
	}
	public void email()
	{
		email.sendKeys("LunaBender@gmail.com");
	}
	public void pwd()
	{
		pwd.sendKeys("Luna@09876");
	}
	public void cpwd()
	{
		cpwd.sendKeys("Luna@09876");
	}
	public void createaccount()
	{
		createaccount.click();
	}
	public void confirmMessage()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement welcomeMessage = driver.findElement(By.xpath("//div[@class='message-error error message']"));
		
		if(welcomeMessage.isDisplayed())
		{
			System.out.println("There is already an account with this email address");
		}
		else
		{
			System.out.println("Logged In Successfully");
		}
	}
	
	
}
