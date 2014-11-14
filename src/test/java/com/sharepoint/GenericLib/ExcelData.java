package com.sharepoint.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelData {
	private FileInputStream file;
	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	private HSSFCell cell;
	private DataFormatter formatter;
	private FileOutputStream outfile;
	public void setExcel(String path,String sheetname) throws IOException
	{
		file=new FileInputStream(path);
		workbook=new HSSFWorkbook(file);
		sheet=workbook.getSheet(sheetname);
		}
	public String getCellValue(int row,int col){
		cell=sheet.getRow(row).getCell(col);
				formatter=new DataFormatter();
		return formatter.formatCellValue(cell);
		}
	
	public int getRowCount(){
		return sheet.getLastRowNum();
	}
	public int rowInitialIndex(){
		return sheet.getFirstRowNum();
	}
	//this method return int value start from index 1 but not 0
	public int getcolcount(){
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}}


