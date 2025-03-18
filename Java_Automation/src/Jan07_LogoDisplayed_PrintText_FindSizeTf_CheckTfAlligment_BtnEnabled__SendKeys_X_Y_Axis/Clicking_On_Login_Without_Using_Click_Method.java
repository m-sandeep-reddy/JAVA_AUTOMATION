package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_On_Login_Without_Using_Click_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		
	d.findElement(By.name("login")).submit();
	Thread.sleep(5000);
	d.close();
	}

}
