package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class attributeSet extends BaseClass {
	
	Action action= new Action();
	
	
	Faker faker = new Faker();

		
	@FindBy(xpath="//span[normalize-space()='Attribute Sets']")
	private WebElement attributeSetbtn1;
	
	
	@FindBy(xpath="//span[normalize-space()='Attribute Sets']")
	private WebElement attributeSetbtn;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement attributeSetname;
	
	
	@FindBy(xpath="//a[@id='add-family']")
	private WebElement attributeSetbtn3;
	
	@FindBy(xpath="//button[@id='pro_fam_create_btn']")
	private WebElement attributeSetsavebtn;
	
	
	public attributeSet() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void attSet() {
        getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");

		
		action.click(getDriver(), attributeSetbtn1);
			
		action.click(getDriver(), attributeSetbtn);
				
		action.click(getDriver(), attributeSetbtn3);
		
		action.type(attributeSetname,"000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
				
	}
	public void attSet1() {
		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	
	public void attSet2() {

		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	public void attSet3() {

		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	public void attSet4() {

		
		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	public void attSet5() {

		
		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
		
	}
	public void attSet6() {

		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	public void attSet7() {

		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
	}
	
	public attribute attSet8() {

		
		getDriver().navigate().to("https://app.getapimio.com/products/family/create");
		
        action.type(attributeSetname, "000"+faker.name().firstName());
		
		action.click(getDriver(), attributeSetsavebtn);
		
		
		return new attribute();
	}
		 public String getCurrURL() throws Throwable {
				String attributeSetURL=action.getCurrentURL(getDriver());
				return attributeSetURL;
		
		
	}
	
}
