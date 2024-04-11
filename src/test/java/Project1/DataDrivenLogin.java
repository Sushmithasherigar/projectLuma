package Project1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataDrivenLogin {

	WebDriver driver;
	
	public DataDrivenLogin(WebDriver idriver)
	{
		this.driver = idriver;
	}
	
	public void dataDrivenLogin() throws IOException 
	{		
		FileInputStream fis = new FileInputStream("C:\\SUSHMITHA\\Selenium\\Project 1\\Logincred.xlsx");
		//FileInputStream is reading the file.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		
		int rows = sheet.getLastRowNum();
		System.out.println("The Number of Total rows : "+rows);
		
		for(int r=1;r<=rows;r++)
		{
			driver.get("https://magento.softwaretestingboard.com/customer/account/login");
			XSSFRow row = sheet.getRow(r);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			
			System.out.println("Username-->"+username+"   Password-->"+password);
			try {
			
			driver.findElement(By.name("login[username]")).sendKeys(username.toString());
			driver.findElement(By.name("login[password]")).sendKeys(password.toString());
			driver.findElement(By.name("send")).click();
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.linkText("Sign Out")).click();
			
			System.out.println("Valid");
			}
			
			catch(Exception e)
			{
				System.out.println("Invalid");
			}
		}
		
	}

}
