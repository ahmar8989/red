package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

import com.mystore.base.BaseClass;
import com.swabunga.spell.engine.SpellDictionaryHashMap;
import com.swabunga.spell.event.SpellChecker;

public class spell extends BaseClass {
    public static void khan() throws IOException {
        // Open the webpage in a browser
    
    	getDriver().navigate().to("https://app.getapimio.com/");
        
        //Create an instance of SpellChecker class
        SpellChecker spellChecker = new SpellChecker(new SpellDictionaryHashMap());
        
        
        List<WebElement> elements = getDriver().findElements(By.xpath("//div[@class='row h-100']"));
        for (WebElement element : elements) {
            String text = element.getText().toLowerCase(); // Convert text to lowercase
            if (spellChecker.isCorrect(text)) {
                System.out.println("Spelling is correct for: " + text);
            } else {
                System.out.println("Spelling mistake found: " + text);
            }
        }
    }
}