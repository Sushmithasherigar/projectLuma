package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

	WebDriver driver;
	
	public EndToEnd(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (xpath = "//a[@class='logo']")WebElement logo;
	@FindBy (xpath = "//span[text()='Shop New Yoga']")WebElement sny;
	@FindBy (xpath = "//a[contains(text(), 'Dash Digital Watch')]")WebElement digital;
	@FindBy (id = "product-addtocart-button")WebElement add;
	@FindBy (xpath = "//span[@class='counter-number']")WebElement cart;
	@FindBy (xpath = "//span[text()='View and Edit Cart']")WebElement viewcart;
	@FindBy (xpath = "//span[text()= 'Proceed to Checkout']")WebElement pc;
	
	public void clicklogo()
	{
		//Click on Logo
		logo.click();
	}
	

	public void addOneItemToCart() throws InterruptedException
	{
		//Slight scroll
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(100,400)");
		
		//Click on Shop New Yoga
		sny.click();
		Thread.sleep(1000);
		
		//Slight scroll
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(100,400)");
		
		//Click on Sort By Product Name
		WebElement dropdownElement = driver.findElement(By.id("sorter"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Product Name");
		Thread.sleep(1000);
		
		//Slight scroll
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(200,400)");
		
	}
	public void digital() throws InterruptedException
	{
		//Select one Item
		digital.click();
		Thread.sleep(1000);
		
		//Slight scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
	}
	public void addtocart() throws InterruptedException
	{
		//Add to Cart
		add.click();
		Thread.sleep(2000);
		
		//Scroll Up
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,0)");
		
		
	}
	
	public void goToCart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Slight scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
				
		System.out.println("Executed Till Here");	
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//Go to Cart
		cart.click();
	}
	public void viewcart() throws InterruptedException
	{
		
		viewcart.click();
		
		System.out.println("Cart is Displayed");	
		
		Thread.sleep(2000);
	}
	
	public void proceedToCheckout() throws InterruptedException
	{
		//Slight scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		Thread.sleep(2000);
		
		pc.click();
		
		Thread.sleep(2000);
		
	}
	
	
	
}
