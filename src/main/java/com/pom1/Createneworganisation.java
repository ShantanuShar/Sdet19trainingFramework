package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createneworganisation {
	
	public Createneworganisation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationtextbox;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industrydropdown;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typedropdown;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingdropdown;
	
	@FindBy(xpath="//input[@name='button']")
	private WebElement savebtn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement createneworganisationlogo;

	public WebElement getOrganisationtextbox() {
		return organisationtextbox;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getRatingdropdown() {
		return ratingdropdown;
	}
	
	

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCreateneworganisationlogo() {
		return createneworganisationlogo;
	}
	public void createneworganisation(String name)
	{
		organisationtextbox.sendKeys(name);
		createneworganisationlogo.click();
		savebtn.click();
		
		
	}

}
