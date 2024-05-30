package date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_excel_files_usingAS {
	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
		public String readexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		          //step-->>get the obj of external file
		FileInputStream fis=new FileInputStream("./test_script_data/A1.xlsx");
		//step2-->open workbook in read mode
		Workbook workbook = WorkbookFactory.create(fis);
		//step3-->get sheet control
		 Sheet sheet = workbook.getSheet( "sheetname");
		 //step4-->get row control
		 Row row = sheet.getRow(rowno);
		 //step5-->get cell data
		 Cell cell = row.getCell(cellno);
		 //step-->6read the data
		 String data = cell.getStringCellValue();
		 return data;
	}
	}
