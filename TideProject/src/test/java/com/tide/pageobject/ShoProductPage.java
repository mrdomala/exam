package com.tide.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tide.reusablecomponents.base;
import com.tide.uistore.ShopProduct;

public class ShoProductPage extends base{
	
	public static Logger log = Logger.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialised");
		driver.get(p.getProperty("url"));

		log.info("navigation to url");

	}
	
	@Test
	public void navigateToShop() throws InterruptedException {
		
		ShopProduct sp = new ShopProduct(driver);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.moveToElement(sp.getSopPro()).perform();
		Thread.sleep(5000);
		sp.getPowder().click();
		
		if(driver.getPageSource().contains("Tide Free and Gentle powder"))
		{
			System.out.println("Tide Free and Gentle powder was present");
		}
		else
		{
			System.out.println("Tide Free and Gentle powder was not present");
		}
	}
	
	
	  @AfterTest public void close() {
	  
	  driver.quit(); 
	  driver=null;
	  
	  }
	 
}
