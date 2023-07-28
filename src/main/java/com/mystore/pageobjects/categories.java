package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class categories extends BaseClass {
	

	Action action= new Action();
	Faker faker = new Faker();

	
	@FindBy(xpath="//span[normalize-space()='Categories']")
	private WebElement categoriesbtn;
	
	@FindBy(xpath="//a[@id='add-category']")
	private WebElement addcategories;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement categoriesname;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement categoriesdescription;
	
	@FindBy(xpath="//button[@id='pro_cat_create_btn']")
	private WebElement categoriessavebtn;
	

	
	public categories() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getCurrURL() throws Throwable {
		String categoriesURL=action.getCurrentURL(getDriver());
		return categoriesURL;
	}

	
	public void categories1() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	
	public void categories2() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories3() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories4() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname,"category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories5() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories6() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories7() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories8() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "category"+faker.name().firstName());	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories9() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "new Category 9 ");	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
	public void categories10() {
		action.click(getDriver(), categoriesbtn);
		action.click(getDriver(), addcategories);
		action.type(categoriesname, "new Category 10 ");	
		action.type(categoriesdescription, "ce the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remai");	
		action.click(getDriver(), categoriessavebtn);	
	
}
	
}
