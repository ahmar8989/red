package com.mystore.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.attribute;
import com.mystore.pageobjects.attributeSet;
import com.mystore.pageobjects.brands;
import com.mystore.pageobjects.categories;
import com.mystore.pageobjects.product;
import com.mystore.pageobjects.products;
import com.mystore.pageobjects.store;
import com.mystore.pageobjects.vendor;
import com.mystore.utility.Log;

public class EndtoEndProductTesting1 extends BaseClass {
	
	LoginPage loginPage;
	// store Store;
	public 	vendor Vendor;
	public brands Brands;
	public categories Cat;
	public products Products;
	public attributeSet AttributeSett;
	public product Product;

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
  
 
  AttributeSett = new attributeSet();

  AttributeSett.attSet1();
  Log.info("Verifying if user is able to add set attribute 1 time");
  Assert.assertEquals(actualURL, expectedURL);
  Log.info("Attribute is added sucessfully");
  Log.endTestCase("AttributeSet");
  
  AttributeSett.attSet2();  
  Log.info("Verifying if user is able to add set attribute 2 time");
  Assert.assertEquals(actualURL, expectedURL);
  Log.info("Attribute is added sucessfully");
  Log.endTestCase("AttributeSet");

  
/*
Store = new store();


Store.store1();
String actualURLstore=Store.getCurrURL();
String expectedURLstore="https://app.getapimio.com/channel";
Log.info("Verifying if user is able to add store 1");
Assert.assertEquals(actualURLstore, expectedURLstore);
Log.info("Store is added Successfully");
Log.endTestCase("Store Test");

Store.store2();
Log.info("Verifying if user is able to add store 2");
Assert.assertEquals(actualURLstore, expectedURLstore);
Log.info("Store is added Successfully");
Log.endTestCase("Store Test");

Store.store3();
Log.info("Verifying if user is able to add store 3");
Assert.assertEquals(actualURLstore, expectedURLstore);
Log.info("Store is added Successfully");
Log.endTestCase("Store Test");

*/



Brands = new brands();

Brands.brand1();

String actualURLbrands=Brands.getCurrURL();
String brandsURL="https://app.getapimio.com/products/brands"; 
System.out.println(brandsURL);
Log.info("Verifying if user is able to add brand 1st");
Assert.assertEquals(actualURLbrands, brandsURL);
Log.info("Brand is added Successfully");
Log.endTestCase("brand");






/*

Brands.brand2();
Log.info("Verifying if user is able to add brand 2nds");
Assert.assertEquals(actualURLbrands, brandsURL);
Log.info("Brand is added Successfully");
Log.endTestCase("brand");

Brands.brand3();
Log.info("Verifying if user is able to add brand 3rds");
Assert.assertEquals(actualURLbrands, brandsURL);
Log.info("Brand is added Successfully");
Log.endTestCase("brand");


Brands.brand4();
Log.info("Verifying if user is able to add brand 4s");
Assert.assertEquals(actualURLbrands, brandsURL);
Log.info("Brand is added Successfully");
Log.endTestCase("brand");

Brands.brand5();
Log.info("Verifying if user is able to add brand 5s");
Assert.assertEquals(actualURLbrands, brandsURL);
Log.info("Brand is added Successfully");
Log.endTestCase("brand");

*/



Cat = new categories();

Cat.categories1();
String actualURLcategories=Cat.getCurrURL();
String categoriesURL="https://app.getapimio.com/products/categories";
Log.info("Verifying if user is able to add category 1");
Assert.assertEquals(actualURLcategories, categoriesURL);
Log.info("category is added Successfully");
Log.endTestCase("category");

Cat.categories2();
Log.info("Verifying if user is able to add category 2");
Assert.assertEquals(actualURLcategories, categoriesURL);
Log.info("category is added Successfully");
Log.endTestCase("category");

Cat.categories3();
Log.info("Verifying if user is able to add category 3");
Assert.assertEquals(actualURLcategories, categoriesURL);
Log.info("category is added Successfully");
Log.endTestCase("category");

Cat.categories4();
Log.info("Verifying if user is able to add category 4");
Assert.assertEquals(actualURLcategories, categoriesURL);
Log.info("category is added Successfully");
Log.endTestCase("category");

Cat.categories5();
Log.info("Verifying if user is able to add category 5");
Assert.assertEquals(actualURLcategories, categoriesURL);
Log.info("category is added Successfully");
Log.endTestCase("category");




Vendor = new vendor();

Vendor.addvendor1();
Log.info("Verifying if user is able to add vendor 1");
Log.info("vendor is added Successfully");
Log.endTestCase("vendor");
/*
Vendor.addvendor2();
Log.info("Verifying if user is able to add vendor 2");
Log.info("vendor is added Successfully");
Log.endTestCase("vendor");
Vendor.addvendor3();
Log.info("Verifying if user is able to add vendor 3");
Log.info("vendor is added Successfully");
Log.endTestCase("vendor");


Vendor.addvendor4();
Log.info("Verifying if user is able to add vendor 4");
Log.info("vendor is added Successfully");
Log.endTestCase("vendor");
*/

Vendor.addvendor5();
Log.info("Verifying if user is able to add vendor 5");
Log.info("vendor is added Successfully");
Log.endTestCase("vendor");




Product = new product();
//for (int i = 0; i < 10000; i++) {
Product.products1();
Log.info("End to End Product testing Successfully complete 1st time");
}

/*
Log.info("End to End Product testing starts 2nd time ........");
Products.products2();
Log.info("End to End Product testing Successfully complete 2nd time");

Log.info("End to End Product testing starts 3rd time ........");
Products.products3();
Log.info("End to End Product testing Successfully complete 3nd time");

Log.info("End to End Product testing starts 4th time ........");
Products.products2();
Log.info("End to End Product testing Successfully complete 4th time");

Log.info("End to End Product testing starts 5th time ........");
Products.products5();
Log.info("End to End Product testing Successfully complete 5th time");

*/


}



