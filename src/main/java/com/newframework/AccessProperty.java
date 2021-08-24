package com.newframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class AccessProperty implements AutoConstants1{
	public String getdata(int row , int col, String sheetname) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(excelsheetpath));
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}

}
