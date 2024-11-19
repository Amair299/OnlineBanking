package com.onlinebanking.banking.genricfileutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
 
	static XSSFWorkbook workbook;
	public static void main(String[] args) throws Exception {
		String name = getDataFromExcel("CustData", 1, 1);
		System.out.println(name);
		String gender = getDataFromExcel("CustData", 1, 2);
		System.out.println(gender);
	}
	
	public static String getDataFromExcel(String sheetName,int rownum,int colnum) throws Exception {
		FileInputStream fis = new FileInputStream("./Test Data/Customers.xlsx");
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rownum);
		String data = row.getCell(colnum).toString();
		workbook.close();
		return data;
	}

}
