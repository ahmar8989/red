package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class vendor extends BaseClass {
	
	Action action= new Action();
	
	Faker faker = new Faker();

	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath="//button[@id='login_login_btn']")
	private WebElement signInBtn;
/////////////////////////////////////////////////vendor page ///////////////////////////////
	
	@FindBy(xpath="//i[@class='flaticon flaticon-vendor d-flex align-items-center icon-size']")
	private WebElement vendorbtn;
	
	@FindBy(xpath="//a[@id='add-retailer']")
	private WebElement invitevendorbtn;
	
	
	@FindBy(xpath="//input[@id='fname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//span[@class='placeholder']")
	private WebElement selectstore;
	
	@FindBy(xpath="//label[normalize-space()='Default']")
	private WebElement listindex;
		
	@FindBy(xpath="//p[@class='btnOk']")
	private WebElement okbtn;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebtn;
	
	
	
	
	
	public vendor() {
		PageFactory.initElements(getDriver(), this);
	}
/*	
public String getCurrURL() throws Throwable {
	String vendorURL=action.getCurrentURL(getDriver());
	return vendorURL;
}
*/
	public void  login() throws Throwable {
	
		action.type(userName, "mirzarar59@gmail.com");
		action.type(password, "61ae01ae");
		action.click(getDriver(), signInBtn);

 }


public void addvendor1() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tossjemtsad");
	action.type(lastname, "crurserssdseasdsd");
	action.type(email, faker.name().firstName()+"@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);
		
}
public void addvendor2() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tomonemm");
	action.type(lastname, "cruseonne");
	action.type(email, faker.name().firstName()+"@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}

public void addvendor3() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "use@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}

public void addvendor4() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, faker.name().firstName()+"@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor5() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, faker.name().firstName()+"@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor6() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "tsdfsfe@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor7() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "tomdsdfsfe@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor8() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "taseqw@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor9() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "tomsdadad@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}


public void addvendor10() {
	
	action.click(getDriver(), vendorbtn);
	action.click(getDriver(), invitevendorbtn);
	action.type(firstname, "tom");
	action.type(lastname, "cruse");
	action.type(email, "tomcrusdasdasd@gmail.com");
	action.type(phone, "923934828934");
	action.explicitWait(getDriver(), selectstore, 110);
	action.click(getDriver(), selectstore);
	action.explicitWait(getDriver(), listindex, 110);
	action.click(getDriver(), listindex);
	action.explicitWait(getDriver(), okbtn, 110);
	action.click(getDriver(), okbtn);
	action.click(getDriver(), savebtn);


}




}