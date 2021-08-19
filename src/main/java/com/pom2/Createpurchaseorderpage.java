package com.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpurchaseorderpage {
	
	public Createpurchaseorderpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement createpurchaseorderlink;

	public WebElement getCreatepurchaseorderlink() {
		return createpurchaseorderlink;
	}
	
	public void purchaseorderlink()
	{
		createpurchaseorderlink.click();
	}

}
