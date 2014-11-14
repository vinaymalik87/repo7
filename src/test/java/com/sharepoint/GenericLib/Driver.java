package com.sharepoint.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Driver {
	public static WebDriver driver;
	 public void openBrowser(String browserName){
	 try{
		 if(browserName.equalsIgnoreCase("Firefox")){
			 driver=new FirefoxDriver();
		 }
		 else if(browserName.equalsIgnoreCase("Chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\browser files\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("IE")){
			 System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\browser files\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		 }}
		 catch(WebDriverException e){
			 System.out.println(e.getMessage());
		 }}}


