package com.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newframework.WebDriverutilities1;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement morelink;
	
	@FindBy(xpath="//a[@name='Purchase Order']")
	private WebElement purchaseorderlink;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutlink;
	
	@FindBy(xpath="//a[text()='edit']")
	private WebElement editlink;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement masseditbtn;
	
	@FindBy(xpath="//input[@name='selected_id']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebton;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttextfld;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getPurchaseorderlink() {
		return purchaseorderlink;
	}

	
	
	public void purchaseorder(WebDriver driver, String subject)
	{
		WebDriverutilities1 utilities=new WebDriverutilities1();
		utilities.movetoelement(driver, morelink);
		editlink.click();
		purchaseorderlink.click();
		checkbox.click();
		masseditbtn.click();
		cancelbtn.click();
		subjecttextfld.sendKeys(subject);
		savebton.click();
		
		
	}
	
	public void signoutlink(WebDriver driver)
	{
		WebDriverutilities1 wdu=new WebDriverutilities1();
		wdu.movetoelement(driver, morelink);
		wdu.movetoelement(driver, administrator);
	}

	public WebElement getSignoutlink() {
		return logoutlink;
	}

	public WebElement getEditlink() {
		return editlink;
	}

	public WebElement getMasseditbtn() {
		return masseditbtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getSavebton() {
		return savebton;
	}

	public WebElement getSubjecttextfld() {
		return subjecttextfld;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getAdministrator() {
		return administrator;
	}
	
	

}
