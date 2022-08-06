package com.utilityPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	

	public void screenshot(WebDriver driver, String filepath) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(filepath);
		FileUtils.copyFile(src, trg);
	}

}
