package com.MyStore.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MyStore.Base.TestBase;
import com.MyStore.Pages.HomePage;
import com.MyStore.Pages.LoginPage;
import com.MyStore.Pages.RegistrationPage;
import com.MyStore.Utils.TestUtil;

public class RegistrationPageTest extends TestBase
{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	RegistrationPage registartionPage;
	
	//String sheetName = "contacts";
	
	public  RegistrationPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException 
	{
		
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
				
	}


	@DataProvider
    public Object[][] dp() throws IOException	 
	{
  	 TestUtil read = new TestUtil();
  	 return read.getData("C:\\Users\\48585\\eclipse-workspace\\SeleniumTest\\src\\main\\java\\com\\MyStore\\TestData\\Book1.xlsx", "Sheet4");
	}
	
	
	@Test(dataProvider = "dp")
	public void CreateNewContact(String comm)
	{
	registartionPage.lgn();
	registartionPage.setEmail("your-username");
	registartionPage.setPassword("your-password");
		
	}
}
	
	
