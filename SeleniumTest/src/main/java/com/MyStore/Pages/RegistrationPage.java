package com.MyStore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.MyStore.Base.TestBase;

public class RegistrationPage extends TestBase
{
	//Page Factory - OR:
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement login;
			
			@FindBy(id="email_create")
			WebElement email_create;
			
			
			@FindBy(id="SubmitCreate")
			WebElement SubmitCreate;
			
			@FindBy(id="id_gender2")
			WebElement id_gender2;
			
			@FindBy(id="customer_firstname")
			
			WebElement customer_firstname;
			
			@FindBy(id="customer_lastname")
			
			WebElement customer_lastname;
			
			@FindBy(id="passwd")
			WebElement passwd;
			
			@FindBy(id="days")
			WebElement days;
			
			@FindBy(id="months")
			WebElement months;
			
			@FindBy(id="years")
			WebElement years;
			
			@FindBy(id="uniform-newsletter")
			WebElement newsletter;
			
			@FindBy(id="optin")
			WebElement optin;
			
			@FindBy(id="company")
			WebElement company;
			
			@FindBy(id="address1")
			WebElement address1;
			
			@FindBy(id="address2")
			WebElement address2;
			
			@FindBy(id="city")
			WebElement city;
			
			
			@FindBy(id="id_state")
			WebElement id_state;
			
			@FindBy(id="postcode")
			WebElement postcode;
			
			
			@FindBy(id="other")
			WebElement other;
			
			@FindBy(id="phone")
			WebElement phone;
			
			@FindBy(id="phone_mobile")
			WebElement phone_mobile;
			
			
			@FindBy(id="alias")
			WebElement alias;
			
			
			
			public void lgn()
			{
				login.click();
			}
			// This method is to set Email in the email text box
			public void setEmail(String strEmail)
			{
				email_create.sendKeys(strEmail);
			}
			// This method is to set Password in the password text box
			public void setPassword(String strPassword)
			{
				SubmitCreate.click();
			}
}
			

			
			