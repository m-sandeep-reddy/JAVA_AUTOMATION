package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remember_Pwd_Is_Selectd_OrNot_Actitime {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.navigate().to("http://localhost/login.do");
		
		boolean res= d.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(res)
			System.out.println("Remember Password checkbox is selected");
		else
			System.out.println("Remember Password checkbox is not selected");
		d.close();
	}

}
