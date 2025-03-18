package Jan30_ReadingData_Property_Execl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_Data_From_Exel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
	}
}
