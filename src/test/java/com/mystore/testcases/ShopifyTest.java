package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShopifyLogin;

public class ShopifyTest extends BaseClass {
	
	ShopifyLogin SloginPage;

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
	
	public void shopify() throws InterruptedException {
		
		SloginPage = new ShopifyLogin();
		
		SloginPage.ShopifyLog(); 
		
	}

}
