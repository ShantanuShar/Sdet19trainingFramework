package TestScenario1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newframework.AutoConstants1;
import com.newframework.Fetchdata;
import com.newframework.WebDriverutilities1;
import com.pom1.CreateOrganisation;
import com.pom1.Createneworganisation;
import com.pom1.HomePage;
import com.pom1.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1vtiger  {
	WebDriver driver;
	Fetchdata fd=new Fetchdata();
	WebDriverutilities1 wdu=new WebDriverutilities1();
	@BeforeMethod
	public void Test1() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fd.data("url"));
		driver.manage().timeouts().implicitlyWait(AutoConstants1.time, TimeUnit.SECONDS);
	}
	
	
		
	@Test
	public void Testmore() throws FileNotFoundException, IOException
	{
	
		LoginPage lp=new LoginPage(driver);
		lp.loginbutton(fd.data("username"), fd.data("password"));
		
		HomePage hp=new HomePage(driver);
		hp.homepage();
		
		CreateOrganisation co=new CreateOrganisation(driver);
		co.createorganisation();
		
		Createneworganisation cno=new Createneworganisation(driver);
				cno.createneworganisation(fd.data("name"));
			Set<String> s=driver.getWindowHandles();
			s.size();
			Iterator<String> it = s.iterator();
			while(it.hasNext())
			{
				 String window=it.next();
				  String title=driver.switchTo().window(window).getTitle();
				  System.out.println(title);
			}
			
	}
	
	

}
