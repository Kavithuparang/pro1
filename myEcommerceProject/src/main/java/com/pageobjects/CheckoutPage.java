package com.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	
	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement women;
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-item-of-tablet-line first-item-of-mobile-line']//a[@title='View']")
	WebElement more;
	
	@FindBy(xpath="//button[@class='exclusive']")
	WebElement addtocart;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	WebElement proceed;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement protocheckout;
	
	public CheckoutPage(WebDriver driver2)
	{
		this.driver=driver2;
	
		PageFactory.initElements(driver, this);
    }
	
	

	public void checkout() throws InterruptedException
	{
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",women);    
		
		Thread.sleep(1000);
		
		executor.executeScript("arguments[0].click();", more);
		
		Thread.sleep(1000);
		
		addtocart.click();
		Thread.sleep(1000);
		proceed.click();
		Thread.sleep(1000);
		protocheckout.click();
	}
}
