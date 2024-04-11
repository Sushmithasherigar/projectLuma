package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

WebDriver driver;
	
	public PlaceOrder(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (xpath = "//button[@class='action primary checkout']")WebElement order;
	
	
	public void placeOrder() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
        // Scroll to the button if needed
        WebElement button = order;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);        
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	}
	public void confirmMessage()
	{
        
		WebElement thankYouMessage = driver.findElement(By.xpath("//span[text()='Thank you for your purchase!']"));
		
		if(thankYouMessage.isDisplayed())
		{
			System.out.println("Order is Placed Successfull");
		}
		else
		{
			System.out.println("Something Went Wrong! Please Try Again");
		}
		
		WebElement orderNumberElement = driver.findElement(By.cssSelector(".order-number"));
        String orderNumber = orderNumberElement.getText();
        System.out.println("Order Number : " + orderNumber);
	}
}
