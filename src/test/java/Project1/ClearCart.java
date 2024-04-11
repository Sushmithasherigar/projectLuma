package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCart {

	WebDriver driver;
	
	public ClearCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li[1]/div/div/div[3]/div[2]/a")WebElement delete1;
	@FindBy (xpath = "//button[@class='action-primary action-accept']")WebElement ok;
	@FindBy (xpath = "//span[text()='View and Edit Cart']")WebElement clickvieweditcart;
	@FindBy (xpath = "//span[text()='Update Shopping Cart']")WebElement clickupdateshoppingcart;
	@FindBy (xpath = "/html/body/div[2]/main/div[3]/div/div[3]/form/div[1]/table/tbody/tr[2]/td/div/a[3]")WebElement delete2;
	
	public void delete1() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		delete1.click();
		Thread.sleep(2000);
	}
	
	public void ok() throws InterruptedException
	{
		
		ok.click();
		Thread.sleep(2000);
	}
	
	public void clickvieweditcart()
	{
		clickvieweditcart.click();
	}
	
	public void updatequantity() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		Thread.sleep(2000);
		
		WebElement updatequantity = driver.findElement(By.xpath("//input[@class='input-text qty']"));
		Thread.sleep(2000);
		updatequantity.clear();
		Thread.sleep(2000);
		updatequantity.sendKeys("9");
		Thread.sleep(1000);
		
	}
	public void clickupdateshoppingcart()
	{
		clickupdateshoppingcart.click();
	}
	
	public void delete2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		delete2.click();
	}
	
	public void confimemptyshoppingcart() throws InterruptedException
	{
		WebElement confimEmptyShoppingCart = driver.findElement(By.xpath("//p[text()='You have no items in your shopping cart.']"));
		
		if(confimEmptyShoppingCart.isDisplayed())
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
