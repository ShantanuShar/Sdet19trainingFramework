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

public class Amazon {
	WebDriver driver;
	Fetchdata fd=new Fetchdata();
	@BeforeMethod
	public void urlprocess() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void amazonscenario()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 15000");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_2']")).click();
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		
		StringBuffer sb=new StringBuffer(text);
		sb.deleteCharAt(2);
		String newtext=new String(sb);
		int actualtext=Integer.parseInt(newtext);
		int expectedtext=15000;
		
		if(actualtext<expectedtext)
		{
			System.out.println("true");
		
			
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
