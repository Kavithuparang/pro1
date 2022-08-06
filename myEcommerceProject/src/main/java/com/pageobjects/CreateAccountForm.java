package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountForm {
	
	WebDriver driver;
	
	
	
	//Create Account Form
	 
	 @FindBy(xpath="//input[@id='id_gender1']")
	  WebElement mr;
	 
	 
	 @FindBy(xpath="//input[@id='id_gender2']")
	  WebElement mrs;
	 
	 @FindBy(xpath="//input[@id='customer_firstname']")
	  WebElement fname;
	 
	 @FindBy(xpath="//input[@id='customer_lastname']")
	  WebElement lname;
	 
	 @FindBy(xpath="//input[@id='passwd']")
	  WebElement pwd;
	 
	 @FindBy(xpath="//select[@id='days']")
	  WebElement days ;
	 
	 @FindBy(xpath="//select[@id='months']")
	  WebElement month;
	 
	 @FindBy(xpath="//select[@id='years']")
	  WebElement yrs;
	 
	 @FindBy(xpath="//input[@id='company']")
	  WebElement com;
	 
	 @FindBy(xpath="//input[@id='address1']")
	  WebElement adr1;
	 
	 @FindBy(xpath="//input[@id='address2']")
	  WebElement adr2;
	 
	 @FindBy(xpath="//input[@id='city']")
	  WebElement city;
	 
	 @FindBy(xpath="//select[@id='id_state']")
	  WebElement state;
	 
	 @FindBy(xpath="//input[@id='postcode']")
	  WebElement pin;
	 
	 @FindBy(xpath="//select[@id='id_country']")
	  WebElement country;
	 
	 @FindBy(xpath="//textarea[@id='other']")
	  WebElement txt;
	 
	 @FindBy(xpath="//input[@id='phone']")
	  WebElement ph;
	 
	 @FindBy(xpath="//input[@id='phone_mobile']")
	  WebElement phone;
	 
	 @FindBy(xpath="//input[@id='alias']")
	  WebElement alias;
	 
	 @FindBy(xpath="//span[normalize-space()='Register']")
	  WebElement register;
	 
	 public  CreateAccountForm(WebDriver driver) 
			
		{
		  
			PageFactory.initElements(driver,this);
		}
		
	 
       public void createformtest(String fn,String ln,String pw,
		 
		 String co,
		 String add1,String add2,String cit,String stat,String zip,String cn,
		 String t,String pho,String mph,String alia) 
      {
	
	 
	  mr.click();
	 fname.sendKeys(fn);
	 lname.sendKeys(ln);
	 pwd.sendKeys(pw);
	 
	 //Date of Birth 
	 days.click();
	 Select day=new Select(days);
	 day.selectByValue("3");
	
	 month.click();
	 Select m1=new Select(month);
	 m1.selectByValue("5");
	 
	 yrs.click();
	 Select yr=new Select(yrs);
	 yr.selectByValue("1990");
	 
	 com.sendKeys(co);
	 adr1.sendKeys(add1);
	 adr2.sendKeys(add2);
	 city.sendKeys(cit);
	 
	 //State and country selection
	 
	 Select st=new Select(state);
     st.selectByVisibleText(stat);
	 pin.sendKeys(zip);
	 
	 Select ctry=new Select(country);
	 ctry.selectByVisibleText(cn);
	 
	 txt.sendKeys(t);
	 ph.sendKeys(pho);
	 phone.sendKeys(mph);
	 
	 alias.clear();
	 alias.sendKeys(alia);
	 
	 register.click();
		 
      }
	 
	 
}
