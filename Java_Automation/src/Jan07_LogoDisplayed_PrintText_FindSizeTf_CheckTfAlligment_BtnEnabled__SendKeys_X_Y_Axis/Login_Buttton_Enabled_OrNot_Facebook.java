package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Buttton_Enabled_OrNot_Facebook {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		
		boolean res = d.findElement(By.xpath("//input[@id='email']")).isEnabled();
		if(res)
			System.out.println("Login Buttton is Enabled");
		else
			System.out.println("Login Button is not Enabled");
		d.close();
		
	}

}
