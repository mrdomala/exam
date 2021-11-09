 package com.tide.reusablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base {
	
	 public WebDriver driver;
	 public Properties p;
	
	public WebDriver initializeDriver() throws IOException {
		
		
		 p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\Downloads\\TideProject\\TideProject\\testdata\\configure.properties");
		p.load(fis);
		String browserName=p.getProperty("browser");
	
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver = new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./driver/geckodriver.exe");
			 driver = new FirefoxDriver();
			
			
		}else if(browserName.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.chrome.driver", "./driver/msedgedriver.exe");
			 driver = new EdgeDriver();
			
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	

	
	public void getScreenShot(String result) throws IOException {
		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
//		try {
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File sourse=ts.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(sourse,new File("D:\\selinium\\selenium-programs\\E2Eproject\\Screenshot//"+result+".png"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block    D:\selinium\selenium-programs\E2Eproject\Screenshot
//			e.printStackTrace();
//		}
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\selinium\\selenium-programs\\E2Eproject\\Screenshot//"+result+".png"));
		
		 //FileHandler(src,new File("D:\\selinium\\selenium-programs\\E2Eproject\\Screenshot\\"+result+".png"));
		// File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	/*	 try {
			FileHandler.copy(srcFile,new File("D:\\selinium\\selenium-programs\\E2Eproject\\Screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}

