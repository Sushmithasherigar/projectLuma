package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotResetPassword {

	WebDriver driver;
	
	public ForgotResetPassword(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (name = "login[username]")WebElement eid;
	@FindBy (linkText = "Forgot Your Password?")WebElement forgot;
	@FindBy (name = "email")WebElement email;
	@FindBy (xpath = "//span[text()='Reset My Password']")WebElement resetpass;
	
	public void eid() throws InterruptedException
	{
//		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		eid.sendKeys("sushmithakarthik1529@gmail.com");
		Thread.sleep(1000);
	}
	public void forgot()
	{
		forgot.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void emailid()
	{
		//Enter Email ID
		email.sendKeys("sushmithakarthik1529@gmail.com");
	}
	public void resetpass()
	{
		resetpass.click();
	}
		
	public void confirmAlert()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement alertMessage = driver.findElement(By.xpath("//div[@class='message-success success message']"));
		
		if(alertMessage.isDisplayed())
		{
			System.out.println("Mail Has Been Sent To Your Given Email ID");
		}
		else
		{
			System.out.println("Please Try Again! Something Went Wrong");
		}
	}
}
