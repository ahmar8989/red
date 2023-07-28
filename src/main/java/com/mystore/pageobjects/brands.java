package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class brands extends BaseClass {
	
	Action action= new Action();
	
	Faker faker = new Faker();

	
	@FindBy(xpath="//span[normalize-space()='Brands']")
	private WebElement brandoptn;
	
	@FindBy(xpath="//a[@id='add-brands']")
	private WebElement addbrand;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement inputbrandname;
	
	
	@FindBy(xpath="//button[@id='pro_bran_create_btn']")
	private WebElement brandsavebtn;
		
	
	public brands() {
		PageFactory.initElements(getDriver(), this);
	}
	public String getCurrURL() throws Throwable {
		String brandsURL=action.getCurrentURL(getDriver());
		System.out.println(brandsURL);
		return brandsURL;
	}
	
	

	
	public void brand1() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand2() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname,"brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand3() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand4() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand5() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand6() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "brands"+faker.name().firstName());	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand7() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "new brand7");	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand8() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "new brand8");	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand9() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "new brand9");	
		action.click(getDriver(), brandsavebtn);	
	 }
	
	public void brand10() {
		action.click(getDriver(), brandoptn);
		action.click(getDriver(), addbrand);
		action.type(inputbrandname, "new brand10");	
		action.click(getDriver(), brandsavebtn);	
	 }
}
