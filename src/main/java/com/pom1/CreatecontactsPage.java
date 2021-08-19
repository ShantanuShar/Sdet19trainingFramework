package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecontactsPage {
	 
	public CreatecontactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontactsbutton;

	public WebElement getCreatecontactsbutton() {
		return createcontactsbutton;
	}
	
	public void creatingcontactsbtn()
	{
		createcontactsbutton.click();
	}

}
