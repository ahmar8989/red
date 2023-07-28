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
import com.mystore.pageobjects.homepageobjects;
import com.mystore.utility.Log;

public class attributeSettests extends BaseClass {
		
	    private LoginPage loginPage;
		//public homepageobjects Homepageobjects;
		public attributeSet AttributeSett;
		public attribute Attribute;
		
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
		public void attributeSet() throws Throwable {
		   loginPage = new LoginPage();
		//   Homepageobjects= loginPage.login();
	//	   Homepageobjects.productClick();
		   Thread.sleep(1000);
		   AttributeSett = new attributeSet();
		   Attribute = new attribute();

	 

		 
		   AttributeSett.attSet1();
		   String actualURL=AttributeSett.getCurrURL();
		   String expectedURL="https://app.getapimio.com/products/family";
		   Log.info("Verifying if user is able to add set attribute 1 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet2();  
		   Log.info("Verifying if user is able to add set attribute 2 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet3();
		   Log.info("Verifying if user is able to add set attribute 3 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 4 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 5 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 6 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 7 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 8 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 9 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 10 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");		
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 11 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 12 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 13 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 14 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 15 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 17 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 18 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 19 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 20 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 21 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 22 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");	
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 23 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 24 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 25 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 26 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   
		   AttributeSett.attSet4();
		   Log.info("Verifying if user is able to add set attribute 27 time");
		   Assert.assertEquals(actualURL, expectedURL);
		   Log.info("Attribute is added sucessfully");
		   Log.endTestCase("AttributeSet");
		   

		   
		   
		  
		
		 
		   Attribute.att1();
		   String attributeURL1=Attribute.getCurrURL();
		   String expectedURL1="https://app.getapimio.com/products/attributes";
		   Log.info("Verifying if user is able to add attribute with single values");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("1st Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   
		   
		   Attribute.att2();
		   Log.info("Verifying if user is able to add attribute with single values");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("2nd Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att3();
		   Log.info("Verifying if user is able to add attribute with single values");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("3rd Attribute is added sucessfully");
		   Log.endTestCase("Attribute");

		   
		   Attribute.att4();
		   Log.info("Verifying if user is able to add attribute with multi values");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("4th Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att5();
		   Log.info("Verifying if user is able to add attribute with multi values");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("5th Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		
		   
		   Attribute.att6();
		   Log.info("Verifying if user is able to add attribute with single values Decimal option");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("6th Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att7();
		   Log.info("Verifying if user is able to add attribute with single values Decimal option");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("7th Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   	   
		   Attribute.att8();
		   Log.info("Verifying if user is able to add attribute with single values with price");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("8 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
	  
	

		   Attribute.att9();
		   Log.info("Verifying if user is able to add attribute with single value with weight");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("9 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		 
		   Attribute.att10();
		   Log.info("Verifying if user is able to add attribute with single value with volume");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("10 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		     
		   Attribute.att11();
	
		   Log.info("Verifying if user is able to add attribute 2nd time with single value with volume");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("11 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att12();
		   Log.info("Verifying if user is able to add attribute 2nd time with single value with dimension");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("12 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att13();
		   Log.info("Verifying if user is able to add attribute 2nd time with single value with dimension");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("13 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att14();
		   Log.info("Verifying if user is able to add attribute with multi value with volume");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("14 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		     
		   Attribute.att15();
	
		   Log.info("Verifying if user is able to add attribute 2nd time with multi value with volume");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("15 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att16();
		   Log.info("Verifying if user is able to add attribute 2nd time with multi value with dimension");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("16 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		  
		   Attribute.att17();
		   Log.info("Verifying if user is able to add attribute 2nd time with multi value with dimension");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("17 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att18();
		   Log.info("Verifying if user is able to add attribute with multi value with volume with integer");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("18 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		     
		   Attribute.att19();
	
		   Log.info("Verifying if user is able to add attribute   with multi value with volume with integer");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("19 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att20();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with integer");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("20 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att21();
		   Log.info("Verifying if user is able to add attribute 2nd time with multi value with dimension with integer");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("21 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att22();
		   Log.info("Verifying if user is able to add attribute with multi value with volume with decimal");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("22 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		     
		   Attribute.att23();
	
		   Log.info("Verifying if user is able to add attribute  with multi value with volume with decimal");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("23 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att24();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("24 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att25();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("25 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");



		   
		   Attribute.att26();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal with date&time");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("26 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att27();
			
		   Log.info("Verifying if user is able to add attribute  with multi value with volume with decimal with datetime");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("27 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att28();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal with datetime");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("28 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att29();
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal with datetime");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("29 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		  
		   Attribute.att30();

		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal with date&time and isrequire field");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("30 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att31();
			
		   Log.info("Verifying if user is able to add attribute  with multi value with dimension with decimal with date&time and isrequire field");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("31 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att32();
		   Log.info("Verifying if user is able to add attribute   with multi value with dimension with decimal with date&time and isrequire field");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("32 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");
		   
		   Attribute.att33();
		   Log.info("Verifying if user is able to add attribute   with multi value with dimension with decimal with date&time and isrequire field");
		   Assert.assertEquals(attributeURL1, expectedURL1);
		   Log.info("33 Attribute is added sucessfully");
		   Log.endTestCase("Attribute");



		   
}
}