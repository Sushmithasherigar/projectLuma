package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAddress {
	
WebDriver driver;
	
	public AddAddress(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Address Book")WebElement clickaddressbook;
	@FindBy (xpath = "//span[text()='Add New Address']")WebElement addnewaddress;
	@FindBy (name = "company")WebElement company;
	@FindBy (name = "telephone")WebElement phone;
	@FindBy (id = "street_1")WebElement street;
	@FindBy (id = "street_2")WebElement street1;
	@FindBy (id = "street_3")WebElement street2;
	@FindBy (name = "city")WebElement city;
	@FindBy (name = "postcode")WebElement pin;
	@FindBy (xpath = "//span[text()='Save Address']")WebElement saveaddress;
	
	public void clickaddressbook() throws InterruptedException
	{
		clickaddressbook.click();
		Thread.sleep(1000);
	}
	public void addnewaddress() throws InterruptedException
	{
		addnewaddress.click();
		Thread.sleep(1000);
	}
	public void company() throws InterruptedException
	{
		company.sendKeys("Bosch");
		Thread.sleep(1000);
	}
	public void phone() throws InterruptedException
	{
		phone.sendKeys("8907678909");
		Thread.sleep(1000);
	}
	public void street() throws InterruptedException
	{
		street.sendKeys("4th cross");
		Thread.sleep(1000);
	}
	public void street1() throws InterruptedException
	{
		street1.sendKeys("KK Road");
		Thread.sleep(1000);
	}
	public void street2() throws InterruptedException
	{
		street2.sendKeys("Kalyan Nagar");
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
	public void saveaddress()
	{
		saveaddress.click();
	}
	public void confirmsavedadd() throws InterruptedException
	{
		WebElement confirmsavedadd = driver.findElement(By.xpath("//div[text()='You saved the address.']"));
		
		if(confirmsavedadd.isDisplayed())
		{
			System.out.println("Added the Address");
		}
		else
		{
			System.out.println("Something Went Wrong! Please check again");
		}
		Thread.sleep(2000);
	}

}
