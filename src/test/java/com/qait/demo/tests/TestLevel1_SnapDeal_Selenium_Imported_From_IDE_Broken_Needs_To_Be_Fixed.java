/**
* This is a sample test recorded in selenium ide and exported to eclipse
* Step 1 : Open snapdeal.com
* Step 2 : Search A product - Mobile
* Step 3 : Select First Product
* Step 4 : Add the product to cart
* Step 5 : Verify the product has been added to cart
* 
* Task : You have to fix this test and run it.
*/



package com.qait.demo.tests;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.qait.automation.getpageobjects.*;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.NoSuchElementException;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLevel1_SnapDeal_Selenium_Imported_From_IDE_Broken_Needs_To_Be_Fixed {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  //String winHandleBefore = driver.getWindowHandle();
  

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.snapdeal.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
  }

@Test
  public void testECommerceSite() throws Exception {
	    driver.get(baseUrl + "/");
	 
	    driver.findElement(By.id("inputValEnter")).click();
	 
	    driver.findElement(By.id("inputValEnter")).clear();
	 
	    driver.findElement(By.id("inputValEnter")).sendKeys("mobile");
	 
	    driver.findElement(By.xpath("//button[@onclick=\"submitSearchForm('go_header');\"]")).click();
	 
	    driver.findElement(By.xpath("(//img[contains(@class,'product-image')])[1]")).click();
	 
	    Set<String> windows = driver.getWindowHandles();
	    for(String window : windows)
	    driver.switchTo().window(window);
	    driver.findElement(By.xpath("//div[@id='add-cart-button-id']/span")).click();
	    System.out.println("Step 4 : Add the product to cart completed.");
	    
	    driver.findElement(By.xpath("//div[@id='cartProductContainer']//a[text() = 'Proceed To Checkout']")).click();
	      
	    driver.findElement(By.xpath("(//img[@title = 'Snapdeal' ])[1]")).click();;
	    driver.findElement(By.xpath("//div[@id='sdHeader']//div[@class='cartInner']/i")).click();
	    driver.findElement(By.xpath("//div[@id='cartModal']//ul/li[contains(@class,'cart-item')]//a[text()='Redmi Note 3 32 GB']"));
	    System.out.println("Step 5:  Verified Mobile is Present in cart");
	    
  }
  
   @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
