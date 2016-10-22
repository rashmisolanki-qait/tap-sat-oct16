package com.qait.demo.keywords;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;

public class ProductDetailsActions extends GetPage {

	WebDriver driver;
	private EventFiringWebDriver e_driver;

	public ProductDetailsActions(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;

	}

	public void AddTheProductToCart() {
		 Set<String> windows = driver.getWindowHandles();
		    for(String window : windows)
		    driver.switchTo().window(window);
		    
		   logMessage("switched to new window.");
		
		element("//div[@id='add-cart-button-id']/span").click();
	   logMessage("Click on 'Add to Cart' button.");
		
		
	}

}
