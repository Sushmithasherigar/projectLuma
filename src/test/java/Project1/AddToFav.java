package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToFav {
	
	WebDriver driver;

	public AddToFav(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);		
	}
	
	//Repository By Class
	
	@FindBy (linkText = "Pants")WebElement pants; 
	@FindBy (linkText = "Aether Gym Pant")WebElement gympant;
	@FindBy (xpath = "//span[text()='Add to Wish List']")WebElement wishlist;
	
	public void pants()
	{
		pants.click();
	}
	public void gympant()
	{
		gympant.click();
	}
	public void wishlist()
	{
		wishlist.click();
	}
	public void item()
	{
		WebElement itemElement = driver.findElement(By.cssSelector(".toolbar-number"));
		String itemNumber = itemElement.getText();
		System.out.println("Order Number : " + itemNumber);
	}
}
