package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement search;
	
	@FindBy(name="submit_search")
	WebElement submitsearch;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void searchitem()
	{
		search.sendKeys("T-shirt");
		submitsearch.click();
	}
}
