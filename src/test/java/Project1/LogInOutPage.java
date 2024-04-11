package Project1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOutPage {

	WebDriver driver;
	
	public LogInOutPage(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (name="login[username]") WebElement eid;
	@FindBy (name="login[password]") WebElement pwd;
	@FindBy (xpath="//button[@name='send']")WebElement signin;
	// Account Name
	@FindBy (xpath="//button[@type='button']")WebElement accname;
	
	public void emailid()
	{		
		eid.sendKeys("LunaBender@gmail.com");
	}
	public void password()
	{
		pwd.sendKeys("Luna@09876");
	}
	public void signin()
	{
		signin.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void loggedIn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement welcomeMessage = driver.findElement(By.xpath("//span[text()='My Account']"));
		
		if(welcomeMessage.isDisplayed())
		{
			System.out.println("Successfully Logged In");
		}
		else
		{
			System.out.println("Something Went Wrong While Logging In");
		}
	}
	public void logOut() throws InterruptedException
	{
		Thread.sleep(2000);
		accname.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB); //My Account
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB); //My Wishlist
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB); //Sign Out
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		act.build().perform();
	}
	public void signedOut() throws InterruptedException
	{
		WebElement signedOutMessage = driver.findElement(By.xpath("//span[text()='You are signed out']"));
		
		if(signedOutMessage.isDisplayed())
		{
			System.out.println("Successfully Logged Out");
		}
		else
		{
			System.out.println("Something Went Wrong While Logging Out");
		}
		Thread.sleep(2000);
	}
}
