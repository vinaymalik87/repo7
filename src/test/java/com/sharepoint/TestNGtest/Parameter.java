package com.sharepoint.TestNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	private WebDriver driver;
	@Parameters("browser")
    @BeforeMethod
    public void LaunchBrowser(String browser) throws Exception
    {
    	
    		  if(browser.equals("firefox")){
    		  System.out.println("FireFox Browser");
    		   driver = new FirefoxDriver();
    		  }
    		  else if(browser.equals("chrome")){
		       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\browser files\\chromedriver.exe");
		       System.out.println("Chrome Browser");
    		   driver = new ChromeDriver();
    		  }
	        else if(browser.equals("ie")){
    		    System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\browser files\\IEDriverServer.exe");
    		    System.out.println("InternetExplorer Browser");
    		   driver=new InternetExplorerDriver();
    		
	        }
    		  driver.manage().window().maximize();
    		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     }
	@Test
	public void done(){
		System.out.println("done");
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}}


