package com.MyStore.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.Base.TestBase;
import com.MyStore.Pages.HomePage;
import com.MyStore.Pages.LoginPage;

public class HomePageTest extends TestBase 
{

	LoginPage loginPage;
	HomePage homePage;
	
	public  HomePageTest()
	{
		super();
	}
	
	
	//testcases should be seperated -- Independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("passwd"));
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "My account - My Store", "LoginPage title not matched");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	
}
