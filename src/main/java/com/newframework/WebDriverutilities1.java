package com.newframework;


	import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class WebDriverutilities1 {
		
		public void movetoelement(WebDriver driver,WebElement target)
		{
			Actions action=new Actions(driver);
			action.moveToElement(target).perform();
		}
		public void rightclick(WebElement target, WebDriver driver)
		{
			Actions action=new Actions(driver);
			action.contextClick(target).click();
			
		}
		public void dd(WebElement target1,int index)
		{
			Select s=new Select(target1);
		s.selectByIndex(index);
		}
		public void dd(WebElement target2,String text)
		{
			Select s=new Select(target2);
		s.selectByVisibleText(text);
		}
		public void dd(String t,WebElement target3)
		{
			Select s=new Select(target3);
		s.selectByValue(t);
		}
		public void doublet(WebDriver driver, WebElement target)
		{
			Actions action=new Actions(driver);
			action.doubleClick(target).perform();
		}
		public void switchingframe(WebDriver driver,int id)
		{
			 driver.switchTo().frame(id);
		}
		public void switchTabs(WebDriver driver,String title)
		{
			 Set<String> windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			while(it.hasNext())
			{
				String window=it.next();
				  String title1= driver.switchTo().window(window).getTitle();
				  if(title1.equals(title1))
				  {
					  break;
				  }
			}
		}
		public void pageloadtimeout(WebDriver driver,int time)
		{
			driver.manage().timeouts().pageLoadTimeout(AutoConstants1.time,TimeUnit.SECONDS);
		}
		public void switchparentframe(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		/**
		 * @author super
		 * 
		 * @param driver
		 */
		public void alertpopup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		public String propertydata(String key) throws FileNotFoundException, IOException
		{
			Fetchdata f=new Fetchdata();
			return f.data(key);
			
		}
		
		
		
		
		
	}



