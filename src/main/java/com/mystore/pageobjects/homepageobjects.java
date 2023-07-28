package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class homepageobjects extends BaseClass {
	
Action action= new Action();

	@FindBy(xpath="//button[normalize-space()='Sign in']")
	private WebElement productClick;
	
	public homepageobjects() {
		PageFactory.initElements(getDriver(), this);
		
	//	action.type(productClick, "ahmar@gmail.com");
		action.click(getDriver(), productClick);
		

}

	public void productClick() {
		// TODO Auto-generated method stub
		
	}
}