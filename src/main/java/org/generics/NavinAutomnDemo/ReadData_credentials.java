package org.generics.NavinAutomnDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_credentials {

	//read and tranfer data to appln
	public static String getCellData(String exlpath, String exlsheet,int row , int celll) throws IOException {
	FileInputStream fis=new FileInputStream(exlpath);	
    XSSFWorkbook archivebook = new XSSFWorkbook(fis);
    Sheet sh=archivebook.getSheet(exlsheet);
    Row r = sh.getRow(row);
    Cell c = r.getCell(celll);
    String ad=c.getStringCellValue();
    return ad;
}  

}
 