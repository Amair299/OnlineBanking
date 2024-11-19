package com.onlinebanking.banking.genricfileutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtility {

	XSSFWorkbook workbook ;
	public int getCountOfRows(String sheetName) throws Exception {
		FileInputStream fis = new FileInputStream("./Test Data/Customers.xlsx");
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		workbook.close();
		return rows;
	}
	
	public String getDataFromExcel(String sheetName,int rownum,int colnum) throws Exception {
		FileInputStream fis = new FileInputStream("./Test Data/Customers.xlsx");
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rownum);
		String data = row.getCell(colnum).toString();
		workbook.close();
		return data;
	}
}
