package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInNegative {

	WebDriver driver;
	
	public LogInNegative(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (name = "login[username]")WebElement eid;
	@FindBy (name = "login[password]")WebElement pwd;
	@FindBy (xpath = "//button[@name='send']")WebElement signin;
	
	public void eid() throws InterruptedException
	{
		eid.sendKeys("PaiGanesh@gmail.com");
		Thread.sleep(2000);
	}
	public void pwd() throws InterruptedException
	{		
		pwd.sendKeys("GaneshPai");
		Thread.sleep(2000);
	}
	public void signin()
	{		
		signin.click();	
	}
	
	public void incorrectAccount()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement alertMessage = driver.findElement(By.xpath("//div[@class='message-error error message']"));
		
		if(alertMessage.isDisplayed())
		{
			System.out.println("Please Enter Registered Credentials");
		}
		else
		{
			System.out.println("Please Try Again");
		}
	}
}
