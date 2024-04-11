package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBook {

WebDriver driver;
	
	public AddressBook(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Address Book")WebElement clickaddressbook;
	@FindBy (linkText = "Delete")WebElement delete;
	@FindBy (xpath = "//button[@class='action-primary action-accept']")WebElement ok;
	
	public void clickaddressbook()
	{
		clickaddressbook.click();
	}
	public void deleteadditionaladdress()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		delete.click();
	}
	public void ok() throws InterruptedException
	{
		
		ok.click();
		Thread.sleep(2000);
	}
	public void confirmdelete() throws InterruptedException
	{
		WebElement confimEmptyShoppingCart = driver.findElement(By.xpath("//div[text()='You deleted the address.']"));
		
		if(confimEmptyShoppingCart.isDisplayed())
		{
			System.out.println("Deleted the Address");
		}
		else
		{
			System.out.println("Something Went Wrong! Please check again");
		}
		Thread.sleep(2000);
	}
}
