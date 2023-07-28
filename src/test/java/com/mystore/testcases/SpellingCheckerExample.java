package com.mystore.testcases;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.SpellChecks;
import com.mystore.pageobjects.homepageobjects;
import com.mystore.pageobjects.spell;
import com.mystore.utility.Log;
import com.swabunga.spell.engine.SpellDictionary;
import com.swabunga.spell.event.SpellCheckEvent;
import com.swabunga.spell.event.SpellCheckListener;
import com.swabunga.spell.event.SpellChecker;
import com.swabunga.spell.event.StringWordTokenizer;

public class SpellingCheckerExample extends BaseClass {
	

	  spell Spell;
	  SpellChecks spellchecks;

	 
	@Parameters("browser") 	
	@BeforeMethod
	public void setup(String browser ) {
		launchApp(browser); 
	}
	
	@AfterMethod()
	public void tearDown() {
	//	 driver.quit();
	}


@Test()
	
public void nn() throws Throwable {
	spellchecks = new SpellChecks();
	
//	SpellChecks.newx();
	
	//   Spell= new spell();
	  //Spell.khan();
	  

}
}




