package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ImortmoduleObjects;
import com.mystore.pageobjects.ImportmoduleVariants;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.brands;
import com.mystore.pageobjects.categories;
import com.mystore.pageobjects.products;
import com.mystore.pageobjects.store;
import com.mystore.pageobjects.vendor;
import com.mystore.utility.Log;

public class EndtoEndImportmoduleTesting extends BaseClass{
	
	LoginPage loginPage;
	public store Store;
	public 	vendor Vendor;
	public brands Brands;
	public categories Cat;
	public products Products;
	public ImortmoduleObjects imortmoduleObjects;
	public ImportmoduleVariants importmodulevariants;

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
   loginPage = new LoginPage();
   loginPage.login();
   
   String actualURL=loginPage.getCurrURL();
   String expectedURL="https://app.getapimio.com/dashboard";
   Log.info("Verifying if user is able to login");
   Assert.assertEquals(actualURL, expectedURL);
   Log.info("Login is Sucess");
  Log.endTestCase("loginTest");
  
  
  
  imortmoduleObjects = new ImortmoduleObjects();
  importmodulevariants = new ImportmoduleVariants();
  for (int i = 0; i < 10000; i++) {
  imortmoduleObjects.importmodule();
  
  importmodulevariants.importmodule2();
  }
	
}
}
