package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newframework.Fetchdata;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerPractice1 {
	WebDriver driver;
	Fetchdata fd=new Fetchdata();
	@BeforeMethod
	public void urlprocess() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fd.data("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void nextprocess() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(fd.data("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(fd.data("password"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	 String attribute = driver.findElement(By.xpath("//img[@title='Open Calendar...']")).getAttribute("title");
	 System.out.println(attribute);
	}

}
