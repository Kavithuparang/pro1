package com.base;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.pageobjects.CreateAccountPage;
import com.pageobjects.CartPage;
import com.pageobjects.CheckoutPage;
import com.pageobjects.CreateAccountForm;
import com.pageobjects.HomePage;
import com.pageobjects.IndexPage;
import com.pageobjects.ProductPage;
import com.pageobjects.SearchPage;
import com.pageobjects.ShopingCartPage;
import com.pageobjects.SignIn;
import com.pageobjects.SignOutPage;
import com.utilityPackage.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	
   public static WebDriver driver;
	
	 
	CreateAccountForm createformpage;
	HomePage hpg;
	 Screenshot sc=new Screenshot();
    
    
	@BeforeTest
	  public void setup() {
		 
		
		  
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		
	     driver.get("http://automationpractice.com/index.php");
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.manage().window().maximize();
				
	  }
	  @AfterTest
	  public void teardown()
	  {
		  driver.close();
	  }
	
  @Test
  public void launchtest()
  {
	  System.out.println("================");
	  driver.getTitle();
  }
  
  @Test(enabled=true)
  public void logotest() throws IOException
  {
	  IndexPage indexpage=new IndexPage(driver);
	  boolean log2=indexpage.logomethod();
	  Assert.assertEquals(true, log2);
  }
  
  @Test(enabled=true)
  public void accountCreationtest() throws Exception 
  {
	 IndexPage indexpage=new IndexPage(driver);
	 
	createformpage=indexpage.index("riyatina@gmail.com");
	sc.screenshot(driver,".\\screenshots\\createaccount.png");
	createformpage.createformtest( "Johnathan",
			  "Brown",
			  "riyatg78",
			  "company",
			  "55 st drive", "apt 6", "Naperville",
			  "Illinois", "60563","United States", "My new accout",
			  "8908909010", "2233445566","123 cont ave apt 3");
	//sc.screenshot(driver,".\\screenshots\\createaccount.png");
	 Thread.sleep(1000);
	 }
  @Test(enabled=true)
  public void creataccountfail()
  {
	  CreateAccountPage cap=new CreateAccountPage(driver);
	  boolean msg1=cap.createAccounterror("johnbrown11@gmail.com");
	  System.out.println(msg1);
	  Assert.assertEquals(true,msg1);
  }
  
  //CreatAccount test method
  
  @Test(enabled=true)
  public void signintest() throws Exception 
  
  {	 
	  SignIn signin=new SignIn(driver);
	   signin.siginincheck("johnbrown11@gmail.com","johnb55");
	  // Screenshot sc=new Screenshot();
	   sc.screenshot(driver,".\\screenshots\\signin.png");
	   
	  	   HomePage hpg=new HomePage(driver);
	   hpg.printitems();
	
	   Assert.assertEquals(5,hpg.home1());
	
		 
	  
	  System.out.println("My accout created and landed on home page");
	 
  }
  
  @Test(dependsOnMethods = "signintest",enabled = true)
  public void signouttest() throws IOException
  {
	  SignOutPage sop=new SignOutPage(driver);
	  sop.sout();
	  sc.screenshot(driver, ".\\screenshots\\signout.png");
  }
  
  @Test(enabled=true)
  public void searchtest() throws InterruptedException
  {
	  SearchPage sp=new SearchPage(driver);
	  sp.searchitem();
	  Thread.sleep(1000);
	  
  }
  @Test(enabled =true)
  public void producttest() throws InterruptedException
  {
	 ProductPage pp=new ProductPage(driver);
	 pp.sections();
	 pp.totalnoOfdress();
	 Thread.sleep(1000);
	 pp.product();
	 
  }
  @Test(enabled =true)
  public void checkouttest() throws InterruptedException
  {
	  CheckoutPage cp=new CheckoutPage(driver);
	  cp.checkout();
	  
  }
  
  @Test(enabled =true)
  public void finalcheck() throws InterruptedException, IOException
  {
	  ShopingCartPage sp=new ShopingCartPage(driver);
	  Thread.sleep(1000);
	  sp.finalcheckout();
	  sc.screenshot(driver,".\\screenshots\\summary.png");
  }
}
