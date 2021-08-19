package com.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewpurchaseorderdetailsPage {
	
	public NewpurchaseorderdetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxtfld;
	
	@FindBy(xpath="//input[@name='vendor_name']")
	private WebElement vendornametxtfld;
	
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingaddresstxtfld;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingaddresstxtfld;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement itemnametxtfld;
	
	@FindBy(xpath="//input[@iname='qty1']")
	private WebElement qtyvalue;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement savebtn;
	
	@FindBy(xpath="//input[@class='crmbutton small edit']\"")
	private WebElement editbtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	

	public WebElement getSubjecttxtfld() {
		return subjecttxtfld;
	}

	public WebElement getVendornametxtfld() {
		return vendornametxtfld;
	}
	

	public WebElement getBillingaddresstxtfld() {
		return billingaddresstxtfld;
	}
	
	public WebElement getShippingaddresstxtfld() {
		return shippingaddresstxtfld;
	}
	
	public WebElement getItemnametxtfld() {
		return itemnametxtfld;
	}
	
	public WebElement getQtyvalue() {
		return qtyvalue;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public WebElement getEditbtn() {
		return editbtn;
	}
	
	public void newpurchaseorderdetails()
	{
		cancelbtn.click();
		
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	
	

	

	
}
