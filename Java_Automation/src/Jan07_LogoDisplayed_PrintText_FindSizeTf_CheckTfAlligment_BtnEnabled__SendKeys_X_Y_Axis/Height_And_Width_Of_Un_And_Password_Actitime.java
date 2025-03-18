package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_And_Width_Of_Un_And_Password_Actitime {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		int unH = d.findElement(By.id("username")).getRect().height;
		int unW= d.findElement(By.id("username")).getRect().width;
		
		int pwdH = d.findElement(By.name("pwd")).getRect().height;
		int pwdW = d.findElement(By.name("pwd")).getRect().width;
		
		if(unH == pwdH && unW == pwdW)
			System.out.println("Username and password are same width and height");
		else
			System.out.println("Username and password are not same width and height");
		d.close();
	}

}
