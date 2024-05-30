package utlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.ExcelAntEvaluateCell;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Properties_utlities {
	//public static void main(String[] args) throws IOException {
			public String readproperties(String key) throws IOException
			{
		//step-->>get the obj of external file
		FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty( "key");
		//Excel_utlity e=new Excel_utlity ();
	 return data;
		}
	}
