package com.sharepoint.GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportLib {
	public void getsnapShot() throws IOException{
		 File srcFile = ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile,new File("screenshot//shot1.jpg")); 
		
	}}


