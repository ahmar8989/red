/**
 * 
 */
package com.mystore.testcases;




import org.testng.Assert;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.utility.Log;

//import com.aventstack.extentreports.model.Log;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.attribute;
import com.mystore.pageobjects.attributeSet;
import com.mystore.pageobjects.homepageobjects;

public class LoginPageTest extends BaseClass {
	
	LoginPage loginPage;
	homepageobjects Homepageobjects;


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
   String expectedURL="https://www.etsy.com/";
   Log.info("Verifying if user is able to login");
   Assert.assertEquals(actualURL, expectedURL);
   Log.info("Login is Sucess");
  Log.endTestCase("loginTest");
  
   Homepageobjects = new homepageobjects();

   Homepageobjects.productClick();
   

   

 }	
}

