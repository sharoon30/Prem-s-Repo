package ii_DataDriverTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A2_CallingTheFileFromXlsx {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./xlsxfile/Input1.xlsx");
	Workbook workbook = WorkbookFactory.create(file);
Sheet sheet = workbook.getSheet("Sheet1");
int i=0;
Row row=sheet.getRow(i);
int j=row.getPhysicalNumberOfCells();
int k=sheet.getPhysicalNumberOfRows();

while(i<k) {
 row=sheet.getRow(i);
String s1=row.getCell(0).toString();
System.out.println(s1);
i++;
	}
	}
}
