package com.tide.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.tide.reusablecomponents.base;
import com.tide.uistore.LearnMoreUtilites;

public class LearnMorePage extends base {
	
	public static Logger log=Logger.getLogger(base.class.getName());

		
		
		@BeforeTest
		public void init( ) throws IOException {
			driver=initializeDriver();
			log.info("Driver is initialised");
			driver.get(p.getProperty("url"));

			System.out.println(p.getProperty("url"));
			log.info("navigation to url");		
				
			
		}
		
		@Test
		public void learn() throws InterruptedException {
			
			LearnMoreUtilites l=new LearnMoreUtilites(driver);
			
			
			Thread.sleep(5000);
			
			l.getLearnmore().click();
			
			Assert.assertEquals(l.getSymbol().getText(), "How to Read Laundry Symbols");
			log.info("Assertion completed");
			
			
			
		}
		@AfterTest
		public void close() {
			
			driver.quit();
			
		}

	}