package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement signout;
	
	public SignOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sout()
	{
		signout.click();
	}
	

}
