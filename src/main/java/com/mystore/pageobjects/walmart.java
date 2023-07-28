package com.mystore.pageobjects;
/**
 * 
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class walmart extends BaseClass {

    Action action = new Action();

    @FindBy(xpath="//input[@name='Email Address']")
    private WebElement userName;

    @FindBy(xpath="//input[@aria-label='Enter your password']")
    private WebElement password;

    @FindBy(xpath="//button[normalize-space()='Sign In']")
    private WebElement signinbtn;

    @FindBy(xpath="//button[normalize-space()='Continue']")
    private WebElement continuebtn;

    public walmart() {
        PageFactory.initElements(getDriver(), this);
    }

    public void login() throws Throwable {

   //     getDriver().get("https://www.walmart.com/account/login");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");

        action.type(userName, "hamza848riaz@gmail.com");
        action.click(getDriver(), continuebtn);
        action.type(password, "61ae01AE");
        action.click(getDriver(), signinbtn);





      
    }
}
