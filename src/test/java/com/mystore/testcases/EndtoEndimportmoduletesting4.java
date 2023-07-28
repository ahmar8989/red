package com.mystore.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ImortmoduleObjects2;
import com.mystore.pageobjects.ImortmoduleObjects4;
import com.mystore.pageobjects.ImportmoduleVariants;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.brands;
import com.mystore.pageobjects.categories;
import com.mystore.pageobjects.products;
import com.mystore.pageobjects.store;
import com.mystore.pageobjects.vendor;
import java.util.List;



public class EndtoEndimportmoduletesting4 extends BaseClass{
	
	LoginPage loginPage;
	public store Store;
	public 	vendor Vendor;
	public brands Brands;
	public categories Cat;
	public products Products;
	public ImortmoduleObjects2 imortmoduleObjects2;
	public ImportmoduleVariants importmodulevariants;

	@Parameters("browser") 	
	@BeforeMethod
	public void setup(String browser ) {
		launchApp(browser); 
	}
	
	@AfterMethod()
	public void tearDown() {
	//	getDriver().quit();
	}


@Test()
public void loginTest() throws Throwable {
   loginPage = new LoginPage();
   loginPage.login();


   ImortmoduleObjects2 imortmoduleObjects2 = new ImortmoduleObjects2();

 //  imortmoduleObjects2.importcsv();
   imortmoduleObjects2.extractAndCompare();
   
   
   
   
}
}
