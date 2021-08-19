package TestScenario1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newframework.Fetchdata;
import com.newframework.WebDriverutilities1;
import com.pom2.HomePage;
import com.pom2.Loginpage;
import com.pom2.NewpurchaseorderdetailsPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Testscript_36 {
	WebDriver driver;
	Fetchdata fd=new Fetchdata();
	WebDriverutilities1 wdu=new WebDriverutilities1();
	
	@BeforeMethod
	public void Testurllogin() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fd.data("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Testscenario() throws FileNotFoundException, IOException, InterruptedException
	{
	
		Loginpage lp=new Loginpage(driver);
		lp.login(fd.data("username"), fd.data("password"));
		
		HomePage hp=new HomePage(driver);
		//hp.purchaseorder(driver);
		hp.getMorelink().click();
		hp.getPurchaseorderlink().click();
		hp.getEditlink().click();
		
		NewpurchaseorderdetailsPage npo=new NewpurchaseorderdetailsPage(driver);
		npo.getCancelbtn().click();
		
		
		
		
	}
}
