package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.attributeSet;
import com.mystore.pageobjects.homepageobjects;

public class homepageTest extends BaseClass{
	
    private LoginPage loginPage;
	public homepageobjects Homepageobjects;

	
	@BeforeMethod()
	public void setup() {
	//	launchApp(); 
	}
	
	@AfterMethod()
	public void tearDown() {
	//	getDriver().quit();
	}
	
@Test()
	public void homePage () throws Throwable {
	loginPage  = new LoginPage();
	Homepageobjects = loginPage.login();
	Homepageobjects.productClick();

	
 }
}
