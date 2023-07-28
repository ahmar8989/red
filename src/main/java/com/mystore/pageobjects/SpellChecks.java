package com.mystore.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpellChecks {

    private static WebDriver driver;
    private static String text;

    public static void main(String[] args) throws Exception {
        //Initialize chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\New folder (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        
        //Navigate to the website you want to check
        driver.navigate().to("https://app.getapimio.com/");
        
        //Retrieve the text you want to check for spelling errors
        text = driver.findElement(By.xpath("//div[@class='row h-100']")).getText();
        
        //Execute the checkSpelling method
        Object result = ((JavascriptExecutor) driver).executeScript("return window.spellChecker.checkSpelling('"+text+"')");
        
        //Check if the spellChecker object is present and throw an exception if it's not
        if(result == null || (result != null && !result.equals("undefined"))){
            throw new Exception("The spellChecker object is not present or it is not available in the current context.");
        }
        
        //Print the result of the spelling check
        System.out.println("Misspelled words: " + result);
        driver.quit();
    }
}
