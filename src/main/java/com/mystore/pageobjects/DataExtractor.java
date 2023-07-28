package com.mystore.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mystore.base.BaseClass;

public class DataExtractor extends BaseClass {
	
	public static void setClipBoard(String file) {
		StringSelection obj= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	
	public static void uploadFile(String filePath) throws AWTException {
		setClipBoard(filePath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
}
	
	public void importmodule() throws InterruptedException, AWTException {
		
		
		
		WebDriver driver = getDriver(); // get the driver instance from the BaseClass
		
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 is the timeout in seconds
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-12 ms-1']//a[2]")));
		element.click();
		
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='file_box_hover']")));
		element2.click();
		
	    Thread.sleep(3000);
	    uploadFile("exampl");
	    
		WebElement nextbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='next-btn']")));
		nextbtn.click();
		
		WebElement checkbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ignore_unmapped']")));
		checkbtn.click();
		
		WebElement nextbtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='pro_imp_btn']")));
		nextbtn1.click();
		
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("version")));

		Select select = new Select(dropdown);
		
		select.selectByVisibleText("EN-US");
		
		WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("catalog")));

		Select select2 = new Select(dropdown2);
		
		select2.selectByVisibleText("Default");
		
		WebElement importbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pro_imp_start_btn']")));
		importbtn.click();
		Thread.sleep(9000);
	
		
	}

	

    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	
        DataExtractor extractor = new DataExtractor();
        List<Map<String, String>> extractedData = extractor.extract();

        String csvPath = "src/test/resources/TestData/file3.csv";
        List<Map<String, String>> csvData = readCSVFile(csvPath);

        String htmlReportPath = "src/test/resources/TestData/htmlResult.html";
        generateHtmlReport(extractedData, csvData, htmlReportPath);
    }
    

    public static List<Map<String, String>> readCSVFile(String path) throws IOException {
        List<Map<String, String>> data = new ArrayList<>();
        try (FileReader reader = new FileReader(path); CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {
            for (CSVRecord record : csvParser) {
                Map<String, String> rowData = new HashMap<>();
                for (String header : csvParser.getHeaderNames()) {
                    rowData.put(header, record.get(header));
                }
                data.add(rowData);
            }
        }
        return data;
    }
    

    public List<Map<String, String>> extract() throws InterruptedException {
        // Initialize the driver (omitted for brevity)
        // ...
    	Thread.sleep(8000);
        getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");

        int skuIndex = 1; // Start with the first SKU
        int numProducts = getDriver().findElements(By.xpath("//tr[contains(@class, 'product_row')]/td[3]")).size();

        List<Map<String, String>> productList = new ArrayList<>();

        while (skuIndex <= numProducts) {
            try {
            	// Find the SKU element using its index
	            WebDriverWait wait = new WebDriverWait(getDriver(), 20);
	            WebElement skuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[contains(@class, 'product_row')]/td[3])[" + skuIndex + "]")));
	            // Click on the SKU element
	            skuElement.click();

	            // Wait for the page to load
	            WebDriverWait wait1 = new WebDriverWait(getDriver(), 20);
	            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("product_content")));

	            
	            // Extract the product information
	            WebElement productContent = getDriver().findElement(By.id("product_content"));
	            System.out.println("ok11");

	            String sku = getDriver().findElement(By.id("sku")).getAttribute("value");
	            System.out.println("SKU: " + sku);
	            
	            String productname = getDriver().findElement(By.id("product_name")).getAttribute("value");
	            System.out.println("ProductName: " + productname);

	            String upcEanIsbn = getDriver().findElement(By.id("upc_barcode")).getAttribute("value");
	            System.out.println("UPC/EAN/ISBN: " + upcEanIsbn);

	            String price = getDriver().findElement(By.id("price")).getAttribute("value");
	            System.out.println("Price: " + price);

	            String compareAtPrice = getDriver().findElement(By.id("compare_at_price")).getAttribute("value");
	            System.out.println("Compare at Price: " + compareAtPrice);

	            String costPrice = getDriver().findElement(By.id("cost_price")).getAttribute("value");
	            System.out.println("Cost Price: " + costPrice);

	            String quantity = getDriver().findElement(By.id("quantity")).getAttribute("value");
	            System.out.println("Quantity: " + quantity);

	            String weight = getDriver().findElement(By.id("weight")).getAttribute("value");
	            System.out.println("Weight: " + weight);

	            String description = getDriver().findElement(By.xpath("//div[@id='general-tab']//div//div[@role='application']")).getAttribute("innerHTML");
	       //     System.out.println("Description: " + description);


	            
	            
            
	            
	            
	         // Extract brand
	         // Extract brand
	            String brandElement = getDriver().findElement(By.id("brand")).getAttribute("value");
	            String brand = new Select(getDriver().findElement(By.id("brand"))).getFirstSelectedOption().getText();
	            System.out.println("Brand: " + brand);


	            
	            // Extract vendors
	         // Extract vendor
	            String vendorElement = getDriver().findElement(By.id("vendor")).getAttribute("value");
	            String vendor = new Select(getDriver().findElement(By.id("vendor"))).getFirstSelectedOption().getText();
	            System.out.println("Vendor: " + vendor);

	            
	         // Extract category
	            String categoryElement = getDriver().findElement(By.xpath("//input[@id='justAnotherInputBox']")).getAttribute("value");
	            System.out.println("Category Element: " + categoryElement);


	            
	            String store = new Select(getDriver().findElement(By.xpath("//select[@id='channels']")))
	                     .getFirstSelectedOption().getText();
	            System.out.println("store: " + store);

	            
	            WebElement att = getDriver().findElement(By.xpath("//a[normalize-space()='SEO Attributes']"));

	            // Click on the SKU element
	            att.click();
	            
	            productContent = getDriver().findElement(By.id("product_content"));
	            
	            
	            


	            // Extract URL Slug, SEO Title, SEO Description, and Tags
	         //   WebElement productContent = getDriver().findElement(By.id("product_content"));
	            String urlSlug = productContent.findElement(By.id("seo_url")).getAttribute("value");
	            System.out.println("URL Slug: " + urlSlug);
	            String seoTitle = productContent.findElement(By.id("seo_title")).getAttribute("value");
	            System.out.println("SEO Title: " + seoTitle);
	            String seoDescription = productContent.findElement(By.id("mytextarea")).getAttribute("value");
	            System.out.println("SEO Description: " + seoDescription);
	            String tags = productContent.findElement(By.id("seo_keyword")).getAttribute("value");
	            System.out.println("Tags: " + tags);

	            // Create a dictionary containing the product information
	            Map<String, String> product = new HashMap<>();
	            product.put("SKU", sku);
	            product.put("Product Name", productname);
	            product.put("UPC/EAN/ISBN", upcEanIsbn);
	            product.put("Price", price);
	            product.put("Compare at Price", compareAtPrice);
	            product.put("Cost Price", costPrice);
	            product.put("Quantity", quantity);
	            product.put("Weight", weight);
	       //     product.put("Description", description);
	            product.put("Brand", brand);
	            product.put("Vendor", vendor);
	            product.put("Category", categoryElement);
	            product.put("Channels", store.toString());
	            product.put("URL Slug", urlSlug);
	            product.put("SEO Title", seoTitle);
	            product.put("SEO Description", seoDescription);
	            product.put("Tags", tags);

	            productList.add(product);

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");

	            // Increment the index to move to the next SKU
	            skuIndex++;

	        } catch (NoSuchElementException e) {
	            // No more SKUs, break the loop
	            break;
	        }}
		return productList;
	    }
        
    public static void generateHtmlReport(List<Map<String, String>> extractedData, List<Map<String, String>> csvData, String htmlReportPath) throws IOException {
        List<String> attributeOrder = Arrays.asList("SKU", "Product Name", "UPC/EAN/ISBN", "Price", "Compare at Price", "Cost Price", "Quantity", "Weight", "Description", "Brand", "Vendor", "Category", "Channels", "URL Slug", "SEO Title", "SEO Description", "Tags");

        // Create a mapping between attribute names and the corresponding CSV column names
        Map<String, String> attributeToCsvColumnMap = new HashMap<>();
        for (String attribute : attributeOrder) {
            attributeToCsvColumnMap.put(attribute, attribute); // Assuming the CSV column names are the same as the attribute names
        }

        File file = new File(htmlReportPath);
        try (FileWriter fw = new FileWriter(file)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<style>");
            pw.println("table {width: 100%; border-collapse: collapse;}");
            pw.println("th, td {border: 1px solid black; padding: 15px; text-align: left;}");
            pw.println(".no-match {background-color: #f2dede;}");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<header>");
            pw.println("<h1>EndToEndImport Module Testing</h1>");

            int totalMatch = 0;
            int totalMismatch = 0;
            int totalScore = 0;

            for (int productIndex = 0; productIndex < extractedData.size(); productIndex++) {
                Map<String, String> actualProduct = extractedData.get(productIndex);
                Map<String, String> expectedProduct = csvData.get(csvData.size() - 1 - productIndex);

                int productScore = 0;
                for (String key : attributeOrder) {
                    String csvKey = attributeToCsvColumnMap.get(key);
                    String actualValue = actualProduct.get(key);
                    String expectedValue = expectedProduct.get(csvKey);
                    String comparisonResult = (actualValue != null && actualValue.equals(expectedValue)) ? "Match" : "No Match";

                    if (comparisonResult.equals("Match")) {
                        totalMatch++;
                        productScore++;
                    } else {
                        totalMismatch++;
                    }
                }
                totalScore += productScore;
            }

            pw.printf("<h2>Overall Score: %d / %d</h2>%n", totalScore, totalMatch + totalMismatch);

            pw.println("</header>");

            for (int productIndex = 0; productIndex < extractedData.size(); productIndex++) {
                pw.printf("<h2>Product %d</h2>%n", productIndex + 1);
                pw.println("<table>");
                pw.printf("<tr><th>Attribute</th><th>Extracted Data</th><th>CSV Data</th><th>Result</th></tr>%n");

                Map<String, String> actualProduct = extractedData.get(productIndex);
                Map<String, String> expectedProduct = csvData.get(csvData.size() - 1 - productIndex);

                int productScore = 0;
                for (String key : attributeOrder) {
                    String csvKey = attributeToCsvColumnMap.get(key);
                    String actualValue = actualProduct.get(key);
                    String expectedValue = expectedProduct.get(csvKey);
                    String comparisonResult = (actualValue != null && actualValue.equals(expectedValue)) ? "Match" : "No Match";
                    String cellStyle = comparisonResult.equals("No Match") ? "class=\"no-match\"" : "";
                    pw.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td %s>%s</td></tr>%n", key, actualValue, expectedValue, cellStyle, comparisonResult);

                    if (comparisonResult.equals("Match")) {
                        productScore++;
                    }
                }

                pw.println("</table>");
                pw.printf("<p>Product Score: %d / %d</p>%n", productScore, attributeOrder.size());
            }

            pw.printf("<p>Total Matches: %d</p>%n", totalMatch);
            pw.printf("<p>Total Mismatches: %d</p>%n", totalMismatch);
            pw.println("</body>");
            pw.println("</html>");
            pw.close();
        }

    }
}
