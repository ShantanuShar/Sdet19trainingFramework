package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewcontactsPage {
	
	public CreatenewcontactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement Firstnamedropdown;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstnametxtbox;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametxtbox;

	@FindBy(xpath="//img[@title='Select']")
	private WebElement createnewcontactslogo;

	public WebElement getFirstnamedropdown() {
		return Firstnamedropdown;
	}
	
	public WebElement getFirstnametxtbox() {
		return Firstnametxtbox;
	}

	public WebElement getLastnametxtbox() {
		return lastnametxtbox;
	}

	public WebElement getCreatenewcontactslogo() {
		return createnewcontactslogo;
	}
	public void createnewcontacts(String name, String lname)
	{
		
		Firstnametxtbox.sendKeys(name);
		lastnametxtbox.sendKeys(lname);
		createnewcontactslogo.click();
		
	}
}
