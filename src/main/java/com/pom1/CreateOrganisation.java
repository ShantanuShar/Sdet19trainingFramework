package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganisation {
	
	public CreateOrganisation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorganisationlink;

	public WebElement getCreateorganisationlink() {
		return createorganisationlink;
	}
	
	
    public void createorganisation()
    {
    	createorganisationlink.click();
    	
    }

}
