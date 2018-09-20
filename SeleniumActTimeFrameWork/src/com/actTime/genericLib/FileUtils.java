package com.actTime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils 
{
	public Properties getPropertyFileObject() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./TestData/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}
    public String getExcelData(String sheetName, int rowName, int ColName) throws Throwable
    {
		FileInputStream fis = new FileInputStream("./TestData/testScriptData.xlsx");
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sh = wb.getSheet(sheetName);
    	Row row = sh.getRow(rowName);
    	String data = row.getCell(ColName).getStringCellValue();
    	wb.close();
    	return data;
    }
    public void setExcelData(String sheetName, int rowName, int colName, String data)throws Throwable
	{
		FileInputStream fis = new FileInputStream("./TestData/testScriptData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheetName);
        Row row = sh.getRow(rowName);
        Cell cel = row.createCell(rowName);
        cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./TestData/testScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}
}
