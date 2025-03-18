package Feb03_Filelib_GenericLibrary;

import java.io.IOException;

public class P1 {
	public static void main(String[] args) throws IOException {
		File_Lib f = new File_Lib();
		
		String data = f.getPropertyData("password");
		System.out.println(data);
		
		String xldata = f.getExcelData("CreateCustomer",3,3);
		System.out.println(xldata);
		
		f.setExelData("CreateCustomer", 5, 5, "setted");
	}

}
