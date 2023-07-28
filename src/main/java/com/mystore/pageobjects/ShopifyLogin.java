package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ShopifyLogin extends BaseClass {
	
	
	Action action= new Action();
	
	@FindBy(xpath="//input[@id='account_email']")
	private WebElement shopifyLogin;
	
	
	@FindBy(xpath="//button[@name='commit']")
	private WebElement shopifyLoginbtn;
	
	@FindBy(xpath="//input[@id='account_password']")
	private WebElement pswrdinputclick;
	
	@FindBy(xpath="//button[@name='commit']")
	private WebElement pswrdbtn;
	
	
	
	
	
	public ShopifyLogin() {
		PageFactory.initElements(getDriver(), this);
	}

	
	public  void ShopifyLog() throws InterruptedException {
		
		
    	getDriver().navigate().to("https://accounts.shopify.com/lookup?rid=bd9b0f56-7a5a-4720-a117-e66e156720b7");
    	action.type(shopifyLogin, "gali@ooober.com");
    	Thread.sleep(5000);
    	action.click(getDriver(), shopifyLoginbtn);
    	Thread.sleep(5000);

    	//action.click(getDriver(), pswrdinputclick);
    	action.type(pswrdinputclick, "Apimiodevs123");
    	Thread.sleep(5000);

    	action.click(getDriver(), pswrdbtn);


    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
