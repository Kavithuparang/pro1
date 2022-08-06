package com.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage {

	
	WebDriver driver;
	
	public ShopingCartPage(WebDriver driver)
	{
		this.driver=driver;
				PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement cart;
	
	@FindBy(xpath="//span[normalize-space()='Check out']")
	WebElement checkout1;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement signin;
	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedtocheckout1;
	@FindBy(xpath="//input[@id='cgv']")
	WebElement agree;
	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedtocheckout2;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement payment;
	@FindBy(xpath="//span[normalize-space()='I confirm my order']")
	WebElement conformorder;
	
	
  public void finalcheckout()
  {
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();", cart);    
	 
	  
	  js.executeScript("arguments[0].click();", checkout1);  
	 
     
     proceedtocheckout.click();
     
	 email.sendKeys("johnbrown11@gmail.com");
	 password.sendKeys("johnb55");
	 signin.click();
	 
	 proceedtocheckout1.click();
	 agree.click();
	 proceedtocheckout2.click();
	 payment.click();
	 conformorder.click();
  }
}
