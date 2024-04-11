package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacingorderwithExistingAdd {

	WebDriver driver;
	
	public PlacingorderwithExistingAdd(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class	
	
	@FindBy (xpath = "//span[contains(text(), 'Next')]")WebElement next;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/nav/ul/li[1]/a")WebElement clickWhatsNew;
	@FindBy (linkText = "Hero Hoodie")WebElement herohoodie;
	@FindBy (id = "//div[@option-id='52']")WebElement colorgrey;
	@FindBy (xpath = "//span[text()='Add to Cart']")WebElement clickAddToCart;
	@FindBy (xpath = "//a[@class='action showcart']")WebElement clickCart;
	@FindBy (xpath = "/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/button")WebElement checkOut;
	
	
	public void herohoodie()
	{
		herohoodie.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void colorgrey()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	
		colorgrey.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void clickAddtoCart()
	{
		clickAddToCart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	
	public void clickCart() throws InterruptedException
	{
		Thread.sleep(3000);
		clickCart.click();
	}
	
	public void checkOut()
	{
		checkOut.click();
	}
	
		
	public void placingOrderWithExistingAdd() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	
		WebElement radio = driver.findElement(By.xpath("//input[@value='flatrate_flatrate']"));
		radio.click();
		Thread.sleep(1000);
	
		next.click();
	}
	
}
