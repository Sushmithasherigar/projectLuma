package Project1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MultipleItemsToCart {

	WebDriver driver;
	
	public MultipleItemsToCart(WebDriver idriver) 
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (xpath = "//span[text()='Women']")WebElement women;
	@FindBy (xpath = "//a[text()='Tops']")WebElement tops;
	@FindBy (xpath = "//div[text()='L']")WebElement size;
	@FindBy (id = "option-label-color-93-item-59")WebElement colorw;
	@FindBy (xpath = "//a[text()='Jackets']")WebElement jackets;
	@FindBy (linkText = "Juno Jacket")WebElement selectjacket;
	@FindBy (xpath = "//div[text()='XS']")WebElement sizem;
	@FindBy (id = "option-label-color-93-item-53")WebElement colorg;
	@FindBy (xpath = "//*[@id=\"product_addtocart_form\"]/div[2]/div/div/div[2]")WebElement addtocart;
	@FindBy (xpath = "/html/body/div[2]/header/div[2]/div[1]/a/span[2]")WebElement cart;
	
	public void clickwomen()
	{
		women.click();
	}
	public void topsWomen()
	{
		tops.click();
		
		WebElement tees = driver.findElement(By.xpath("//a[@class='product photo product-item-photo']"));
		
		tees.click();
	}
	
	public void addSizeL()
	{
		size.click();
	}
	public void colorWhite()
	{
		colorw.click();
	}
	public void addCart() throws InterruptedException
	{
		//driver.findElement(addCart).click();
		// Find the button element
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        WebElement button = driver.findElement(By.id("product-addtocart-button"));

        // Scroll the page so that the button is in view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
       
        // Click the button
        button.click();
        
        Thread.sleep(1000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
        
	}
	public void jackets()
	{
		jackets.click();
	}
	public void selectJacket()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		
		selectjacket.click();
	}
	public void sizeM()
	{
		sizem.click();
	}
	public void colorGreen()
	{
		colorg.click();
	}
	public void quantity() throws InterruptedException 
	{
		WebElement quantityFeild = driver.findElement(By.name("qty"));
		quantityFeild.clear();
		quantityFeild.sendKeys("2");
				
		Thread.sleep(10000);		
		
		addtocart.click();

		System.out.println("Added to cart");
	
	}
	
	public void cart() throws InterruptedException
	{
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		
		cart.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,120)");
	}
	
	public void checkCartItem() throws InterruptedException
	{
		WebElement checkcartitem = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[1]/span[2]"));
		
		if(checkcartitem.isDisplayed())
		{
			System.out.println("Cart Item is displayed");
		}
		else
		{
			System.out.println("Something Went Wrong");
		}
		Thread.sleep(2000);
		
		WebElement itemNumberElement = driver.findElement(By.cssSelector(".items-total"));
        String itemNumber = itemNumberElement.getText();
        System.out.println("Item Number : " + itemNumber);
       // assertEquals(itemNumber, "3");

	}
	
	
}
