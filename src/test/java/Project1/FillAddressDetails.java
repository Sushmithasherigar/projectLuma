package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillAddressDetails {

	WebDriver driver;
	
	public FillAddressDetails(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (name = "company")WebElement com;
	@FindBy (name = "street[0]")WebElement street;
	@FindBy (name = "street[1]")WebElement street1;
	@FindBy (name = "street[2]")WebElement street2;
	@FindBy (name = "city")WebElement city;
	@FindBy (name = "postcode")WebElement pin;
	@FindBy (name = "telephone")WebElement phone;
	@FindBy (xpath = "//span[contains(text(), 'Next')]")WebElement next;
	
	public void com() throws InterruptedException
	{
			
		//Zoom Out
		zoomOut(driver, 40);
		Thread.sleep(2000);
		
		com.sendKeys("Link");
		Thread.sleep(1000);
	}
	public void street() throws InterruptedException
	{
		street.sendKeys("Kaggadaspura");
		Thread.sleep(1000);
	}
	public void street1() throws InterruptedException
	{
		street1.sendKeys("Second Cross");
		Thread.sleep(1000);
	}
	public void street2() throws InterruptedException
	{
		street2.sendKeys("Gundappa Layout");
		Thread.sleep(1000);
	}
	public void city() throws InterruptedException
	{
		city.sendKeys("Bengaluru");
		Thread.sleep(1000);
	}
	public void state() throws InterruptedException
	{
		//driver.findElement(state).click();
		WebElement selectstateElement = driver.findElement(By.name("region_id"));
		Select selectstate = new Select(selectstateElement);
		selectstate.selectByVisibleText("New York");
		Thread.sleep(1000);
	}
	public void pin() throws InterruptedException
	{		
		pin.sendKeys("576101");
		Thread.sleep(1000);	
	}
	public void country() throws InterruptedException
	{
		WebElement selectcountryElement = driver.findElement(By.name("country_id"));
		Select selectcountry = new Select(selectcountryElement);
		selectcountry.selectByVisibleText("United States");
		Thread.sleep(1000);
	}
	public void phone() throws InterruptedException
	{
		phone.sendKeys("9087656543");
		System.out.println("Phone Number Entered");
		Thread.sleep(1000);
		
		//Zoom Out
		resetZoom(driver);
		
		Thread.sleep(3000);
		
		System.out.println("Executed");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void shippingmethod() throws InterruptedException
	{
		//Radio Button
		WebElement radio = driver.findElement(By.xpath("//input[@value='flatrate_flatrate']"));
		radio.click();
		Thread.sleep(1000);
		
	}
	public void nextbutton()
	{
		next.click();
	}
	
	public static void zoomOut(WebDriver driver, int zoomFactor) 
	{
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "document.body.style.zoom = '" + zoomFactor + "%'";
        jsExecutor.executeScript(script);
    }
	
	public static void resetZoom(WebDriver driver) 
	{
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "document.body.style.zoom = '100%'";
        jsExecutor.executeScript(script);
	}
}
