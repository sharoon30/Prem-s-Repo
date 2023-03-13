package ii_DataDriverTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class A1_DataFromExcelRepository {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("D:\\Xl/Untitled spreadsheet (1).xlsx");
		Workbook wb=WorkbookFactory.create(file);
	Sheet sheet = wb.getSheet("Sheet1");//.getRow(0).getCell(0).toString();
		//System.out.println(sheet);
	
		Row row=   sheet.getRow(0);
		int a=row.getRowNum();
		int b =row.getLastCellNum();
		System.out.println(b);
		//row.getCell(0).toString();// System.out.println(cell.toString());
		 System.out.println(	row.getCell(0).toString());	
	}

}
