package Project1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.io.Files;

public class MyOrder {

	WebDriver driver;
	
	public MyOrder(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	//Repository FindBy Class
	
	@FindBy (xpath = "//a[text()='My Orders']")WebElement clickmyorder; 
	@FindBy (xpath = "//span[text()='View Order']")WebElement vieworder;
	
	
	public void clickMyOrder() 
	{
		clickmyorder.click();
	}
	public void vieworder() throws IOException
	{
		vieworder.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,560)");
		
		//Take ScreenShot
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\SUSHMITHA\\Selenium\\SampleScreenshot.jpg"));

	}
}
