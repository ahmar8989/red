package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.attribute;
import com.mystore.pageobjects.homepageobjects;
import com.mystore.utility.Log;

public class attributetest extends BaseClass{
	
	
    private LoginPage loginPage;
	public homepageobjects Homepageobjects;
	public attribute Attribute;
	public attributeSettests Attributettt;
	
	@Parameters("browser") 
	@BeforeMethod()
	public void setup(String browser ) {
		launchApp(browser); 
	}
	
	@AfterMethod()
	public void tearDown() {
		// driver.quit();
	}
	
	@Test()
	public void attributeSettest1() throws Throwable {
		// loginPage=indexPage.clickOnSignIn();
	   loginPage = new LoginPage();
	   Homepageobjects= loginPage.login();
	   Homepageobjects.productClick();
	   Thread.sleep(1000);
	   Attribute = new attribute();
	

	 
	   Attribute.att1();
	   String attributeURL1=Attribute.getCurrURL();
	   String expectedURL1="https://app.getapimio.com/products/attributes";
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   
	   
	   Attribute.att2();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   Attribute.att3();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   Attribute.att4();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   Attribute.att5();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   Attribute.att5();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   Attribute.att6();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	 
       Attribute.att7();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   Attribute.att8();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   
	   Attribute.att9();
	   Log.info("Verifying if user is able to add attribute with single values");
	   Assert.assertEquals(attributeURL1, expectedURL1);
	   Log.info("Attribute is added sucessfully");
	   Log.endTestCase("Attribute");
	   

 } 
}
