package readDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 
		FileInputStream fis = new FileInputStream("./data/TextData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	   Row row = sh.getRow(3);
	   Cell cell = row.getCell(2);
	   String data = cell.getStringCellValue();
	   System.out.println(data);
	   
	  
	}

}