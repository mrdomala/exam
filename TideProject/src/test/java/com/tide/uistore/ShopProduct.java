package com.tide.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProduct {
	public WebDriver driver;
	
	By shopPro = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[1]/a");
	
	By powder = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[1]/div/div[1]/div[3]/a/span");
	
	public ShopProduct(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getPowder() {

		return driver.findElement(powder);
	}
	public WebElement getSopPro() {

		return driver.findElement(shopPro);
	}
	

}
