package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Generic class for data driven testing
 * @author SANDEEP
 */
public class File_Lib {
	/**
	 * This is a generic class for reading the data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	/**
	 * This is a generic class for reading the data from the exel file
	 * @param sheetnme
	 * @param i
	 * @param j
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int i,int j) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(i).getCell(j).getStringCellValue();
		return data;
	}
	
	/**
	 * This is a generic class for writing the data from the exel file
	 * @param sheetname
	 * @param i
	 * @param j
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExelData(String sheetname,int i , int j,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		wb.getSheet(sheetname).getRow(i).getCell(j).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/TestScriptData.xlsx");
		wb.write(fos);
	}
}
