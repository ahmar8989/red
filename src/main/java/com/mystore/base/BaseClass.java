package com.mystore.base;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.ietf.jgss.Oid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.mystore.actiondriver.Action;
import com.mystore.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;

	// Declare ThreadLocal Driver
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	//loadConfig method is to load the configuration
	@BeforeSuite()

	public void loadConfig() {
	//	ExtentManager.setExtent();
	//	DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/Configuration/Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void launchApp(String browserName) {
	    if (browserName.equalsIgnoreCase("Chrome")) {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        WebDriverManager.chromedriver().setup();
	        driver.set(new ChromeDriver(options));
	    } else if (browserName.equalsIgnoreCase("FireFox")) {
	        WebDriverManager.firefoxdriver().setup();
	        driver.set(new FirefoxDriver());
	    } else if (browserName.equalsIgnoreCase("IE")) {
	        WebDriverManager.iedriver().setup();
	        driver.set(new InternetExplorerDriver());
	    }
	    
	    getDriver().manage().window().maximize();
	    getDriver().manage().deleteAllCookies();
	    getDriver().get(prop.getProperty("url"));
	}


	public List<String[]> readCsv(String filePath) throws IOException {
	    List<String[]> rows = new ArrayList<>();
	    try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] fields = line.split(",");
	            rows.add(fields);
	        }
	    }
	    return rows;
	}

	@AfterSuite()
	public void afterSuite() {
	//	ExtentManager.endReport();
	}
}
