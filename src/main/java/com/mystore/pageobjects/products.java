package com.mystore.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class products extends BaseClass {
	
	public static void setClipBoard(String file) {
		StringSelection obj= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}


	Action action= new Action();
	
	Faker faker = new Faker();
	
	@FindBy(xpath="//i[@class='flaticon flaticon-product d-flex align-items-center icon-size']")
	private WebElement productsbtn; 
	
	@FindBy(xpath="//span[normalize-space()='All Products']")
	private WebElement productsbtn2;
	
	
	@FindBy(xpath="//a[@class='btn btn-primary ripplelink']")
	private WebElement addproductclick;
	

	@FindBy(linkText="Price")
	private WebElement priceinput;
	
	@FindBy(id="sku")
	private WebElement skuinput;
		
	@FindBy(id="pro_addpro_btn")
	private WebElement addproducksuku;
	
	@FindBy(xpath="//div[@id='product_content']//div[3]//input[1]")
	private WebElement productnameinput;
	
	@FindBy(xpath="//div[@id='general-tab']//div[4]//input[1]")
	private WebElement upcinput;
	
	@FindBy(xpath="//input[@name='attribute[599][value]']")
	private WebElement priceinputx;
	
	@FindBy(xpath="//input[@name='attribute[600][value]']")
	private WebElement comparepriceinput;
	
	@FindBy(xpath="//input[@name='attribute[601][value]']")
	private WebElement costpriceinput;
	
	@FindBy(xpath="//input[@name='attribute[602][value]']")
	private WebElement qualityinput;
	
	@FindBy(xpath="//input[@id='fields-603']")
	private WebElement weightinput;
	

	@FindBy(xpath="//div[@id='right_sidebar']//div//div//button[@id='pro_edit_pub_btn']")
	private WebElement storesavebtn;
	



	

	

	public products() {
		PageFactory.initElements(getDriver(), this);
	
	}
	
	public void products1() throws InterruptedException, AWTException 	
	{	
		action.click(getDriver(), productsbtn);
		action.click(getDriver(), addproductclick);
		action.implicitWait(getDriver(), 10000);
		action.implicitWait(getDriver(), 30000);
		action.type(skuinput, "0001"+faker.name().firstName());	
		action.implicitWait(getDriver(), 10000);
		action.click(getDriver(), addproducksuku);	
		{
			 WebElement l =getDriver().findElement(By.id("general-tab"));
		      List<WebElement> productforuminput = l.findElements(By.tagName("input"));
		      int count = 0;
		      int index = 0;
		      String[] cars = {"BMW", "productname", "23","234", "223", "56", "567","23423","123"};
		      System.out.println(productforuminput);


		      outerloop:for (WebElement foruminput: productforuminput) {
		    	  if(count == 0) {
		    		  count = 1;
		    	  }else if(count ==1) {
		    		  String str = cars[index]; 
		    		  foruminput.sendKeys(str);
		    		  index= index+1;
		    		  if(index == 8) {
			    		  count = 2;
			    		  break outerloop;
			    		  }
		    	  }
		    	  else {
		    		  break;	    	 
		    	  	}
		  		
		      }
		      index=0;
		      }
	

			action.click(getDriver(), storesavebtn);


		getDriver().navigate().to("https://app.getapimio.com/dashboard");


	}


}