package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderWithoutLogin {

	WebDriver driver;
	
	public PlaceOrderWithoutLogin(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy class
	
	@FindBy (linkText = "Sprite Yoga Companion Kit")WebElement selectitem;
	@FindBy (id = "bundle-slide")WebElement custandcart;
	@FindBy (xpath = "//button[@title='Add to Cart']")WebElement add;
	@FindBy (id = "customer-email")WebElement emailid;
	@FindBy (name = "firstname")WebElement firstname;
	@FindBy (name = "lastname")WebElement lastname;
	
	public void selectitem() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/gear/fitness-equipment.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		selectitem.click();
	}
	public void custandcart()
	{
		// Scroll to the button if needed
        WebElement button = custandcart;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	public void addButton() throws InterruptedException
	{		
		//Add to Cart
		WebElement addButton = add;
	    addButton.click();
	    
	    Thread.sleep(5000);
	    
		//Scroll Up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		System.out.println("Scrolled");
	}
	public void myCart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement myCart = driver.findElement(By.xpath("//a[@class='action showcart']"));
		myCart.click();
	}
	public void emailid()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		emailid.sendKeys("Radhashree@gmail.com");
	}
	public void firstname()
	{
		firstname.sendKeys("Radha");
	}
	public void lastname()
	{
		lastname.sendKeys("Shree");
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
		
		WebElement orderNumberElement = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/p[1]"));
        String orderNumber = orderNumberElement.getText();
        System.out.println("Order Number : " + orderNumber);
	}
	
}
