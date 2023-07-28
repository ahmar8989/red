package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrammarlySeleniumExample {

    public static void main(String[] args) throws InterruptedException {
        // Set up web driver
        System.setProperty("webdriver.chrome.driver", "C:\\New folder (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to website
        driver.get("https://app.getapimio.com/");

        // Locate text area element
        WebElement textArea = driver.findElement(By.xpath("//div[@class='row h-100']"));

        // Use Selenium Actions class to interact with text area
//        Actions actions = new Actions(driver);
//        actions.moveToElement(textArea);
//        actions.click();
//        actions.sendKeys("example text");
//        actions.perform();
Thread.sleep(5000);
        // Use JavascriptExecutor to interact with Grammarly extension
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("grammarly.proofread()");

        // Add your code here to check the grammar errors
        // You can use grammarly.proofread() to get the grammar error
        // and then use  grammarly.proofread().result to get error details.
        // You can also use grammarly.proofread().clean to get the corrected text.
        
        // Close the browser
        driver.quit();
    }
}
