package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_And_Y_Axis_Of_Login_Button_Facebook {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		int xaxis = d.findElement(By.name("login")).getRect().x;
		int yaxis = d.findElement(By.name("login")).getRect().y;
		
		System.out.println("X - Axis is : "+xaxis+
				"\nY - Axis is : "+yaxis);
		
		d.close();
		
		
	}

}
