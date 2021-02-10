package com.MyStore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.Base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath=("//span[contains(text(),'Ruby Qureshi')]"))
	WebElement usernameLabel;
	public Object registartionPage;
	
	//Initializing the Page Objects:
	public HomePage()
	{
			PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return usernameLabel.isDisplayed();
	}
}
