package Jan31_Writing_Data_Into_Execl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writing_Data_From_Exel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		wb.getSheet("CreateCustomer").getRow(1).getCell(2).setCellValue("Rename");
		FileOutputStream fos = new FileOutputStream("./data/TestScriptData.xlsx");
		
		wb.write(fos);
	}
	
}
