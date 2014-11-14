package com.sharepoint.GenericLib;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonUtills {
String[] a=new String[10];

	
	int i;
	public String getWindowId(int j) {
		Set<String> set=Driver.driver.getWindowHandles();
		Iterator<String>it=set.iterator();
		while(it.hasNext()){
			a[i]=it.next();
		}
		return a[j].toString();
	}
	
//Alert Ok
	public void alertok() {
		Alert alt=Driver.driver.switchTo().alert();
		alt.accept();
		
	}
// Alert cancel
		public void alertcancel() {
			Alert alt=Driver.driver.switchTo().alert();
			alt.dismiss();
			
	}
// To get Alert Message
		public void alertMessage() {
			Alert alt=Driver.driver.switchTo().alert();
			String s1=alt.getText();
			System.out.println(s1);
			
		}
		
//To move to  window
		public void moveTofirstChildWindow(String a)
		{
		
			
			Driver.driver.switchTo().window(a);
			
		}
		/*//To move to Second window
				public void moveToSecondChildWindow()
				{
				
					
					
					String pid=it.next();
					String chid1=it.next();
					String chid2=it.next();
					//String chid3=it.next();
					Driver.driver.switchTo().window(chid2);
					
				}
				//To move to Third window
				public void moveToThirdChildWindow()
				{
				
					Set<String> set=Driver.driver.getWindowHandles();
					Iterator<String>it=set.iterator();
					String pid=it.next();
					String cid1=it.next();
					String ch2=it.next();
					String chid3=it.next();
					Driver.driver.switchTo().window(chid3);
					
				}*/
	
//for press Enter
	public void  enter()
	{
		Actions act=new Actions(Driver.driver);
		act.sendKeys(Keys.ENTER).perform();
	}
//for save
	public void  save()
	{
		Actions act=new Actions(Driver.driver);
		act.sendKeys(Keys.CONTROL,"s");
	}
//for paste
	public void  paste() throws AWTException
	{
		/*Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);*/
		
		Actions act=new Actions(Driver.driver);
		act.sendKeys(Keys.CONTROL,"v");
	}
// for cut 
	public void  cut()
	{
		
		Actions act=new Actions(Driver.driver);
		act.sendKeys(Keys.CONTROL,"x");
	}
//for Right click
	public void  rightClickOnwebElement(WebElement wb)
	{
		
		Actions act=new Actions(Driver.driver);
		act.contextClick(wb).perform();
	}
//for Drag And Drop
		public void  dragAndDrop(WebElement srcwb,WebElement dstwb)
		{
			
			Actions act=new Actions(Driver.driver);
			act.dragAndDrop(srcwb, dstwb).perform();
		}
//double click
		public void  doubleClick()
		{
			
			Actions act=new Actions(Driver.driver);
			act.doubleClick().perform();
		}
		
	
//Implicit wait
	
	public void waitPageLoad() {
		Driver.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	}
//explicit wait till link loaded
	public void waitForLinkPresent(String link) {
		
		WebDriverWait wdriver=new WebDriverWait(Driver.driver, 180);
		wdriver.until(ExpectedConditions.elementToBeClickable(By.linkText(link)));
		
		
	}
//explicit wait till id loaded
	public void waitForIdPresent(String id) {
		
		WebDriverWait wdriver=new WebDriverWait(Driver.driver, 180);
		wdriver.until(ExpectedConditions.elementToBeClickable(By.linkText(id)));
		
		
	}
//explicit wait till name loaded
	public void waitForNamePresent(String name) {
		
		WebDriverWait wdriver=new WebDriverWait(Driver.driver, 180);
		wdriver.until(ExpectedConditions.elementToBeClickable(By.linkText(name)));
		
		
	}
//explicit wait till xpath loaded
	public void waitForXpathPresent(String xpath) {
		
		WebDriverWait wdriver=new WebDriverWait(Driver.driver, 180);
		wdriver.until(ExpectedConditions.elementToBeClickable(By.linkText(xpath)));
		
		}
//Verify Title of page
	public void verifyTitle(String s1){
	String s2=	Driver.driver.getTitle();
		if (s1.equals(s2)) {
			System.out.println("pass");
		
			
		}
		else
		{
			Assert.fail("fail");
		}
		
		
	}
//Page Refresh
			public void refresh()
			{
				Driver.driver.navigate().refresh();
			}
//Page backPge Navigation
			public void backPageNavigation()
			{
				Driver.driver.navigate().back();
			}
//Page ForwardPge Navigation
			public void forwardPageNavigation()
			{
				Driver.driver.navigate().forward();
			}
// Page Maximize
			
			public void PageMaximize()
			{
				Driver.driver.manage().window().maximize();
			}
// To get Current class Name
			public void getClassName(){
			System.out.println(Driver.driver.getClass().getSimpleName());
			}
//To get Page source
			public String getPageSource(){
			String s1=	Driver.driver.getPageSource();
				return s1;
			}
// To select Element by Visible Text in to select list
	public void selectElementbyName(String elementName,WebElement wb)	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(elementName);
		
	}
// To select Element by value in to select list
		public void selectElementbyValue(String value,WebElement wb)	{
			Select sel=new Select(wb);
			sel.selectByValue(value);
			
		}
// To select Element by index in to select list
		public void selectElementbyIndex(int index,WebElement wb)	{
			Select sel=new Select(wb);
			sel.selectByIndex(index);
			
		}
// To Deselect Element by Visible Text in to select list
		public void deSelectElementbyName(String elementName,WebElement wb)	{
			Select sel=new Select(wb);
			sel.deselectByVisibleText(elementName);
			
		}
// To Deselect Element by value in to select list
			public void deSelectElementbyValue(String value,WebElement wb)	{
				Select sel=new Select(wb);
				sel.deselectByValue(value);
				
			}
// To Deselect Element by index in to select list
			public void deSelectElementbyIndex(int index,WebElement wb)	{
				Select sel=new Select(wb);
				sel.deselectByIndex(index);
				
			}
	//To Deselect All
	public void deSelectAll(WebElement wb)	{
		Select sel=new Select(wb);
		sel.deselectAll();
	
	
	}
	// To get all option Present in Select List
  public void getAllElement(WebElement wb,String name){
	// Select sel=new Select(wb);
List<WebElement>	list= Driver.driver.findElements(By.name(name));
System.out.println(list);
	  
	  
  }
  
 // To get WebElement By Xpath value
 public void getWebElementValuebyXpath(String xpath)
 {
	 String s1=Driver.driver.findElement(By.xpath(xpath)).getAttribute("value");
	 System.out.println(s1);
 }
 // To get WebElement By Name value
 public void getWebElementValuebyName(String name)
 {
	 String s1=Driver.driver.findElement(By.name(name)).getAttribute("value");
	 System.out.println(s1);
 }
 // To get WebElement By Id value
 public void getWebElementValuebyId(String id)
 {
	 String s1=Driver.driver.findElement(By.id(id)).getAttribute("value");
	 System.out.println(s1);
 }
 // To get All Web Elements Value
public void getAllWebElementsValue(String xpath)
{
	List<WebElement> lst=Driver.driver.findElements(By.xpath(xpath));
	
	
	
	System.out.println(lst.size());

	for (int i = 0; i < lst.size(); i++) {
		System.out.println(lst.get(i).getAttribute("value"));
		
	}
}
 
// to get  row data

public void getRowData(String rowxpath){
	List<WebElement>lst1=Driver.driver.findElements(By.xpath(rowxpath));
	System.out.println(lst1.size());
	for (int i = 0; i < lst1.size(); i++) {
		System.out.println(lst1.get(i).getText());
}
}
 // to get Text of webelement
public String getText(String xpath){
	String s1=Driver.driver.findElement(By.xpath(xpath)).getText();
	return s1;
}
// to get Value of Webelement
public String getValue(String xpath){
	String s1=Driver.driver.findElement(By.xpath(xpath)).getAttribute("value");
	return s1;
}
			
			
//	verify text present in UI
	public void verifyString(String s1,String s2)
	{
		//String s2=Driver.driver.findElement(By.xpath(".//*[@id='table-scroll']/table/tbody/tr[1]/td[1]")).getText();
		if(s2.equals(s1)){
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}



}
