package com.newframework;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pom2.HomePage;
import com.pom2.Loginpage;

public class Baseclass {
	public WebDriver driver;
	public Fetchdata fd=new Fetchdata();
	public WebDriverutilities1 wdu=new WebDriverutilities1();
	
	@BeforeSuite
	public void setup_JDBC_REPORT()
	{
		System.out.println("*****JDBC REPORT DONE******");
	}
	@AfterSuite
	public void setup_JDBC_REPORTclose()
	{
		System.out.println("******JDBC REPORT CLOSE******");
	}
	@BeforeClass
	public void urlenter() throws FileNotFoundException, IOException
	{ String browser=System.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		fd.data("url");
		wdu.pageloadtimeout(driver, 10);
	}
	@AfterClass
	public void closebrowser()
	{ 
		
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws FileNotFoundException, IOException
	{
		Loginpage lp=new Loginpage(driver);
		fd.data("username");
		fd.data("password");
		lp.getSubmitbtn();
	}
	@AfterMethod
	public void signout()
	{
		HomePage hp=new HomePage(driver);
		hp.signoutlink(driver);
	}

}
