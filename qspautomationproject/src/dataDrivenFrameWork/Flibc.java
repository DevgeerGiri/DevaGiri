package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.asm.Advice.Return;

public class Flibc {
	public String ReadData(String  excelpath,String Sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
	       FileInputStream fis1 = new FileInputStream(excelpath);
	       Workbook wb = WorkbookFactory.create(fis1);
	       Sheet sh = wb.getSheet(Sheetname);
	       Row row = sh.getRow(rowcount);
	       Cell cell = row.getCell(cellcount);
	       String data1 = cell.getStringCellValue();
	       return data1;
	     
	       }
	public void getRountcount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1 = new FileInputStream(excelpath);
	       Workbook wb = WorkbookFactory.create(fis1);
	       Sheet sh = wb.getSheet(sheetName);
	       int rc = sh.getLastRowNum();
		
		
	}

}
