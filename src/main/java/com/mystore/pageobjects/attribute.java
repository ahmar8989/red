package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class attribute extends BaseClass{

	Action action= new Action();
	Faker faker = new Faker();
	homepageobjects Homepageobjects;
	
	@FindBy(xpath="//span[normalize-space()='Attributes']")
	private WebElement attributes;
	
	@FindBy(xpath="//label[@for='price']")
	private WebElement price;
	
	 @FindBy(xpath="//a[@id='add-attribute']")
	 private WebElement addattributes;
	
	@FindBy(xpath="//p[@title='Select Here']")
	private WebElement attributessetindex;
	
	@FindBy(xpath="//li[1]//span[1]//i[1]")
	private WebElement attributessetindex1;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement attributetittle;
	
	@FindBy(xpath="//input[@id='description']")
	private WebElement attributeDescription;
	
	@FindBy(xpath="//label[@for='list']")
	private WebElement attributemultioption;
	
	@FindBy(xpath="//input[@name='regular_expression']")
	private WebElement attributeregulr;
	
	@FindBy(xpath="//input[@id='min_length']")
	private WebElement minimumNum;
	
	@FindBy(xpath="//input[@id='max_length']")
	private WebElement maximumNum;
	
	@FindBy(xpath="//label[@id='input_type_4']")
	private WebElement multi;
	
	@FindBy(xpath="//button[@id='add-btn']")
	private WebElement manageoptns;
	
	

	
	@FindBy(xpath="//input[@name='attribute_options[][name]']")
	private WebElement addoptns1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[9]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	private WebElement addoptns2;
	

	
	
	/////////////////////////////Date&Time////////////////////////////////////
	
	@FindBy(xpath="//label[@id='input_type_5']")
	private WebElement datesection;
	
	@FindBy(xpath="//input[@id='start_date']")
	private WebElement minimumdate;
	
	@FindBy(xpath="//input[@id='end_date']")
	private WebElement maximumdate;
	
	@FindBy(xpath="//input[@id='start_date_time']")
	private WebElement minimumdatetime;
	
	@FindBy(xpath="//input[@id='end_date_time']")
	private WebElement maxdatetime;
	

	
	
	//////////Measurement//////////////////
	
	@FindBy(xpath="//label[@id='input_type_7']")
	private WebElement measurement;
	
	@FindBy(xpath="//input[@id='min_weight']\r\n")
	private WebElement minKG;
	
	@FindBy(xpath="//input[@id='max_weight']")
	private WebElement maxKG;
	
	@FindBy(xpath="//button[@id='pro_attr_create_btn']")
	private WebElement savebtn;
	
	@FindBy(xpath="//p[@class='btnOk']")
	private WebElement attributessetindexok;
	
	
	
	@FindBy(xpath="//label[@for='decimal']")
	private WebElement decimaloptn;
	
	@FindBy(xpath="//label[@id='input_type_2']")
	private WebElement clicknumber;
	
	@FindBy(xpath="//input[@id='max_number_precision']")
	private WebElement Maximumprecision;
	
	@FindBy(xpath="//label[@for='volume']")
	private WebElement volume;
	
	@FindBy(xpath="//label[@for='dimension']")
	private WebElement dimension;
	
	@FindBy(xpath="//input[@id='min_volume']")
	private WebElement minvolumekg;
	
	@FindBy(xpath="//input[@id='max_volume']")
	private WebElement maxvolumekg;
	
	@FindBy(xpath="//input[@id='min_dimension']")
	private WebElement mindimensionkg;
	
	@FindBy(xpath="//input[@id='max_dimension']")
	private WebElement maxdimensionkg;
	
	@FindBy(xpath="//label[@for='integer']")
	private WebElement integer;
	
	@FindBy(xpath="//label[@for='date_time']")
	private WebElement datetime;
	
	@FindBy(xpath="//label[@for='customSwitch']")
	private WebElement isrequire;
	
	
	
	
	
	
	
	
	

	public attribute() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void att1() {
		
		
		action.click(getDriver(), attributes);
		action.click(getDriver(), addattributes);
		action.JSClick(getDriver(), attributessetindex);
		action.click(getDriver(), attributessetindex1);
		action.click(getDriver(), attributessetindexok);
		action.type(attributetittle,"000"+faker.name().firstName());

//		action.type(attributetittle,"000"+faker.name().firstName());
		action.type(attributeDescription, "test description");
		action.type(attributeregulr, "Test attribute regular");
		action.type(minimumNum, "12");
		action.type(maximumNum, "14");

		/////////////////multi options ///////////////////////////////////////
		action.explicitWait(getDriver(), multi, 100);	
		action.click(getDriver(), multi);		
		action.fluentWait(getDriver(), manageoptns, 2);	
		action.click(getDriver(),manageoptns );
		action.type( addoptns1, "test1");
		action.type( addoptns2, "test2");

		
		/////////////////date&time///////////////////
	
		action.click(getDriver(), datesection);		
		action.type( minimumdate, "11/17/2022");
		action.type( maximumdate, "11/17/2024");
		
		///////////////Measurement //////////////////
		
		action.click(getDriver(), measurement);
		action.type( minKG, "12");
		action.type( maxKG, "14");
		
		action.click(getDriver(), savebtn);

	}


////////////////2nd test Attribute/////////////////////////////////////////////////////////////////
		
	@FindBy(xpath="//li[2]")
	private WebElement attributessetindex2;

		public void att2() {
			
			action.click(getDriver(), attributes);
			action.click(getDriver(), addattributes);
			action.JSClick(getDriver(), attributessetindex);
			action.click(getDriver(), attributessetindex2);
			action.click(getDriver(), attributessetindexok);

			action.type(attributetittle, "TestTitle lorem lorem lorem lorem lorem lorem");
			action.type(attributeDescription, "test description");
			action.type(attributeregulr, "Test attribute regular");
			action.type(minimumNum, "122");
			action.type(maximumNum, "144");

			/////////////////multi options ///////////////////////////////////////
			action.explicitWait(getDriver(), multi, 100);
			action.click(getDriver(), multi);		
			action.fluentWait(getDriver(), manageoptns, 2);	
			action.click(getDriver(),manageoptns );
			action.type( addoptns1, "test1");
			action.type( addoptns2, "test2");

			
			/////////////////date&time///////////////////
		
			action.click(getDriver(), datesection);		
			action.type( minimumdate, "11/17/2019");
			action.type( maximumdate, "11/17/2029");
			
			///////////////Measurement //////////////////
			
			action.click(getDriver(), measurement);
			action.type( minKG, "122");
			action.type( maxKG, "144");
			
			action.click(getDriver(), savebtn);

			
		}
///////////////////////////////////3rd test attribute/////////////////////////////
			
			@FindBy(xpath="//li[3]")
			private WebElement attributessetindex3;

				public void att3() {
					
					action.click(getDriver(), attributes);
					action.click(getDriver(), addattributes);
					action.JSClick(getDriver(), attributessetindex);
					action.click(getDriver(), attributessetindex3);
					action.click(getDriver(), attributessetindexok);

					action.type(attributetittle, "TestTitle lorem lorem lorem lorem lorem lorem");
					action.type(attributeDescription, "test description");
					action.type(attributeregulr, "Test attribute regular");
					action.type(minimumNum, "1222");
					action.type(maximumNum, "1444");
					
					//////////////////number/////////////////////////////////////
					action.explicitWait(getDriver(), clicknumber, 100);
					action.click(getDriver(), clicknumber);
					action.explicitWait(getDriver(), decimaloptn, 100);
					action.click(getDriver(), decimaloptn);
					action.type(Maximumprecision, "0.12");


					/////////////////multi options ///////////////////////////////////////
					action.explicitWait(getDriver(), multi, 100);
					action.click(getDriver(), multi);		
					action.fluentWait(getDriver(), manageoptns, 2);	
					action.click(getDriver(),manageoptns );
					action.type( addoptns1, "test1");
					action.type( addoptns2, "test2");

					
					/////////////////date&time///////////////////
				
					action.click(getDriver(), datesection);		
					action.type( minimumdate, "11/17/2022");
					action.type( maximumdate, "11/17/2024");
					
					///////////////Measurement //////////////////
					
					action.click(getDriver(), measurement);
					action.type( minKG, "1222");
					action.type( maxKG, "1444");
					
					action.click(getDriver(), savebtn);
					
					
				}
///////////////////////////////////4rd test attribute/////////////////////////////


////////////////////////5 test > with multiple values > attribute section/////////////////////


@FindBy(xpath="//li[4]")
private WebElement attributessetindex4;

public void att4() {
	
	
	action.click(getDriver(), attributes);
	action.click(getDriver(), addattributes);
	action.JSClick(getDriver(), attributessetindex);
	action.click(getDriver(), attributessetindex4);
	action.click(getDriver(), attributessetindexok);
	action.type(attributetittle,"000"+faker.name().firstName());
	action.type(attributeDescription, "test description");
	action.click(getDriver(), attributemultioption);
    action.type(attributeregulr, "Test attribute regular");
	action.type(minimumNum, "12");
	action.type(maximumNum, "14");

	/////////////////multi options ///////////////////////////////////////
	action.explicitWait(getDriver(), multi, 100);
	action.click(getDriver(), multi);		
	action.fluentWait(getDriver(), manageoptns, 2);	
	action.click(getDriver(),manageoptns );
	action.type( addoptns1, "test1");
	action.type( addoptns2, "test2");

	
	/////////////////date&time///////////////////

	action.click(getDriver(), datesection);		
	action.type( minimumdate, "11/17/2022");
	action.type( maximumdate, "11/17/2024");
	
	///////////////Measurement //////////////////
	
	action.click(getDriver(), measurement);
	action.type( minKG, "12");
	action.type( maxKG, "14");
	
	action.click(getDriver(), savebtn);

}


//////////////// test Attribute/////////////////////////////////////////////////////////////////
	
@FindBy(xpath="//li[5]")
private WebElement attributessetindex5;

	public void att5() {
		
		action.click(getDriver(), attributes);
		action.click(getDriver(), addattributes);
		action.JSClick(getDriver(), attributessetindex);
		action.click(getDriver(), attributessetindex5);
		action.click(getDriver(), attributessetindexok);

		action.type(attributetittle,"000"+faker.name().firstName());
		action.type(attributeDescription, "test description");
		action.click(getDriver(), attributemultioption);
		action.type(attributeregulr, "Test attribute regular");
		action.type(minimumNum, "122");
		action.type(maximumNum, "144");

		/////////////////multi options ///////////////////////////////////////
		action.explicitWait(getDriver(), multi, 100);
		action.click(getDriver(), multi);		
		action.fluentWait(getDriver(), manageoptns, 2);	
		action.click(getDriver(),manageoptns );
		action.type( addoptns1, "test1");
		action.type( addoptns2, "test2");

		
		/////////////////date&time///////////////////
	
		action.click(getDriver(), datesection);		
		action.type( minimumdate, "11/17/2019");
		action.type( maximumdate, "11/17/2029");
		
		///////////////Measurement //////////////////
		
		action.click(getDriver(), measurement);
		action.type( minKG, "122");
		action.type( maxKG, "144");
		
		action.click(getDriver(), savebtn);

		
	}

////////////////////////5 test > with Decimal option  single values> attribute section/////////////////////



@FindBy(xpath="//li[6]")
private WebElement attributessetindex6;

public void att6() {


action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex6);
action.click(getDriver(), attributessetindexok);
action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "12");
action.type(maximumNum, "14");

///////////////////////number field////////////////////////////
action.click(getDriver(), clicknumber);
action.fluentWait(getDriver(), clicknumber, 2);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type(Maximumprecision, "0.12");





/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2022");
action.type( maximumdate, "11/17/2024");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.type( minKG, "12");
action.type( maxKG, "14");

action.click(getDriver(), savebtn);

}


////////////////7 test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[7]")
private WebElement attributessetindex7;

public void att7() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex7);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////
action.click(getDriver(), clicknumber);
action.fluentWait(getDriver(), clicknumber, 2);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type(Maximumprecision, "5.99");

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.type( minKG, "122");
action.type( maxKG, "144");

action.click(getDriver(), savebtn);


}





@FindBy(xpath="//li[8]")
private WebElement attributessetindex8;

public void att8() {


action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex8);
action.click(getDriver(), attributessetindexok);
action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "12");
action.type(maximumNum, "14");

///////////////////////number field////////////////////////////
action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);





/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2022");
action.type( maximumdate, "11/17/2024");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.type( minKG, "12");
action.type( maxKG, "14");

action.click(getDriver(), savebtn);

}


////////////////9 test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[9]")
private WebElement attributessetindex9;

public void att9() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex9);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");

/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.type( minKG, "122");
action.type( maxKG, "144");

action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[10]")
private WebElement attributessetindex10;

public void att10() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex10);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[11]")
private WebElement attributessetindex11;

public void att11() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex11);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[12]")
private WebElement attributessetindex12;

public void att12() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex12);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[13]")
private WebElement attributessetindex13;

public void att13() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex13);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);

action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}

///////////////////////5 test cases with multivalue =>weight , volume , dimension////////////////////

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[14]")
private WebElement attributessetindex14;

public void att14() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex14);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[15]")
private WebElement attributessetindex15;

public void att15() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex15);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[16]")
private WebElement attributessetindex16;

public void att16() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex16);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[17]")
private WebElement attributessetindex17;

public void att17() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex17);
//action.click(getDriver(), attributemultioption);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), price, 100);
action.click(getDriver(), price);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}

//////////////////////5 test cases multi option=> integer volume , dimension , weight



////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[18]")
private WebElement attributessetindex18;

public void att18() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex18);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), integer, 100);
action.click(getDriver(), integer);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[19]")
private WebElement attributessetindex19;

public void att19() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex19);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), integer, 100);
action.click(getDriver(), integer);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[20]")
private WebElement attributessetindex20;

public void att20() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex20);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), integer, 100);
action.click(getDriver(), integer);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[21]")
private WebElement attributessetindex21;

public void att21() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex21);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
//action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), integer, 100);
action.click(getDriver(), integer);

/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}

//////////////////////4 test cases multi option=> decimal => volume , dimension , weight



////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[22]")
private WebElement attributessetindex22;

public void att22() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex22);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "122");


/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[23]")
private WebElement attributessetindex23;

public void att23() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex23);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "12");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[24]")
private WebElement attributessetindex24;

public void att24() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex24);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "172");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[25]")
private WebElement attributessetindex25;

public void att25() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex25);
//action.click(getDriver(), attributemultioption);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "1227");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.type( minimumdate, "11/17/2019");
action.type( maximumdate, "11/17/2029");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}

/////////////////////4 test cases multi option=> decimal => volume , dimension , weight , time



////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[26]")
private WebElement attributessetindex26;

public void att26() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex26);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "122");


/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[27]")
private WebElement attributessetindex27;

public void att27() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex27);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "12");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");
///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[28]")
private WebElement attributessetindex28;

public void att28() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex28);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "172");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");
///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[29]")
private WebElement attributessetindex29;

public void att29() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex29);
// action.click(getDriver(), attributemultioption);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");
action.click(getDriver(), isrequire);


///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "1227");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}

/////////////////////4 test cases multi option=> decimal => volume , dimension , weight , time , is required



////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[30]")
private WebElement attributessetindex30;

public void att30() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex30);
action.click(getDriver(), attributessetindexok);
action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");
action.click(getDriver(), isrequire);

///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "122");


/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12232");
action.type( maxvolumekg, "14234");
action.click(getDriver(), savebtn);


}

////////////////measurement volume test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[31]")
private WebElement attributessetindex31;

public void att31() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex31);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");
action.click(getDriver(), isrequire);


///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "12");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");
///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), volume, 100);
action.click(getDriver(), volume);
action.type( minvolumekg, "12");
action.type( maxvolumekg, "134");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[32]")
private WebElement attributessetindex32;

public void att32() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex32);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");
action.click(getDriver(), isrequire);


///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "172");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////
action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");
///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);
action.type( mindimensionkg, "1");
action.type( maxdimensionkg, "3");
action.click(getDriver(), savebtn);


}

////////////////measurement dimension test Attribute/////////////////////////////////////////////////////////////////

@FindBy(xpath="//li[33]")
private WebElement attributessetindex33;

public void att33() {

action.click(getDriver(), attributes);
action.click(getDriver(), addattributes);
action.JSClick(getDriver(), attributessetindex);
action.click(getDriver(), attributessetindex33);
action.click(getDriver(), attributessetindexok);

action.type(attributetittle,"000"+faker.name().firstName());
action.type(attributeDescription, "test description");
action.click(getDriver(), attributemultioption);
action.type(attributeregulr, "Test attribute regular");
action.type(minimumNum, "122");
action.type(maximumNum, "144");
action.click(getDriver(), isrequire);


///////////////////////number field////////////////////////////

action.click(getDriver(), clicknumber);
action.explicitWait(getDriver(), decimaloptn, 100);
action.click(getDriver(), decimaloptn);
action.type( Maximumprecision, "1227");
/////////////////multi options ///////////////////////////////////////
action.explicitWait(getDriver(), multi, 100);
action.click(getDriver(), multi);		
action.fluentWait(getDriver(), manageoptns, 2);	
action.click(getDriver(),manageoptns );
action.type( addoptns1, "test1");
action.type( addoptns2, "test2");


/////////////////date&time///////////////////

action.click(getDriver(), datesection);		
action.fluentWait(getDriver(), datetime, 100);
action.click(getDriver(), datetime);		
action.type( minimumdatetime, "11/09/2022 02:29 PM");
action.type( maxdatetime, "11/09/2024 01:29 AM");

///////////////Measurement //////////////////

action.click(getDriver(), measurement);
action.explicitWait(getDriver(), dimension, 100);
action.click(getDriver(), dimension);

action.type( mindimensionkg, "12");
action.type( maxdimensionkg, "31");

action.click(getDriver(), savebtn);


}





public String getCurrURL() throws Throwable {
	String attributeURL1=action.getCurrentURL(getDriver());
	return attributeURL1;

}		
}
			

	

