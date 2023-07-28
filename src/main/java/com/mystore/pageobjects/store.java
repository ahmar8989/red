package com.mystore.pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;



public class store extends BaseClass {
	

	Action action= new Action();
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath="//button[@id='login_login_btn']")
	private WebElement signInBtn;
	///////////////////////////////store objects////////////////////////
	
	@FindBy(xpath="//div[contains(text(),'Products')]")
	private WebElement productsClick;
	
	@FindBy(xpath="//span[normalize-space()='Stores']")
	private WebElement storeClick;
	
	@FindBy(xpath="//a[@id='add-family']")
	private WebElement addNewClick;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement storeName;
	
	@FindBy(xpath="//select[@name='versions']")
	private WebElement langugeSection;
	
	@FindBy(xpath="//button[@id='chan_ctlg_create_btn']")
	private WebElement savebtn;
	




public store() {
	PageFactory.initElements(getDriver(), this);
}
public String getCurrURL() throws Throwable {
	String storeURL=action.getCurrentURL(getDriver());
	return storeURL;
}

public void  login() throws Throwable {

	action.type(userName, "mirzarar59@gmail.com");
	action.type(password, "61ae01ae");
	action.click(getDriver(), signInBtn);
}

public void store1() {
//	action.click(getDriver(), productsClick);
	action.click(getDriver(), storeClick);
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store1");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }
public void store2() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store2");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store3() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store3");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store4() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store4");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store5() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store5");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store6() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store6");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store7() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store7");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store8() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store8");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store9() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store9");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
 }

public void store10() {
	action.click(getDriver(), addNewClick);
	action.type(storeName, "new store10");
    Select s = new Select(langugeSection);
    s.selectByIndex(1);	
	action.click(getDriver(), savebtn);	
//	Vendor = new vendor();
//	return new vendor();
 }





}
