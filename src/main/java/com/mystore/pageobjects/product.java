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

public class product extends BaseClass {
	
	public static void setClipBoard(String file) {
		StringSelection obj= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	public static void uploadFile(String filePath) throws AWTException {
		setClipBoard(filePath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER); 
		rb.keyRelease(KeyEvent.VK_ENTER); 
		
		
	}

	Action action= new Action();
	
	Faker faker = new Faker();
	
	@FindBy(xpath="//div[contains(text(),'Products')]")
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
	
	@FindBy(xpath="//span[@class='brands-text']//i[@class='bi bi-plus-circle']")
	private WebElement brandadd;
	
	@FindBy(xpath="//input[@id='brands-input']")
	private WebElement brandinput;
	
	
	@FindBy(xpath="//span[@class='vendors-text']//i[@class='bi bi-plus-circle']")
	private WebElement vendoradd;
	
	@FindBy(xpath="//input[@id='vendors-input']")
	private WebElement vendorinput;
	
	@FindBy(xpath="//input[@id='justAnotherInputBox']")
	private WebElement categoryadd;
	
	@FindBy(xpath="//input[@id='justAnotherInputBox']")
	private WebElement categoryinput;
	
	@FindBy(xpath="//i[@class='bi bi-plus-circle']")
	private WebElement storeadd;
	
	@FindBy(xpath="//input[@id='channels-input']")
	private WebElement storeinput;
	
	@FindBy(xpath="//p[@class='btnOk']")
	private WebElement storeokbtn;
		
	@FindBy(xpath="//div[@id='right_sidebar']//div//div//button[@id='pro_edit_pub_btn']")
	private WebElement storesavebtn;
	
//////////////////////////////////SEO Attributess//////////////////////////////////////////////
	
	@FindBy(xpath="//a[@class='nav-link Roboto bold product_data imagescorecard active']")
	private WebElement seoattributeclick;
	
	@FindBy(xpath="//input[@id='fields-569']")
	private WebElement seourlinput;
	
	@FindBy(xpath="//input[@name='attribute[570][value]']")
	private WebElement seotitle;
	
	@FindBy(xpath="//textarea[@id='mytextarea']")
	private WebElement seodescp;
	
	@FindBy(xpath="//li[@class='tagger-new']//input")
	private WebElement seotags;
	

	////////////////////Attribute Set ////////////////////////////////////////////////
	
	
	@FindBy(xpath="//p[@title=' Select...']")
	private WebElement attibutesetsclick;
		
	
	@FindBy(xpath="//p[@class='select-all']")
	private WebElement selectallclcik;
	
	@FindBy(xpath="//button[@id='assign_attribute_set']")
	private WebElement assignattributeclick;
	
	
	@FindBy(xpath="//div[@class='SumoSelect sumo_family open']//p[@class='btnOk'][normalize-space()='OK']")
	private WebElement assignattributeokbtn;
	
	@FindBy(xpath="//div[@class='p-2']//button[@id='pro_edit_pub_btn']")
	private WebElement assignattributesavebtn;
	
	//////////////////////variants////////////////////////////////////
	
	
	@FindBy(xpath="//a[@class='mt-3 mt-lg-0 btn btn-outline-primary ripplelink hovereffect float-lg-right']")
	private WebElement variantsaddoption;
	
	@FindBy(id="name")
	private WebElement inputoptiontitle; 
	
	@FindBy(xpath="//button[normalize-space()='Save changes']")
	private WebElement sav; 
	
	@FindBy(xpath="//*[contains(text(),\"SEO Attributes\")]")
	private WebElement SEO; 
	
	@FindBy(xpath="//input[@list='tagger-completion-disabled-1']")
	private WebElement seoTags;
	
	@FindBy(id="add-btn")
	private WebElement addoptionvalue;
		
	@FindBy(name="attribute_options[][name]")
	private WebElement addoptionvalue1;
	
	@FindBy(name="//div[@id='general-tab']//iframe[@id='mytextarea1_ifr']")
	private WebElement descrptnfield;
	
	////////////////index objects///////////////////////
	
	@FindBy(name="//select[@id='brand']")
	private WebElement brandclick;
	

	
	
	
	
	

	public product() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void products1() throws InterruptedException, AWTException 	
	{	
		action.click(getDriver(), productsbtn);
		action.click(getDriver(), addproductclick);
		action.implicitWait(getDriver(), 10000);
		action.type(skuinput, "000"+faker.name().firstName());	
		action.implicitWait(getDriver(), 10000);
		action.click(getDriver(), addproducksuku);	
	//	action.type(descrptnfield, "dsfjksnfjk");
		
		
	
		
		
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
	/*
			action.click(getDriver(), brandadd);
			action.type(brandinput, "ass");			
			action.click(getDriver(), vendoradd);
			action.type(vendorinput, "ass");			
			action.click(getDriver(), categoryadd);
			action.type(categoryinput, "ass");		
			action.click(getDriver(), storeadd);
			action.type(storeinput, "ass");			
			
			action.click(getDriver(), storesavebtn);
			*/

		
//////////////////////////indexex//////////////////////////////////////
		
		
	//	action.click(getDriver(), brandclick);
	//	action.selectByIndex(brandclick, 3);
		
		
		Select brand = new Select(getDriver().findElement(By.xpath("//select[@id='brand']")));
		brand.selectByIndex(1);
		
		Select vendor = new Select(getDriver().findElement(By.xpath("//select[@id='vendor']")));
		vendor.selectByIndex(1);
		
//		Select category = new Select(getDriver().findElement(By.xpath("//input[@id='justAnotherInputBox']")));
//		category.selectByIndex(1);
		
	//	action.click(getDriver(), categoryadd);
		action.type(categoryinput, "assxx");
		

		
		
		/*
		
		
		
//////////////////////////Seo Attributes/////////////////////////////
			
		getDriver().findElement(By.linkText("SEO Attributes")).click();	
		action.type(seotags, "ass");
		action.click(getDriver(), storesavebtn);
		
		/////////////////////////////Attribute Set/////////////////////////////////////////////////////
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().findElement(By.linkText("Attribute Set")).click();	
		action.click(getDriver(), attibutesetsclick);
		action.click(getDriver(), selectallclcik);	
		action.click(getDriver(), assignattributeokbtn);
		action.click(getDriver(), assignattributeclick);
		action.click(getDriver(), assignattributesavebtn);

		/////////////////////////////////// MEdia/////////////////////////////////
		
		action.implicitWait(getDriver(), 10000);
		getDriver().findElement(By.linkText("Media")).click();		
		Actions act= new Actions(getDriver());
		action.implicitWait(getDriver(), 30000);
		WebElement choseFile=getDriver().findElement(By.xpath("//div[@id='files']"));
		action.implicitWait(getDriver(), 30000);
		act.moveToElement(choseFile).click().perform();
		Thread.sleep(3000);	
		uploadFile("C:\\Users\\Hp\\r.png");	
		Thread.sleep(7000);
		action.click(getDriver(), assignattributesavebtn);
		
		
//////////////////////////////////////Variants option ////////////////////////////////////////////////
		
		action.implicitWait(getDriver(), 30000);
		getDriver().findElement(By.linkText("Variants")).click();	
		action.click(getDriver(), variantsaddoption);
		action.type(inputoptiontitle, "000"+faker.name().firstName());
		action.click(getDriver(), addoptionvalue);
		action.type(addoptionvalue1, "000"+faker.name().firstName());
		action.implicitWait(getDriver(), 30000);
		action.click(getDriver(), sav);

	}



	
///////////////////////////////////product testing 2///////////////////////////////////////////	
		
	

public void products2() throws InterruptedException, AWTException 
{	action.click(getDriver(), productsbtn2);
	action.click(getDriver(), addproductclick);
	action.implicitWait(getDriver(), 10000);
	action.type(skuinput, "000"+faker.name().firstName());	
	action.implicitWait(getDriver(), 10000);
	action.click(getDriver(), addproducksuku);
	{
		WebElement l =getDriver().findElement(By.id("general-tab"));
	      List<WebElement> productforuminput = l.findElements(By.tagName("input"));
	      int count = 0;
	      int index = 0;
	      String[] cars = {"BMW", "1", "23","234", "223", "56", "567","23423","123"};
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

		action.click(getDriver(), brandadd);
		action.type(brandinput, "ass");	
		action.click(getDriver(), vendoradd);
		action.type(vendorinput, "ass");
		action.click(getDriver(), categoryadd);
		action.type(categoryinput, "ass");
		action.click(getDriver(), storeadd);
		action.type(storeinput, "ass");		
		action.click(getDriver(), storesavebtn);
//////////////////////////Seo Attributes/////////////////////////////
		
	getDriver().findElement(By.linkText("SEO Attributes")).click();	
	action.type(seotags, "ass");
	action.click(getDriver(), storesavebtn);
	
	/////////////////////////////Attribute Set/////////////////////////////////////////////////////
	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	getDriver().findElement(By.linkText("Attribute Set")).click();	
	action.click(getDriver(), attibutesetsclick);
	action.click(getDriver(), selectallclcik);	
	action.click(getDriver(), assignattributeokbtn);
	action.click(getDriver(), assignattributeclick);
	action.click(getDriver(), assignattributesavebtn);

	/////////////////////////////////// MEdia/////////////////////////////////
	
	action.implicitWait(getDriver(), 10000);
	getDriver().findElement(By.linkText("Media")).click();		
	Actions act= new Actions(getDriver());
	action.implicitWait(getDriver(), 30000);
	WebElement choseFile=getDriver().findElement(By.xpath("//div[@id='files']"));
	action.implicitWait(getDriver(), 30000);
	act.moveToElement(choseFile).click().perform();
	Thread.sleep(3000);	
	uploadFile("C:\\Users\\Hp\\r.png");
	Thread.sleep(5000);
	action.click(getDriver(), assignattributesavebtn);
	
	
//////////////////////////////////////Variants option ////////////////////////////////////////////////
	
	action.implicitWait(getDriver(), 30000);
	getDriver().findElement(By.linkText("Variants")).click();	
	action.click(getDriver(), variantsaddoption);
	action.type(inputoptiontitle, "000"+faker.name().firstName());
	action.click(getDriver(), addoptionvalue);
	action.type(addoptionvalue1, "000"+faker.name().firstName());
	action.implicitWait(getDriver(), 30000);
	action.click(getDriver(), sav);
}

///////////////////////////////////product testing ///////////////////////////////////////////	

public void products3() throws InterruptedException, AWTException 
{	
action.click(getDriver(), productsbtn2);
action.click(getDriver(), addproductclick);
action.implicitWait(getDriver(), 10000);
action.type(skuinput, "000"+faker.name().firstName());	
action.implicitWait(getDriver(), 10000);
action.click(getDriver(), addproducksuku);
{
WebElement l =getDriver().findElement(By.id("general-tab"));
List<WebElement> productforuminput = l.findElements(By.tagName("input"));
int count = 0;
int index = 0;
String[] cars = {"BMW", "1", "23","234", "223", "56", "567","23423","123"};
outerloop:for (WebElement foruminput: productforuminput) {
if(count == 0) {
count = 1;
}else if(count ==1) {
String str = cars[index]; 
foruminput.sendKeys(str);
index= index+1;
System.out.println(cars[index]+","+index);
if(index == 8) {
count = 2;
//	  System.out.println(count);
break outerloop;
}
}
else {
break;	    	 
}

}
index=0;
}

action.click(getDriver(), brandadd);
action.type(brandinput, "ass");
action.click(getDriver(), vendoradd);
action.type(vendorinput, "ass");
action.click(getDriver(), categoryadd);
action.type(categoryinput, "ass");
action.click(getDriver(), storeadd);
action.type(storeinput, "ass");
action.click(getDriver(), storesavebtn);
//////////////////////////Seo Attributes/////////////////////////////

getDriver().findElement(By.linkText("SEO Attributes")).click();	
action.type(seotags, "ass");
action.click(getDriver(), storesavebtn);

/////////////////////////////Attribute Set/////////////////////////////////////////////////////

getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
getDriver().findElement(By.linkText("Attribute Set")).click();	
action.click(getDriver(), attibutesetsclick);
action.click(getDriver(), selectallclcik);	
action.click(getDriver(), assignattributeokbtn);
action.click(getDriver(), assignattributeclick);
action.click(getDriver(), assignattributesavebtn);

/////////////////////////////////// MEdia/////////////////////////////////

action.implicitWait(getDriver(), 10000);
getDriver().findElement(By.linkText("Media")).click();	
Actions act= new Actions(getDriver());
action.implicitWait(getDriver(), 30000);
WebElement choseFile=getDriver().findElement(By.xpath("//div[@id='files']"));
action.implicitWait(getDriver(), 30000);
act.moveToElement(choseFile).click().perform();
Thread.sleep(3000);
uploadFile("C:\\Users\\Hp\\r.png");
Thread.sleep(5000);
action.click(getDriver(), assignattributesavebtn);


//////////////////////////////////////Variants option ////////////////////////////////////////////////

action.implicitWait(getDriver(), 30000);
getDriver().findElement(By.linkText("Variants")).click();	
action.click(getDriver(), variantsaddoption);
action.type(inputoptiontitle, "000"+faker.name().firstName());
action.click(getDriver(), addoptionvalue);
action.type(addoptionvalue1, "000"+faker.name().firstName());
action.implicitWait(getDriver(), 30000);
action.click(getDriver(), sav);
}




///////////////////////////////////product testing 4///////////////////////////////////////////	



public void products4() throws InterruptedException, AWTException 
{	
action.click(getDriver(), productsbtn2);
action.click(getDriver(), addproductclick);
action.implicitWait(getDriver(), 10000);
action.type(skuinput, "000"+faker.name().firstName());	
action.implicitWait(getDriver(), 10000);
action.click(getDriver(), addproducksuku);
{
WebElement l =getDriver().findElement(By.id("general-tab"));
List<WebElement> productforuminput = l.findElements(By.tagName("input"));
int count = 0;
int index = 0;
String[] cars = {"BMW", "1", "23","234", "223", "56", "567","23423","123"};
outerloop:for (WebElement foruminput: productforuminput) {
if(count == 0) {
count = 1;
}else if(count ==1) {
String str = cars[index]; 
foruminput.sendKeys(str);
index= index+1;
System.out.println(cars[index]+","+index);
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

action.click(getDriver(), brandadd);
action.type(brandinput, "ass");
action.click(getDriver(), vendoradd);
action.type(vendorinput, "ass");
action.click(getDriver(), categoryadd);
action.type(categoryinput, "ass");
action.click(getDriver(), storeadd);
action.type(storeinput, "ass");
action.click(getDriver(), storesavebtn);
//////////////////////////Seo Attributes/////////////////////////////

getDriver().findElement(By.linkText("SEO Attributes")).click();	
action.type(seotags, "ass");
action.click(getDriver(), storesavebtn);

/////////////////////////////Attribute Set/////////////////////////////////////////////////////
getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
getDriver().findElement(By.linkText("Attribute Set")).click();	
action.click(getDriver(), attibutesetsclick);
action.click(getDriver(), selectallclcik);	
action.click(getDriver(), assignattributeokbtn);
action.click(getDriver(), assignattributeclick);
action.click(getDriver(), assignattributesavebtn);

/////////////////////////////////// MEdia/////////////////////////////////

action.implicitWait(getDriver(), 10000);
getDriver().findElement(By.linkText("Media")).click();	
Actions act= new Actions(getDriver());
action.implicitWait(getDriver(), 30000);
WebElement choseFile=getDriver().findElement(By.xpath("//div[@id='files']"));
action.implicitWait(getDriver(), 30000);
act.moveToElement(choseFile).click().perform();
Thread.sleep(3000);
uploadFile("C:\\Users\\Hp\\r.png");
Thread.sleep(5000);
action.click(getDriver(), assignattributesavebtn);


//////////////////////////////////////Variants option ////////////////////////////////////////////////

action.implicitWait(getDriver(), 30000);
getDriver().findElement(By.linkText("Variants")).click();	
action.click(getDriver(), variantsaddoption);
action.type(inputoptiontitle, "000"+faker.name().firstName());
action.click(getDriver(), addoptionvalue);
action.type(addoptionvalue1, "000"+faker.name().firstName());
action.implicitWait(getDriver(), 30000);
action.click(getDriver(), sav);
}



///////////////////////////////////product testing 5///////////////////////////////////////////	



public void products5() throws InterruptedException, AWTException 
{	
action.click(getDriver(), productsbtn2);
action.click(getDriver(), addproductclick);
action.implicitWait(getDriver(), 10000);
action.type(skuinput, "000"+faker.name().firstName());	
action.implicitWait(getDriver(), 10000);
action.click(getDriver(), addproducksuku);
{
WebElement l =getDriver().findElement(By.id("general-tab"));
List<WebElement> productforuminput = l.findElements(By.tagName("input"));
int count = 0;
int index = 0;
String[] cars = {"BMW", "1", "23","234", "223", "56", "567","23423","123"};
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
}}
index=0;
}

action.click(getDriver(), brandadd);
action.type(brandinput, "ass");
action.click(getDriver(), vendoradd);
action.type(vendorinput, "ass");
action.click(getDriver(), categoryadd);
action.type(categoryinput, "ass");
action.click(getDriver(), storeadd);
action.type(storeinput, "ass");
action.click(getDriver(), storesavebtn);
//////////////////////////Seo Attributes/////////////////////////////

getDriver().findElement(By.linkText("SEO Attributes")).click();	
action.type(seotags, "ass");
action.click(getDriver(), storesavebtn);

/////////////////////////////Attribute Set/////////////////////////////////////////////////////
getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
getDriver().findElement(By.linkText("Attribute Set")).click();	
action.click(getDriver(), attibutesetsclick);
action.click(getDriver(), selectallclcik);	
action.click(getDriver(), assignattributeokbtn);
action.click(getDriver(), assignattributeclick);
action.click(getDriver(), assignattributesavebtn);

/////////////////////////////////// MEdia/////////////////////////////////

action.implicitWait(getDriver(), 10000);
getDriver().findElement(By.linkText("Media")).click();	


Actions act= new Actions(getDriver());
action.implicitWait(getDriver(), 30000);
WebElement choseFile=getDriver().findElement(By.xpath("//div[@id='files']"));
action.implicitWait(getDriver(), 30000);
act.moveToElement(choseFile).click().perform();
Thread.sleep(3000);
uploadFile("C:\\Users\\Hp\\r.png");
Thread.sleep(5000);
action.click(getDriver(), assignattributesavebtn);


//////////////////////////////////////Variants option ////////////////////////////////////////////////

action.implicitWait(getDriver(), 30000);
getDriver().findElement(By.linkText("Variants")).click();	
action.click(getDriver(), variantsaddoption);
action.type(inputoptiontitle, "000"+faker.name().firstName());
action.click(getDriver(), addoptionvalue);
action.type(addoptionvalue1, "000"+faker.name().firstName());
action.implicitWait(getDriver(), 30000);
action.click(getDriver(), sav);

*/

}}

