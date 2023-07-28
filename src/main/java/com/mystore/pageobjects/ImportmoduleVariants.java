package com.mystore.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ImportmoduleVariants extends BaseClass{
	
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
	Faker faker = new Faker();

		
	@FindBy(xpath="//div[contains(text(),'Products')]")
	private WebElement productsbtn;
	
	
	@FindBy(xpath="//input[@id='ignore_unmapped']")
	private WebElement ignoreimportclick;
	
	
	@FindBy(xpath="//a[@id='import-csv-btn']")
	private WebElement importbtn;
	
	@FindBy(xpath="//div[@class='box__input text-center']")
	private WebElement csv;
	
	@FindBy(xpath="//select[@name='nodes[data][0][from][]']")
	private WebElement index;
	
	@FindBy(xpath="//button[@id='next-btn']")
	private WebElement nextbtn;

	
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
	
	@FindBy(xpath="//a[@id='variant-tab']")
	private WebElement variantsbtn;
	
	@FindBy(xpath="(//button[normalize-space()='Add New Option'])[1]")
	private WebElement addnewoptnbtn;
	
	@FindBy(xpath="//button[@id='mapping_add_attribute']")
	private WebElement CAC;
	
	@FindBy(xpath="//input[@name='attribute_family_name']")
	private WebElement attributefamily;
	
	@FindBy(xpath="//div[@class='form-group']//input[@name='name']")
	private WebElement attributetitle;
	
	@FindBy(xpath="//button[@id='mapping_create_new_attribute_btn']")
	private WebElement createbtn;
	
	
	
	@FindBy(xpath="//button[@id='create_template']")
	private WebElement createnewtemplate;
	
	public ImportmoduleVariants() {
		PageFactory.initElements(getDriver(), this);
	}
	
public void importmodule2() throws InterruptedException, AWTException {
	
	//action.click(getDriver(), productsbtn);
	action.click(getDriver(), importbtn);
	action.click(getDriver(), csv);
	action.implicitWait(getDriver(), 30000);
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

	   
	action.click(getDriver(), variantsbtn); 
	
	Thread.sleep(3000);
	
	Select variant1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[variant][id]']")));
	variant1.selectByIndex(1);
	
	Select variantsoption1 = new Select(getDriver().findElement(By.xpath("//select[@name='nodes[variant][variant_options][]']")));
	variantsoption1.selectByIndex(2);
	
	action.JSClick(getDriver(), addnewoptnbtn);
	action.JSClick(getDriver(), addnewoptnbtn);

	
	Select variantsoption2 = new Select(getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
	variantsoption2.selectByIndex(3);

	
	Select variantsoption3 = new Select(getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]")));
	variantsoption3.selectByIndex(4);
	
	action.JSClick(getDriver(), CAC);
	
	action.type(attributefamily, "s"+faker.name());
	action.type(attributetitle, "r"+faker.name());
	
	Select attributetype = new Select(getDriver().findElement(By.xpath("//select[@name='attribute_type_id']")));
	attributetype.selectByIndex(2);
	
	action.JSClick(getDriver(), createbtn);
	
	
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
	System.out.println("-------------Popup Displayed---------------   "+ Displaypop);

	

	
	Thread.sleep(3000);	

}}
