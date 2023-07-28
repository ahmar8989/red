package com.mystore.pageobjects;

import java.io.FileWriter;

import java.io.IOException;

import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.io.FileOutputStream;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;





public class ImortmoduleObjects2 extends BaseClass{


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
	Action action= new Action();
	
	@FindBy(xpath="//i[@class='flaticon flaticon-product d-flex align-items-center icon-size']")
	private WebElement productsbtn;
	
	@FindBy(xpath="//a[@class='nav-link Roboto bold product_data imagescorecard active']")
	private WebElement attributebtn;
	
	@FindBy(xpath="//input[@id='import_proceed']")
	private WebElement proceedbtn;
	
	@FindBy(xpath="//div[@class='sidebar-sub-menu bg-light-grey-1 border-0 sidebar-width active']//a[8]")
	private WebElement importbtn;
	
	@FindBy(xpath="//div[@class='box__input text-center']")
	private WebElement csv;
	
	@FindBy(xpath="//select[@name='nodes[data][0][from][]']")
	private WebElement index;
	
	@FindBy(xpath="//button[@id='next-btn']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//input[@name='nodes[data][1][with]']")
	private WebElement separator;
	
	@FindBy(xpath="//input[@name='nodes[data][2][with]']")
	private WebElement glue;
	
	@FindBy(xpath="//div[@class='form-control short_code_div']")
	private WebElement mergeadvance;
	
	@FindBy(xpath="//input[@name='nodes[data][6][replace]']")
	private WebElement searchfield;
	
	@FindBy(xpath="//input[@name='nodes[data][6][with]']")
	private WebElement withfield;
	
	
	@FindBy(xpath="//a[normalize-space()='SEO Attributes']")
	private WebElement selectElement1;
	
	
	@FindBy(xpath="//a[normalize-space()='Add']")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[@id='vlookup_add']")
	private WebElement vlookadd;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement inputname;
	
	@FindBy(xpath="//textarea[@id='lookup_values']")
	private WebElement inputvalues;
	
	@FindBy(xpath="//button[@id='vlookup_btn']")
	private WebElement createbtn;
	
	@FindBy(xpath="//div[@id='vlookup_product']//span[@aria-hidden='true'][normalize-space()='×']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//input[@name='nodes[data][10][with]']")
	private WebElement calculateinput;
	
	@FindBy(xpath="//input[@name='nodes[data][11][with]']")
	private WebElement withinput;
	
	@FindBy(xpath="//h5[@class='m-0 p-2 Roboto regular']")
	private WebElement addoprtnbtn;
	
	@FindBy(xpath="//div[23]//div[4]//div[1]//div[2]//div[1]//a[1]//img[1]")
	private WebElement D1;
	
	@FindBy(xpath="//div[24]//div[4]//div[1]//div[2]//div[1]//a[1]//img[1]")
	private WebElement D2;
	
	@FindBy(xpath="//input[@id='ignore_unmapped']")
	private WebElement ignoreimportclick;
	
	@FindBy(xpath="//button[@id='pro_imp_btn']")
	private WebElement nextclick;
	
	@FindBy(xpath="//div[@id='template_checkbox_div']//label[@for='customSwitch1'][normalize-space()='Yes']")
	private WebElement templatebtn;
	
	@FindBy(xpath="//div[@id='import_product']//input[@name='temp_name']")
	private WebElement templateinput;
	
	
	@FindBy(xpath="//input[@id='pro_imp_start_btn']")
	private WebElement stratimportbtn;
	
	@FindBy(xpath="//button[@id='template_submit']")
	private WebElement csvnxtbtn;
	
	@FindBy(xpath="//button[@id='create_template']")
	private WebElement createnewtemplate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement productpage;

	@FindBy(xpath="//a[normalize-space()='SEO Attributes']")
	private WebElement attributeclick;
	


	
	public void importcsv() throws InterruptedException, AWTException, IOException {
	    PageFactory.initElements(getDriver(), this);
	    action.click(getDriver(), productsbtn);
	    action.click(getDriver(), importbtn);
	    action.click(getDriver(), csv);
	    action.implicitWait(getDriver(), 30000);
	    Thread.sleep(3000);
	    uploadFile("exampl");
	    // Copy the file to the resources directory
	    File sourceFile = new File("C:\\Users\\hamza\\exampl.csv");
	    File destFile = new File("src/test/resources/TestData/file.csv");
	    copyFile(sourceFile, destFile);
	    // Upload the file
	    uploadFile("file.csv");
	    Thread.sleep(3000);
	//    action.click(getDriver(), nextbtn);
	    if (action.isDisplayed(getDriver(), createnewtemplate)) {
	        action.click(getDriver(), createnewtemplate);
	    }
	}
	private void copyFile(File source, File dest) throws IOException {
	    try (FileInputStream fis = new FileInputStream(source);
	         FileOutputStream fos = new FileOutputStream(dest)) {
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = fis.read(buffer)) > 0) {
	            fos.write(buffer, 0, length);
	        }
	    }
	}

public void maping() throws InterruptedException, AWTException, IOException {
	
	


	action.click(getDriver(), nextbtn);
	Thread.sleep(5000);
	if (action.isDisplayed(getDriver(), proceedbtn)) {
		action.click(getDriver(), proceedbtn);
	}
	else
	{ System.out.print("ook");}
	
	if (action.isDisplayed(getDriver(), createnewtemplate)) {
		action.click(getDriver(), createnewtemplate);
	}
	else
	{ System.out.print("ok88");}

	Thread.sleep(4000);

	
	
	action.click(getDriver(), ignoreimportclick);
	action.JSClick(getDriver(), nextclick);	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	Thread.sleep(3000);
	WebElement languageDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mapping_product']//select[@id='version']")));
	Select selectLanguage = new Select(languageDropdown);
	selectLanguage.selectByVisibleText("EN-US");
	WebElement storeDropdown = getDriver().findElement(By.xpath("//div[@id='mapping_product']//select[@id='catalog']"));
	Select selectStore = new Select(storeDropdown);
	selectStore.selectByVisibleText("Default");
//	action.JSClick(getDriver(), templatebtn);
//	action.type(templateinput, "new template");
	action.JSClick(getDriver(), stratimportbtn);

}

public void importmodule2() throws InterruptedException, AWTException, IOException {
	  getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");

	  Random random = new Random();
	    int randomPage = random.nextInt(10) + 1; // generates a random number between 1 and 10		 
	    getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products?page=" + (randomPage + 1));
	    WebElement productTable = getDriver().findElement(By.id("main-table"));
	    List<WebElement> rows = productTable.findElements(By.xpath(".//tbody/tr"));
	    int randomIndex = random.nextInt(rows.size()); // generates a random number between 0 and the number of products in the table
	   WebElement selectedProduct = rows.get(randomIndex);
	    String SKU = selectedProduct.findElement(By.xpath(".//td[2]")).getText();
	    System.out.println("SKU: " + SKU);
	    System.out.println("Index: " + randomIndex);
	    System.out.println("Page: " + (randomPage + 1));
	    
	    selectedProduct.click();
	}

public void extractAndCompare() throws IOException, InterruptedException {
    List<String> expectedValues = readCSV1();
    int productIndex = 0;
    getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");
    List<List<String>> allActualValues = new ArrayList<>();
    int i = 1;
    while (true) {
        try {
        	WebElement product = getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[2]"));
        	product.click();
        	List<WebElement> inputs = getDriver().findElements(By.xpath("//*[@id='general-tab']//input"));
        	List<String> actualValues = new ArrayList<String>();
        	for (int j = 1; j < inputs.size(); j++) { // start from second element
        	    WebElement inputElement = inputs.get(j);
        	    String actualValue = inputElement.getAttribute("value");
        	    actualValues.add(actualValue);
        	}
            WebElement selectElement = null;
            List<WebElement> elements = null;
            try {
                selectElement = getDriver().findElement(By.xpath("//div[@class='card-body p-3']"));
                elements = selectElement.findElements(By.tagName("option"));
                elements.addAll(getDriver().findElements(By.id("justAnotherInputBox")));
            } catch (StaleElementReferenceException e) {
                selectElement = getDriver().findElement(By.xpath("//div[@class='card-body p-3']"));
                elements = selectElement.findElements(By.tagName("option"));
                elements.addAll(getDriver().findElements(By.id("justAnotherInputBox")));
            }
            for (WebElement element1 : elements) {
                try {
                    if (element1.getTagName().equals("option")) {
                        if (element1.isSelected()) {
                            String selectedOptionText = element1.getText();
                            actualValues.add(selectedOptionText);
                        }
                    } else if (element1.getAttribute("id").equals("justAnotherInputBox")) {
                        String inputValue = element1.getAttribute("value");
                        actualValues.add(inputValue);
                    }
                } catch (StaleElementReferenceException e) {
                    WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                    WebElement refreshedElement = wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element1)));
                    if (refreshedElement.getTagName().equals("option")) {
                        if (refreshedElement.isSelected()) {
                            String selectedOptionText = refreshedElement.getText();
                            actualValues.add(selectedOptionText);
                        }
                    } else if (refreshedElement.getAttribute("id").equals("justAnotherInputBox")) {
                        String inputValue = refreshedElement.getAttribute("value");
                        actualValues.add(inputValue);
                    }
                }
            }

              getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products/2607/seo/4");
            List<WebElement> inputs4 = getDriver().findElements(By.xpath("//*[starts-with(@name,'attribute[')]"));
            for (WebElement inputElement4 : inputs4) {
                String actualValue4 = inputElement4.getAttribute("value");
                actualValues.add(actualValue4);
            }
    //        allActualValues.add(actualValues);
            allActualValues.add(actualValues); // Add this line to populate allActualValues list
            getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");
            List<WebElement> products = getDriver().findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[2]"));
            if (i >= products.size()) {
                break;
            }
            i++;
        } catch (NoSuchElementException e) {
            break;
        }
    }
    // getDriver().quit();
    writeToHTML(allActualValues, expectedValues);
}

public List<String> readCSV1() throws IOException {
    List<String> values = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/TestData/file3.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            values.add(columns[0]);
        }
    }
    return values;
}
public void writeToHTML(List<List<String>> allActualValues, List<String> expectedValues) throws IOException {
    File file = new File("src/test/resources/TestData/file2.html");
    try (FileWriter fw = new FileWriter(file)) {
        PrintWriter pw = new PrintWriter(fw);
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<style>");
        pw.println("table, th, td { border: 1px solid black; border-collapse: collapse; padding: 5px; }");
        pw.println("th { background-color: #ddd; }");
        pw.println(".no-match { background-color: red; }");
        pw.println("</style>");
        pw.println("</head>");
        pw.println("<body>");
        int productIndex = 0;
        for (List<String> actualValues : allActualValues) {
            pw.printf("<h2>Product %d</h2>%n", productIndex + 1);
            pw.println("<table>");
            pw.println("<tr><th>Actual Value</th><th>Expected Value</th><th>Comparison Result</th></tr>");
            // Read the CSV column corresponding to the current product
            List<String> expectedProductValues = readCSVColumn(productIndex);
            for (int i = 0; i < actualValues.size() && i < expectedProductValues.size(); i++) {
                String actualValue = actualValues.get(i);
                String expectedValue = expectedProductValues.get(i);
                String comparisonResult = actualValue.equals(expectedValue) ? "Match" : "No Match";
                String cellStyle = comparisonResult.equals("No Match") ? "class=\"no-match\"" : "";
                pw.printf("<tr><td>%s</td><td>%s</td><td %s>%s</td></tr>%n", actualValue, expectedValue, cellStyle, comparisonResult);
            }
            pw.println("</table>");
            productIndex++;
        }
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}
public List<String> readCSVColumn(int columnIndex) throws IOException {
    List<String> values = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/TestData/file3.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            if (columnIndex < columns.length) {
                values.add(columns[columnIndex]);
            } else {
                values.add(""); // Add an empty value if the column doesn't exist
            }
        }
    }
    return values;
}

/*
public void csv() {
    getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");
    List<String[]> skuValues = new ArrayList<>();
    int skuColIndex = -1;
    try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/TestData/file.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            skuValues.add(row);
            if (skuColIndex == -1) {
                for (int i = 0; i < row.length; i++) {
                    if (row[i].toLowerCase().contains("sku")) {
                        skuColIndex = i;
                    }
                }
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("CSV file not found: " + e.getMessage());
        return;
    } catch (IOException e) {
        System.out.println("Error reading CSV file: " + e.getMessage());
        return;
    }

    if (skuColIndex == -1) {
        System.out.println("No column with SKU values found in the CSV file");
        return;
    }

    System.out.println("CSV data:");

    for (String[] row : skuValues) {
        System.out.println(Arrays.toString(row));
    }

    String randomSKU = skuValues.get(0)[skuColIndex];

    System.out.println("Random SKU: " + randomSKU);

    List<String> randomSkuRow = new ArrayList<>();
    for (String[] row : skuValues) {
        if (Arrays.asList(row).contains(randomSKU)) {
            randomSkuRow = Arrays.asList(row);
            break;
        }
    }

    System.out.println("Random SKU row: " + randomSkuRow);
}
}*/


public void clickAndIncrement() {
    getDriver().get("http://phpstack-953281-3321249.cloudwaysapps.com/products");
    int rowIndex = 1;
    boolean hasNextRow = true;
    while (hasNextRow) {
        try {
            String rowXpath = String.format("//tbody/tr[%d]", rowIndex);
            WebElement rowElement = getDriver().findElement(By.xpath(rowXpath));
            // Get the SKU value from the rowElement here
            String sku = rowElement.findElement(By.xpath("./td[1]")).getText();
            System.out.println("SKU: " + sku);
            // Click on the div element of the row here
            rowElement.findElement(By.xpath("./td[2]")).click();
            // Wait for some time for the page to load and then go back to the products page
            Thread.sleep(3000);
            getDriver().navigate().back();
            rowIndex++;
        } catch (NoSuchElementException e) {
            hasNextRow = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}