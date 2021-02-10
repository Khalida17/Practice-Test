package com.MyStore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.Base.TestBase;

public class LoginPage extends TestBase 
{
	
	//Page Factory - OR:
		@FindBy(xpath="//a[contains(text(),'Sign in')]")
		WebElement login;
	
		@FindBy(id="email")
		WebElement email;
		
		@FindBy(id="passwd")
		WebElement passwd;
		
		@FindBy(id="SubmitLogin")
		WebElement SubmitLogin;
		
		@FindBy(xpath="//button[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
		WebElement YourLogo;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateMyStoreImage(){
			return YourLogo.isDisplayed();
		}
		
		public HomePage login(String em, String pwd){
			
			login.click();
			email.sendKeys(em);
			passwd.sendKeys(pwd);
			SubmitLogin.click();
			    	
			return new HomePage();
		}

}
