package date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dummy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//step-->>get the obj of external file
		FileInputStream fis=new FileInputStream("./test_script_data/A1.xlsx");
		//step2-->open workbook in read mode
		 Workbook workbook = WorkbookFactory.create(fis);
		//step3-->get sheet control
		 Sheet sheet = workbook.getSheet( "Sheet1");
		 //step4-->get row control
		 Row row = sheet.getRow(1);
		 //step5-->get cell data
		 Cell cell = row.getCell(4);
		 //step-->6read the data
		 String email = cell.getStringCellValue();
		 System.out.println(email);
	}

}
