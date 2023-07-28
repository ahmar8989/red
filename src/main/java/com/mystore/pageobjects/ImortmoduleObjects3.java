package com.mystore.pageobjects;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ImortmoduleObjects3 extends BaseClass{
	
	
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
	

	
	
	
	public ImortmoduleObjects3() {
		PageFactory.initElements(getDriver(), this);
	}
	
public void importmodule2() throws InterruptedException, AWTException {
	
	action.click(getDriver(), productsbtn);
	action.click(getDriver(), importbtn);
	action.click(getDriver(), csv);
	action.implicitWait(getDriver(), 30000);
	Thread.sleep(3000);	
	uploadFile("exampl");
	Thread.sleep(3000);	

	action.click(getDriver(), nextbtn);
	
	
	if (action.isDisplayed(getDriver(), createnewtemplate)) {
		action.click(getDriver(), createnewtemplate);
	}
	else
	{ System.out.print("ok");}

	
	Thread.sleep(3000);	
	
	
	
	Thread.sleep(8000);
	action.JSClick(getDriver(), nextclick);
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10); // 10 is the timeout
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='import_product']//select[@id='version']")));
	Select selectLanguage = new Select(element);
	selectLanguage.selectByIndex(1);	Select selectstore = new Select(getDriver().findElement(By.xpath("//div[@id='import_product']//select[@id='catalog']")));
	selectstore.selectByIndex(1);


	action.JSClick(getDriver(), templatebtn);
	action.type(templateinput, "new template");
	action.JSClick(getDriver(), stratimportbtn);
	action.JSClick(getDriver(), productpage); 
	

	  List<WebElement> inputs = getDriver().findElements(By.xpath("//*[@id='general-tab']//input"));
    String expectedValues = "{1,Camerawww 2sku,New Camera,12312123,122,133,144,155,166}";
    String[] expectedArray = expectedValues.substring(1, expectedValues.length() - 1).split(",");
    int i = 0;
    for (WebElement inputElement : inputs) {
        String actualValue = inputElement.getAttribute("value");
        System.out.print("Actual value: " + actualValue + ", Expected value: " + expectedArray[i] + ", ");
        if (actualValue.equals(expectedArray[i])) {
            System.out.println("Values match");
        } else {
            System.out.println("****************************Values do not match***************************************************");
        }
        i++;
    }

    
    WebElement selectElement = null;
    List<WebElement> elements = null;
    try {
        selectElement = getDriver().findElement(By.xpath("//div[@class='card-body p-3']"));
        elements = selectElement.findElements(By.tagName("option"));
        elements.addAll(getDriver().findElements(By.id("justAnotherInputBox")));
    } catch (StaleElementReferenceException e) {
        // If the element is stale, find it again
        selectElement = getDriver().findElement(By.xpath("//div[@class='card-body p-3']"));
        elements = selectElement.findElements(By.tagName("option"));
        elements.addAll(getDriver().findElements(By.id("justAnotherInputBox")));
    }

    String[] expectedArray1 = {"Sony" , "Jamil" , "Default", "new"};
    int x = 0;
    for (WebElement element1 : elements) {
        try {
            if (element1.getTagName().equals("option")) {
                if (element1.isSelected()) {
                    String selectedOptionText = element1.getText();
                    System.out.println("Actual Value: " + selectedOptionText + " ,Expected Value: " + expectedArray1[x] + " ,Match Result: " + selectedOptionText.equals(expectedArray1[x]));
                    x++;
                }
            } else if (element1.getAttribute("id").equals("justAnotherInputBox")) {
                String inputValue = element1.getAttribute("value");
                System.out.println("Actual Value: " + inputValue + " ,Expected Value: " + expectedArray1[x] + " ,Match Result: " + inputValue.equals(expectedArray1[x]));
                x++;
            }
        } catch (StaleElementReferenceException e) {
            // If the element is stale, skip it and continue with the next one
            continue;
        }

        
      }
    action.click(getDriver(), attributeclick);
    List<WebElement> inputs4 = getDriver().findElements(By.xpath("//*[starts-with(@name,'attribute[')]"));
    String expectedValues4 = "{anydata,SEO Title,Seo Descp,tags}";
    String[] expectedArray4 = expectedValues4.substring(1, expectedValues4.length() - 1).split(",");
    int a = 0;
    for (WebElement inputElement4 : inputs4) {
        String actualValue4 = inputElement4.getAttribute("value");
        System.out.print("Actual value: " + actualValue4 + ", Expected value: " + expectedArray4[a] + ", ");
        if (actualValue4.equals(expectedArray4[a])) {
            System.out.println("Values match");
        } else {
            System.out.println("****************************Values do not match***************************************************");
        }
        a++;
    }
}}