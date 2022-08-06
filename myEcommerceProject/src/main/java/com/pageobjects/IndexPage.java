package com.pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class IndexPage{
	
	WebDriver driver;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	private WebElement signin;
	
	 @FindBy(xpath="//input[@id='email_create']")
	 private WebElement emailforNewAccount;
		
	 @FindBy(xpath="//button[@id='SubmitCreate']")
	 private WebElement createaccount;
	  
	 @FindBy(xpath="//img[@alt='My Store']")
	 WebElement logo;
	 
	 public IndexPage(WebDriver driver)
		{
		 this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	 
	 public boolean logomethod() throws IOException
	 {
		boolean lo1= logo.isDisplayed();
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\logo.png");
		FileUtils.copyFile(src, trg);
		return lo1;
	 }

	public CreateAccountForm index(String eMail)
	{
		signin.click();
		emailforNewAccount.click();
		emailforNewAccount.sendKeys(eMail);
		createaccount.click();
	return new CreateAccountForm(driver);
		//return CreateAccountForm();
	}
    

}
