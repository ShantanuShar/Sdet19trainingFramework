package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametxtfld;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtxtfld;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement Loginlink;

	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}
	
	public void loginbutton(String username, String password)
	{
		
		usernametxtfld.sendKeys(username);
		passwordtxtfld.sendKeys(password);
		Loginlink.click();
	}

}
