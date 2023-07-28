package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
    Action action = new Action();

    @FindBy(xpath = "//input[@id='join_neu_email_field']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='join_neu_password_field']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    private WebElement signInBtn;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    private WebElement register;

    @FindBy(xpath = "//input[@id='join_neu_first_name_field']")
    private WebElement firstname;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    private WebElement regbtn;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    private WebElement signinbrn;

    @FindBy(xpath = "//button[@aria-label='You with 0 notifications']")
    private WebElement logoutbtn;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/logout.php?ref=hdr_user_menu-signout']")
    private WebElement logoutbtn2;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public homepageobjects login() throws Throwable {
        // Click on the sign-in button
        action.click(getDriver(), signInBtn);

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        /*
        
        WebElement registerElement = wait.until(ExpectedConditions.elementToBeClickable(register));
		action.click(getDriver(), registerElement);
		Thread.sleep(3000);
		// Wait until the 'email' element is visible before typing the email address
		WebElement emailElement = wait.until(ExpectedConditions.visibilityOf(email));
		action.type(emailElement, "softwareenginerahmar@gmail.com");

		// Type other fields
		WebElement firstnameElement = wait.until(ExpectedConditions.visibilityOf(firstname));
		action.type(firstnameElement, "Ahmar");

		WebElement passwordElement = wait.until(ExpectedConditions.visibilityOf(password));
		action.type(passwordElement, "ahmar123");
		
		
		
		
*/
        // Wait until the 'email' element is visible before typing the email address
        WebElement emailElement3 = wait.until(ExpectedConditions.visibilityOf(email));
        action.type(emailElement3, "softwareenginerahmar@gmail.com");

        // Type the password
        WebElement passwordElement4 = wait.until(ExpectedConditions.visibilityOf(password));
        action.type(passwordElement4, "P@ssw0rd!23");

        // Click on the sign-in button
        action.click(getDriver(), signinbrn);

        // Wait until logout button is visible and then click
        WebElement logoutBtnElement = wait.until(ExpectedConditions.visibilityOf(logoutbtn));
        action.click(getDriver(), logoutBtnElement);

        // Wait until logout button 2 is visible and then click
        WebElement logoutBtn2Element = wait.until(ExpectedConditions.visibilityOf(logoutbtn2));
        action.click(getDriver(), logoutBtn2Element);
        
        
        
        
        
        
        
        action.click(getDriver(), signInBtn);

        WebDriverWait wait1 = new WebDriverWait(getDriver(), 10);
        
        
        
        
        // Wait until the 'email' element is visible before typing the email address
        WebElement emailElementz = wait1.until(ExpectedConditions.visibilityOf(email));
        action.type(emailElementz, "muhammadahmar8989@gmail.com");

        // Type the password
        WebElement passwordElementz = wait.until(ExpectedConditions.visibilityOf(password));
        action.type(passwordElementz, "P@ssw0rd!23");

        // Click on the sign-in button
        action.click(getDriver(), signinbrn);

        // Wait until logout button is visible and then click
        WebElement logoutBtnElemenz = wait.until(ExpectedConditions.visibilityOf(logoutbtn));
        action.click(getDriver(), logoutBtnElemenz);

        // Wait until logout button 2 is visible and then click
        WebElement logoutBtn2Elementz = wait.until(ExpectedConditions.visibilityOf(logoutbtn2));
        action.click(getDriver(), logoutBtn2Elementz);
        
        
        
        action.click(getDriver(), signInBtn);

        WebDriverWait wait3 = new WebDriverWait(getDriver(), 10);
        
        // Wait until the 'email' element is visible before typing the email address
        WebElement emailElementzq = wait3.until(ExpectedConditions.visibilityOf(email));
        action.type(emailElementzq, "dfs@gmail.com");

        // Type the password
        WebElement passwordElementzq = wait.until(ExpectedConditions.visibilityOf(password));
        action.type(passwordElementzq, "P@ssw0rd!23");

        // Click on the sign-in button
        action.click(getDriver(), signinbrn);

        // Wait until logout button is visible and then click
        WebElement logoutBtnElemenzq = wait.until(ExpectedConditions.visibilityOf(logoutbtn));
        action.click(getDriver(), logoutBtnElemenzq);

        // Wait until logout button 2 is visible and then click
        WebElement logoutBtn2Elementzq = wait.until(ExpectedConditions.visibilityOf(logoutbtn2));
        action.click(getDriver(), logoutBtn2Elementzq);
             

        // Assertion: Verify that the logout is successful
        Assert.assertTrue(isLoggedOutSuccessfully());

        // Now let's integrate the Cypress code after this line:

        getDriver().get("https://www.etsy.com/listing/385088054/instant-download-wall-art-print-quote?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=&ref=sr_gallery-1-4&organic_search_click=1");

        // Wait for the "Add to basket" button to be visible
        WebDriverWait wait4 = new WebDriverWait(getDriver(), 10);
        WebElement addToBasketButton = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='wt-btn wt-btn--filled wt-width-full']")));

        // Click on the "Add to basket" button
        action.click(getDriver(), addToBasketButton);
        
        Thread.sleep(3000);

        // Click on the "Keep browsing" button
        WebElement keepBrowsingButton = getDriver().findElement(By.xpath("//button[normalize-space()='Keep shopping']"));
        action.click(getDriver(), keepBrowsingButton);

        // Go to the cart page
        getDriver().get("https://www.etsy.com/cart?ref=hdr-cart");

        // Validate that the product is in the cart
        WebElement removeButton = getDriver().findElement(By.xpath("//span[normalize-space()='Remove']"));
        Assert.assertTrue(removeButton.isDisplayed());

        // Edit the product in the cart (you may perform specific edit actions here)
        // ...

        // Delete the product from the cart
        action.click(getDriver(), removeButton);

        // Validate that the product is no longer in the cart
        Assert.assertFalse(removeButton.isDisplayed());

        

        return new homepageobjects();
    }

    public String getCurrURL() throws Throwable {
        return action.getCurrentURL(getDriver());
    }

    private boolean isLoggedOutSuccessfully() {

        return true;
    }

    private boolean isLoggedInSuccessfully() {

        return true;
    }
}
