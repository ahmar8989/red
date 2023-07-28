package com.mystore.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class ImortmoduleObjects extends BaseClass{
	
	
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
	
	public ImortmoduleObjects() {
		PageFactory.initElements(getDriver(), this);
	}
	
public void importmodule() throws InterruptedException, AWTException {
	
	action.click(getDriver(), productsbtn);
	action.click(getDriver(), importbtn);
	action.click(getDriver(), csv);
	action.implicitWait(getDriver(), 30000);
	Thread.sleep(3000);	
	uploadFile("C:\\Users\\Hp\\xc.csv");
	Thread.sleep(3000);	

	action.click(getDriver(), nextbtn);
	
	
	if (action.isDisplayed(getDriver(), createnewtemplate)) {
		action.click(getDriver(), createnewtemplate);
	}
	else
	{ System.out.print("ok");}

	
	Thread.sleep(3000);	

	
	Select CSVcolumno1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][0][from][]']")));
	CSVcolumno1.selectByIndex(1);
	
	Select id = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][0][to][]']")));
	id.selectByVisibleText("SKU");
	
	Boolean Display = getDriver().findElement(By.xpath("//div[@id='row_container']//div//div[1]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------  "+ Display);
	
	////2nd selectin
	
	Select CSVcolumno2 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][1][from][]']")));
	CSVcolumno2.selectByVisibleText("SKU");
	//select [@name="nodes[data][1][with_formula]"]
	
	Select formula = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][1][with_formula]']")));
	formula.selectByIndex(1);
	
	action.type(separator, "-");

	
	Select c1 = new Select(getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[2]/div[1]/select[1]")));
	c1.selectByVisibleText("SKU");
	
	Select c2 = new Select(getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[3]/div[1]/select[1]")));
	c2.selectByVisibleText("SKU");
	
	Boolean Display1 = getDriver().findElement(By.xpath("//div[@id='add_row']//div[2]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display1);
	
	
	////3rd selection
	
	Select CSVcolumno3 = new Select(getDriver().findElement(By.xpath("//div[@class='col-6 col-md-9 col-lg-9']//div[@class='form-group']//select[@name='nodes[data][2][from][]']")));
	CSVcolumno3.selectByIndex(3);
	
	Select formula1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][2][with_formula]']")));
	formula1.selectByIndex(2);
	
	action.type(glue, "its glue");
	
	Select apimiocloumn3o1 = new Select(getDriver().findElement(By.xpath("//select[@class='form-control apimio-column left_array']")));
	apimiocloumn3o1.selectByIndex(4);
	
	Select apimiocloumn3o2 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][2][to][]']")));
	apimiocloumn3o2.selectByIndex(4);
	
	Boolean Display2 = getDriver().findElement(By.xpath("//div[@id='myTabContent']//div[3]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   :"+Display2);

	////////4th selection
	
	Select formula4 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][3][with_formula]']")));
	formula4.selectByIndex(3);
	
	
	action.type(mergeadvance, "mergeadvance done");
	Select apimiocloumn4o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][3][to][]']")));
	apimiocloumn4o1.selectByIndex(5);
	
	Boolean Display3 = getDriver().findElement(By.xpath("//form[@id='mainform']//div[4]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------"+ Display3);

	//////5th selection
	
	Select CSVcolumn5 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][6][from][]']")));
	CSVcolumn5.selectByIndex(3);
	
	Select formula5 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][6][with_formula]']")));
	formula5.selectByIndex(4);
	
	action.type(searchfield, "honda");
	action.type(withfield, "new honda 1");
	
	Select apimiocloumn6o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][6][to][]']")));
	apimiocloumn6o1.selectByIndex(6);
	
	Boolean Display4 = getDriver().findElement(By.xpath("//div[7]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M7.73438 1')]")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------"+ Display4);
	
	////////6th section
	
	Select CSVcolumn6 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][8][from][]']")));
	CSVcolumn6.selectByIndex(9);
	
	Select formula6 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][8][with_formula]']")));
	formula6.selectByIndex(5);
	
	Select apimiocloumn7o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][8][to][]']")));
	apimiocloumn7o1.selectByVisibleText("Description");
	
	
	Boolean Display5 = getDriver().findElement(By.xpath("//div[10]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display5);
	
///	7th selection 
	
	
	Select CSVcolumn7 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][9][from][]']")));
	CSVcolumn7.selectByIndex(9);
	
	Select formula7 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][9][with_formula]']")));
	formula7.selectByIndex(6);
	
	action.JSClick(getDriver(), addbtn);
	
	
	action.JSClick(getDriver(), vlookadd);


	action.type(inputname, "honda");


	action.type(inputvalues, "red,Redish \n blk,Black ");
	action.JSClick(getDriver(), createbtn);
	action.JSClick(getDriver(), cancelbtn);

	
	Select select = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][9][with]']")));
	select.selectByVisibleText("honda");

	Select apimiocloumn8o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][9][to][]']")));
	apimiocloumn8o1.selectByVisibleText("Description");
	
	Boolean Display6 = getDriver().findElement(By.xpath("//div[11]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display6);

	/////8th selection////////
	
	
	Select CSVcolumn8 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][10][from][]']")));
	CSVcolumn8.selectByIndex(4);
	
	Select formula8 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][10][with_formula]']")));
	formula8.selectByIndex(7);
	
	
	
	
	action.type(calculateinput, "+50");
	
	
	Select apimiocloumn9o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][10][to][]']")));
	apimiocloumn9o1.selectByVisibleText("Price");
	
	Boolean Display7 = getDriver().findElement(By.xpath("//div[12]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display7);
	
	///9th selection
	
	
	Select CSVcolumn9 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][11][from][]']")));
	CSVcolumn9.selectByIndex(14);
	
	Select formula9 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][11][with_formula]']")));
	formula9.selectByIndex(8);
	
	Select position = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][11][replace]']")));
	position.selectByIndex(1);
	
	
	action.type(withinput, "new");
	
	
	Select apimiocloumn10o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][11][to][]']")));
	apimiocloumn10o1.selectByVisibleText("SEO Title");
	
	Boolean Display8 = getDriver().findElement(By.xpath("//div[12]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display8);
	
	
	//10th selection
	
	
	Select CSVcolumn10 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][12][from][]']")));
	CSVcolumn10.selectByIndex(13);
	
	Select formula10 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][12][with_formula]']")));
	formula10.selectByIndex(0);
	
	
	Select apimiocloumn11o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][12][to][]']")));
	apimiocloumn11o1.selectByVisibleText("SEO Title");
	
	Boolean Display9 = getDriver().findElement(By.xpath("//div[13]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display9);
	
	///11th selection
	
	
	Select CSVcolumn11 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][13][from][]']")));
	CSVcolumn11.selectByIndex(14);
	
	Select formula11 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][13][with_formula]']")));
	formula11.selectByIndex(0);
	
	Select apimiocloumn12o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][13][to][]']")));
	apimiocloumn12o1.selectByVisibleText("URL Slug");
	
	Boolean Display10 = getDriver().findElement(By.xpath("//div[14]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display10);
	
	//12 Selection
	
	Select CSVcolumn12 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][14][from][]']")));
	CSVcolumn12.selectByIndex(15);
	
	
	Select formula12 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][14][with_formula]']")));
	formula12.selectByIndex(0);
	
	
	Select apimiocloumn13o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][14][to][]']")));
	apimiocloumn13o1.selectByVisibleText("SEO Description");
	
	Boolean Display13 = getDriver().findElement(By.xpath("//div[15]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display13);
	
	
	//13 selection
	
	Select CSVcolumn13 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][15][from][]']")));
	CSVcolumn13.selectByVisibleText("Media");
	
	
	Select formula13 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][15][with_formula]']")));
	formula13.selectByIndex(0);
	
	
	Select apimiocloumn14o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][15][to][]']")));
	apimiocloumn14o1.selectByVisibleText("Media");
	
	Boolean Display14 = getDriver().findElement(By.xpath("//div[16]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display14);
	
	//14 Selection
	
	Select CSVcolumn14 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][16][from][]']")));
	CSVcolumn14.selectByVisibleText("Color");
	
	
	Select formula14 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][16][with_formula]']")));
	formula14.selectByIndex(0);
	
	
	Select apimiocloumn15o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][16][to][]']")));
	apimiocloumn15o1.selectByVisibleText("Category");
	
	Boolean Display15 = getDriver().findElement(By.xpath("//div[17]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display15);
	
	
	//15 Selection
	
	Select CSVcolumn15 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][17][from][]']")));
	CSVcolumn15.selectByVisibleText("Size");
	
	
	Select formula15 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][17][with_formula]']")));
	formula15.selectByIndex(0);
	
	
	Select apimiocloumn16o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][17][to][]']")));
	apimiocloumn16o1.selectByVisibleText("Category");
	
	Boolean Display16 = getDriver().findElement(By.xpath("//div[18]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display16);

	
	action.JSClick(getDriver(), addoprtnbtn);
	action.JSClick(getDriver(), addoprtnbtn);
	action.JSClick(getDriver(), addoprtnbtn);
	action.JSClick(getDriver(), addoprtnbtn);
	action.JSClick(getDriver(), addoprtnbtn);
	action.JSClick(getDriver(), addoprtnbtn);

	


	//16 Selection
	
	Select CSVcolumn16 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][18][from][]']")));
	CSVcolumn16.selectByVisibleText("Cost Price");
	
	
	Select formula16 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][18][with_formula]']")));
	formula16.selectByIndex(0);
	
	
	Select apimiocloumn17o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][18][to][]']")));
	apimiocloumn17o1.selectByVisibleText("Cost Price");
	
	Boolean Display17 = getDriver().findElement(By.xpath("//div[19]//div[1]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed();
	//To print the value
	System.out.println("----------Field sucessfully mapped---------   "+ Display17);
	
	
	//17 Selection
	
	Select CSVcolumn17 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][19][from][]']")));
	CSVcolumn17.selectByVisibleText("Brand");
	
	
	Select formula17 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][19][with_formula]']")));
	formula17.selectByIndex(0);
	
	
	Select apimiocloumn18o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][19][to][]']")));
	apimiocloumn18o1.selectByVisibleText("Brand");

	
	
	
	//18 Selection
	
	Select CSVcolumn18 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][20][from][]']")));
	CSVcolumn18.selectByVisibleText("Vendor");
	
	
	Select formula18 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][20][with_formula]']")));
	formula18.selectByIndex(0);
	
	
	Select apimiocloumn19o1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[data][20][to][]']")));
	apimiocloumn19o1.selectByVisibleText("Vendor");
	


	action.JSClick(getDriver(), D1);
	action.JSClick(getDriver(), D2);
	action.JSClick(getDriver(), ignoreimportclick);
	action.JSClick(getDriver(), nextclick);
	
	Select selectlanguage = new Select(getDriver().findElement(By.xpath("//div[@id='import_product']//select[@id='version']")));
	selectlanguage.selectByIndex(1);
	
	Select selectstore = new Select(getDriver().findElement(By.xpath("//div[@id='import_product']//select[@id='catalog']")));
	selectstore.selectByIndex(1);


	action.JSClick(getDriver(), templatebtn);
	action.type(templateinput, "new template");
	action.JSClick(getDriver(), stratimportbtn);
	
	Boolean Displaypop = getDriver().findElement(By.xpath("//div[@class='col-9 p-0 bold']")).isDisplayed();
	//To print the value
	System.out.println("Popup Displayed   "+ Displaypop);

	}
}
