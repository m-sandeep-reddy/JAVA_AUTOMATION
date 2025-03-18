package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Un_Pwd_Properly_Alligned_Or_Not_Actitime {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		int x1 = d.findElement(By.name("username")).getRect().x;
		int y1 = d.findElement(By.name("username")).getRect().y;
		
		int x2 = d.findElement(By.name("pwd")).getRect().x;
		int y2 = d.findElement(By.name("pwd")).getRect().y;
		
		if(x1 == x2 && y1 == y2)
			System.out.println("Username and password are Properly alligned \n"
								+ x1 +" "+ x2 +" "+y1+" "+y2);
		else
			System.out.println("Username and password are not properly alligned\n"
							    + x1 +" "+ x2 +" "+y1+" "+y2);
		d.close();
	}

}
