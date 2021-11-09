package com.tide.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tide.reusablecomponents.base;



public class TakeScreenShot extends base{
	
	
	

//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	public void getScreenshot(String result) throws IOException
	{
		java.io.File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\selinium\\selenium-programs\\pracFramework\\Screenshot//"+result+"screenshot.png"));
		
	
}
}

