package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   WebDriver driver;
	 
	 @FindBy(xpath="//span[normalize-space()='Home']")
	  WebElement home;
	 
	 @FindBy(xpath="//div[@class='row addresses-lists']//div//li")
	 List<WebElement> homemenuitem;
	 
	 public HomePage(WebDriver driver1)
	 
	 {
		 this.driver=driver1;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public int home1()
	 {
		 int noofhi=homemenuitem.size();
		 return noofhi;
	 }
	 public void printitems()
	 {
		 
		 for(WebElement h:homemenuitem)
		 {
			 System.out.println(h.getText());
		 }
	 }
}
