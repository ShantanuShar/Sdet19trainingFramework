package TestScenario1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newframework.AccessProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldata {
	WebDriver driver;
	AccessProperty ap=new AccessProperty();
	@BeforeMethod
	public void exceldata()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void data() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Actions action=new Actions(driver);
		action.moveByOffset(20, 20).click().perform();
		 driver.findElement(By.xpath("//span[text()='From']")).click();
		 
		 
		 driver.findElement(By.xpath("//div[text()='"+ap.getdata(0, 0, "sheet1")+"']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(ap.getdata(0, 0, "sheet1"));
        // driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
         
         driver.findElement(By.xpath("//span[text()='To']")).click();
         driver.findElement(By.xpath("//div[text()='"+ap.getdata(0, 1, "sheet1")+"']")).click();
         //driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(ap.getdata(0, 1, "sheet1"));
        // driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
         
        
         
	}

}
