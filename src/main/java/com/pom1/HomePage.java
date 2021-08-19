package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	//@FindBy(xpath="//a[text()='Contacts']")
	//private WebElement contacts;
	
	@FindBy(xpath="//img[@src='themes/softed/images/layerPopupBg.gif']")
	private WebElement signoutlogo;
	
	//@FindBy(xpath="//a[text()='Sign Out']")
	//private WebElement Signoutbtn;

	public WebElement getOrglink() {
		return orglink;
	}

	//public WebElement getContacts() {
	//	return contacts;
	//}

	//public WebElement getSignoutlogo() {
	//	return signoutlogo;
	//}

	//public WebElement getSignoutbtn() {
	//	return Signoutbtn;
	//}
	
	public void homepage()
	{
		orglink.click();
		//contacts.click();
		//signoutlogo.click();
		//Signoutbtn.click();
	}

}
