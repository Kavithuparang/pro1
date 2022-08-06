package com.pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityPackage.Screenshot;

public class SignIn {
	
	WebDriver driver;
	//Screenshot sc=new Screenshot();
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement signin;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='passwd']")
	
	WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signinbutton;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void siginincheck(String email1,String password1) throws IOException
	{
		signin.click();
		emailid.click();
		emailid.sendKeys(email1);
		password.click();
		password.sendKeys(password1);
		
				signinbutton.click();
		//Screenshot.screenshot(driver,".\\screenshots\\page.png");
		
	}
	

}
