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

public class ReadMultipalData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		
		
		for(int i=0;i<=4;i++)
		{
		
          		FileInputStream fis = new FileInputStream("./data/TextData.xlsx");
          		Workbook wb = WorkbookFactory.create(fis);
          		Sheet sh = wb.getSheet("Sheet1");
          		Row row = sh.getRow(i);
          		Cell cell = row.getCell(0);
          		String data = cell.getStringCellValue();
          		System.out.println(data);
		}
	}

}
