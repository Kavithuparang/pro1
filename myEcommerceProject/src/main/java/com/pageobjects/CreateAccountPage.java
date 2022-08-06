package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement signin;
	
    @FindBy(xpath="//input[@id='email_create']")
    WebElement emailforNewAccount;
	
    @FindBy(xpath="//button[@id='SubmitCreate']")
    WebElement createaccount;
 
    @FindBy(xpath="//li[contains(text(),'An account using this email address has already be')]")
    WebElement errormsg;
 
 public boolean createAccounterror(String e)
 {
	 signin.click();
	 emailforNewAccount.sendKeys(e);
	 createaccount.click();
	 boolean ms=errormsg.isDisplayed();
	return ms;
	
		  
 }
 
 
}
