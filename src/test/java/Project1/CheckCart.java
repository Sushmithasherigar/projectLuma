package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckCart {

WebDriver driver;
	
	public CheckCart(WebDriver idriver) 
	{
		
		driver = idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Repository FindBy Class
	
	@FindBy (xpath = "//a[text()='Women']")WebElement clickwomen;
	@FindBy (xpath = "//a[text()='Jackets']")WebElement clickjacket ; 
	@FindBy (linkText = "Jade Yoga Jacket")WebElement clickjadejacket;
	@FindBy (xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[2]/button")WebElement addtocart;
	@FindBy (linkText = "shopping cart")WebElement clickshoppingcart;
	
	@FindBy (xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]") WebElement signin;
	
	public void clickwomen()
	{
		clickwomen.click();
	}
	public void clickjacket()
	{
		
		clickjacket.click();
	}
	public void clickjadejacket()
	{
		clickjadejacket.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void shoppingCart() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		clickshoppingcart.click();
	}
	public void confirmWelcomeMessage() throws InterruptedException
	{
		
		//Confirm Shopping Cart Page
		WebElement welcomeMessage = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
		
		if(welcomeMessage.isDisplayed())
		{
			System.out.println("You are in Shopping Cart Page");
		}
		else
		{
			System.out.println("Please try again");
		}
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		
		Thread.sleep(1000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0,0)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void signin()
	{
		signin.click();
	}
	
}
