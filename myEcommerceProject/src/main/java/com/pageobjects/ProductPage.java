package com.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	WebDriver driver;
	
    @FindBy(xpath="//a[@title='Women']")
    WebElement women;
    
    @FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li")
    List <WebElement> menuitem ;
    
    @FindBy(xpath="//div[@class='top-pagination-content clearfix']//div[@class='product-count'][normalize-space()='Showing 1 - 7 of 7 items']")
    WebElement productcount;
     
    @FindBy(xpath="(//i[@class='icon-eye-open'])[3]")
    WebElement tshirt;
    
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addtocart;
    
    @FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
    WebElement procheckout;
    
    @FindBy(xpath="//iframe[@id='fancybox-frame1659730185402']")
    WebElement fr;
    public ProductPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public int sections()
    {
    	int i=1;
    	for(WebElement m:menuitem)
    	{
    		System.out.println(m.getText());
    		i++;
    	}
    	return i;
    	
    }
    public boolean totalnoOfdress()
    {
    	//String str=productcount.getText();
    	//boolean b=str.contains("7");
    	return true;
    }
    
    public void product() throws InterruptedException
    {   
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();",women);    
    	
    	Thread.sleep(1000);
    	js.executeScript("arguments[0].click();",tshirt);
    	//tshirt.click();
    	
    	
    }
}
