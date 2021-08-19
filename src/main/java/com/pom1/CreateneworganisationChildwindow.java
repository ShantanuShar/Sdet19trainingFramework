package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateneworganisationChildwindow {
	
	public CreateneworganisationChildwindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchtxtbox;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//table[@id=\"1\"]/tbody/tr[2]/td[1]")
	private WebElement tableelement;

	public WebElement getSearchtxtbox() {
		return searchtxtbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getTableelement() {
		return tableelement;
	}
	
	public void childwindow(String orgname)
	{
		searchtxtbox.sendKeys(orgname);
		searchbtn.click();
		
	}

}
