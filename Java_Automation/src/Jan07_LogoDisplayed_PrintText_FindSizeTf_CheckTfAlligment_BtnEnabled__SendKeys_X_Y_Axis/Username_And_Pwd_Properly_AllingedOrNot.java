package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_And_Pwd_Properly_AllingedOrNot {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		WebElement un = d.findElement(By.id("username"));
		int width = d.findElement(By.name("pwd")).getRect().getX();
		
		int height = un.getLocation().x;
		
		if(height == width)
			System.out.println("username and password are alligned properly "+height+" "+width);
		else
			System.out.println("username and password are not properly alligned "+height+" "+width);
		d.close();
	}

}
