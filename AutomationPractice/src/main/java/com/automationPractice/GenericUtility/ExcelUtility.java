package com.automationPractice.GenericUtility;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.*;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
public class ExcelUtility {
	
	/**
	 * Author @shaibaz
	 * apchepoi is mandatory
	 */
	
	/**
	 * This method used to read data from excel from by specifying sheet name, row number, and cell number
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable 
	 */
	public String getExelData(String sheetName,int rownum,int cellnum) throws Throwable
	{
		FileInputStream file = new FileInputStream(IpathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell= row.getCell(cellnum);
		return cell.getStringCellValue();
		
		
		
		
	}

}
