package com.MyStore.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.Base.TestBase;
import com.MyStore.Pages.HomePage;
import com.MyStore.Pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	
	public  LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest()
	{
		boolean flag = loginPage.validateMyStoreImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("passwd"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
