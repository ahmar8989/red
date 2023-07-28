package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class Shopifysynctest extends BaseClass {
	
	LoginPage loginPage;

	@Parameters("browser") 	
	@BeforeMethod
	public void setup(String browser ) {
		launchApp(browser); 
	}
	
	@AfterMethod()
	public void tearDown() {
	//	 driver.quit();
	}


@Test()
public void loginTest() throws Throwable {
	// loginPage=indexPage.clickOnSignIn();
   loginPage = new LoginPage();
   loginPage.login();
   
   String actualURL=loginPage.getCurrURL();
   String expectedURL="https://app.getapimio.com/dashboard";
   Log.info("Verifying if user is able to login");
   Assert.assertEquals(actualURL, expectedURL);
   Log.info("Login is Sucess");
  Log.endTestCase("loginTest");

}}