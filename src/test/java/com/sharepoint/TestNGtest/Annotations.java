package com.sharepoint.TestNGtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
	 @DataProvider
	 public Object[][] getData() throws IllegalFormatException, IOException
	 {
	  Object [][] cell=new Object[5][4];
	 FileInputStream fis= new FileInputStream("src\\test\\resources\\data\\Book1.xls");
	 HSSFWorkbook wb=new HSSFWorkbook(fis);
	 HSSFSheet sh=wb.getSheet("sheet1");
	 int rows=sh.getLastRowNum();
	 int cols=sh.getRow(0).getPhysicalNumberOfCells();
	 System.out.println(cols);
	  for (int i = 1; i <=rows ; i++) {
	   for (int j = 0; j <=3; j++) {
	     cell[i][j]=sh.getRow(i).getCell(j).getNumericCellValue();
	     System.out.println(cell[i][j]);
	    }}
	 
	  return cell;
	  }
	 @Test(dataProvider="getData")
	 public void happen(double a,double b,double c,double d)
	 {
		 
		 System.out.println(" first value:"+a+", second value:"+b+", third value:"+c+", fourth value:"+d);
			 
		 //System.out.println(obj[2][1]);
		// System.out.println(st[2][2]);
		 
	 
	 }}


