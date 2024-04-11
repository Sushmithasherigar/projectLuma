package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickEmptyCart {

	WebDriver driver;
	
	public ClickEmptyCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@id='mode-list']")WebElement clickonlist;
	@FindBy (linkText = "Luma Analog Watch")WebElement clicklumowatch;
	@FindBy (xpath = "//span[text()='Add to Cart']")WebElement addtocart;
	@FindBy (xpath = "/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/div[2]/div[2]/a")WebElement cartclear;
	@FindBy (xpath = "//html/body/div[3]/aside[2]/div[2]/footer/button[2]")WebElement ok;
	@FindBy (xpath = "//a[@class='action showcart']")WebElement gotocart;
	
	public void geararrow() throws InterruptedException
	{
		WebElement geararrow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/nav/ul/li[4]/a/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(geararrow).build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void watches()
	{
		
		WebElement watches = driver.findElement(By.xpath("//span[text()='Watches']"));
		Actions act = new Actions(driver);
		act.moveToElement(watches).build().perform();
		watches.click();	
	}
	public void clickonlist() throws InterruptedException
	{
		clickonlist.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,550)");
		
		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,850)");
		
		Thread.sleep(1000);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1000)");
	
		Thread.sleep(1000);
		
	}
	public void clicklumowatch()
	{
		clicklumowatch.click();
		
	}
	public void addtocart() throws InterruptedException
	{
		addtocart.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
	}
	public void gotocart() throws InterruptedException
	{
		Thread.sleep(1000);
		gotocart.click();
		
	}
	public void cartClear() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		cartclear.click();
		Thread.sleep(2000);
		
	}
	public void ok() throws InterruptedException
	{
		ok.click();
		Thread.sleep(2000);
	}
	
	public void confimemptycart() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement confimEmptyCart = driver.findElement(By.xpath("//strong[text()='You have no items in your shopping cart.']"));
		
		if(confimEmptyCart.isDisplayed())
		{
			System.out.println("Deleted all the Items");
		}
		else
		{
			System.out.println("Something Went Wrong! Please check again");
		}
		Thread.sleep(2000);
	}
	
}
