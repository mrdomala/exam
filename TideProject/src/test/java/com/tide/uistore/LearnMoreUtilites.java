package com.tide.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LearnMoreUtilites {
	
	
	public WebDriver driver;
	

	By learnmore=By.xpath("//div[@class='row no-gutters  justify-content-start   how-to-do-laundry animate-section-orange-bg']//a[@href='/en-us/how-to-wash-clothes/how-to-do-laundry']");
	By symbol=By.xpath("//*[@id=\"site-content\"]/div/div/div/div[2]/div[2]/div/div/div/div[7]/div/div[2]/div/a[1]");
			
			
			
			
			
			
		public  LearnMoreUtilites(WebDriver driver) {
		
		 this.driver=driver;
	}
	
	
	
	public WebElement getLearnmore() {
		
		return driver.findElement(learnmore);
		
		
	}

	
	public WebElement getSymbol() {
		
		return driver.findElement(symbol);
		
		
	}


}
