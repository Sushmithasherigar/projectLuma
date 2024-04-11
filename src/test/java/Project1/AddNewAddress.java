package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddress {

WebDriver driver;
	
	public AddNewAddress(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Shorts")WebElement shorts;
	@FindBy (linkText = "Ana Running Short")WebElement runningshorts;
	@FindBy (xpath = "//div[text()='29']")WebElement size;
	@FindBy (xpath = "//div[@id='option-label-color-93-item-49']")WebElement colorblack;
	@FindBy (xpath = "//span[text()='New Address']")WebElement newaddress;
	@FindBy (name = "company")WebElement company;
	@FindBy (name = "street[0]")WebElement street;
	@FindBy (name = "street[1]")WebElement street1;
	@FindBy (name = "street[2]")WebElement street2;
	@FindBy (name = "city")WebElement city;
	@FindBy (name = "postcode")WebElement pin;
	@FindBy (name = "telephone")WebElement telephone;
	@FindBy (xpath = "//span[text()='Ship here']")WebElement shiphere;
	
	public void shorts()
	{
		shorts.click();
	}
	public void runningshorts()
	{
		runningshorts.click();
	}	
	public void size()
	{
		size.click();
	}
	public void colorblack()
	{
		colorblack.click();
	}
	public void newaddress()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		newaddress.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void company() throws InterruptedException
	{
		company.sendKeys("Kia");
		Thread.sleep(1000);
	}
	public void street() throws InterruptedException
	{
		street.sendKeys("3rd Main");
		Thread.sleep(1000);
	}
	public void street1() throws InterruptedException
	{
		street1.sendKeys("2nd Cross");
		Thread.sleep(1000);
	}
	public void street2() throws InterruptedException
	{
		street2.sendKeys("RR Nagar");
		Thread.sleep(1000);
	}
	public void city() throws InterruptedException
	{
		city.sendKeys("Bengaluru");
		Thread.sleep(1000);
	}
	public void state() throws InterruptedException
	{
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
		telephone.sendKeys("9087656543");
		System.out.println("Phone Number Entered");
		Thread.sleep(1000);
	}
	public void shipherebutton() throws InterruptedException
	{
		shiphere.click();
		Thread.sleep(1000);
	}
	public void shippingmethod() throws InterruptedException 
	{
				
		//Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='ko_unique_4']"));
		radio.click();
		Thread.sleep(1000);
	}

}
