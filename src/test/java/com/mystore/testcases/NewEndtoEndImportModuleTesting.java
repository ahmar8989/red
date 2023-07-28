package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.DataExtractor;
import com.mystore.pageobjects.LoginPage;



public class NewEndtoEndImportModuleTesting extends BaseClass {
    LoginPage loginPage;
    public DataExtractor extractor;

    @Parameters("browser")    
    @BeforeMethod
    public void setup(String browser ) {
        launchApp(browser); 
    }
    
    @AfterMethod()
    public void tearDown() {
    //    getDriver().quit();
    }
//
    @Test()
    public void loginTest() throws Throwable {
        loginPage = new LoginPage();
        loginPage.login();
        
        extractor = new DataExtractor();
     //   extractor.importmodule();
     
        extractor = new DataExtractor();
        java.util.List<java.util.Map<String, String>> extractedData = extractor.extract();

        // Add these lines
        String csvPath = "src/test/resources/TestData/file3.csv";
        java.util.List<java.util.Map<String, String>> csvData = DataExtractor.readCSVFile(csvPath);

        String htmlReportPath = "src/test/resources/TestData/htmlResult.html";
        DataExtractor.generateHtmlReport(extractedData, csvData, htmlReportPath);
        
    }
}
