package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMultipleItemsTogether 
{

	WebDriver driver;
	
	public OpenMultipleItemsTogether(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	//Repository FindBy Class
	
	@FindBy (xpath = "//span[text()='Men']")WebElement Men;
	@FindBy (xpath = "//a[text()='Tops']")WebElement tops;
	
	public void clickMen()
	{
		Men.click();
	}
	public void clicktop() throws InterruptedException
	{
		tops.click();
		
		Thread.sleep(3000);
		
		List<WebElement> topsLinks = driver.findElements(By.xpath("//ol[@class='products list items product-items']/child::li/child::div/child::a"));
		
		for(int i = 0;i<5;i++)
		{
			topsLinks.get(i).sendKeys(Keys.CONTROL,Keys.RETURN);
		}  
		
		String title = driver.getTitle();
		System.out.println(title);
	}
}

