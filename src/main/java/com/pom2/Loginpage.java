package com.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametxtfld;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtxtfld;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement submitbtn;

	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}
	public void login(String username, String password)
	{
		usernametxtfld.sendKeys(username);
		passwordtxtfld.sendKeys(password);
		submitbtn.click();
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
			

}
