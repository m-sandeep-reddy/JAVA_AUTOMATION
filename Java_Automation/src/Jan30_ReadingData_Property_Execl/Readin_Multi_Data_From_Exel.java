package Jan30_ReadingData_Property_Execl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readin_Multi_Data_From_Exel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int count = wb.getSheet("CreateCustomer").getLastRowNum();
		System.out.println(count);
		for(int i = 1;i<count;i++)
		{
			String un = wb.getSheet("CreateCustomer").getRow(i).getCell(1).getStringCellValue();
			String pwd = wb.getSheet("CreateCustomer").getRow(i).getCell(2).getStringCellValue();
			System.out.print("un : "+un);
			System.out.println("	pwd " +pwd);
		}
	}

}
