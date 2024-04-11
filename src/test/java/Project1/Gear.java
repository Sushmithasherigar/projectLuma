package Project1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gear {

	WebDriver driver;
	
	public Gear(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//span[text()='Gear']")WebElement gear;
	@FindBy (linkText = "Fitness Equipment")WebElement fitnessEquip;
	@FindBy (linkText = "Sprite Foam Roller")WebElement rollerClick;
	
	public void clickgear() throws InterruptedException
	{
		gear.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickfitness() throws InterruptedException
	{		
		fitnessEquip.click();
		Thread.sleep(2000);
	}
	public void rollerclick() throws InterruptedException
	{	
		rollerClick.click();
		Thread.sleep(2000);
	}	
	public void navigate() throws InterruptedException
	{
		 // Navigate back to the previous page
        driver.navigate().back();
        System.out.println("Went To Previous Page");
        Thread.sleep(2000);
		
        //Scroll down
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		//Scroll Up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
        
        // Navigate forward to the next page
        driver.navigate().forward();
        System.out.println("Came Back to Previous Page");
        Thread.sleep(2000);		
	}
	
}
