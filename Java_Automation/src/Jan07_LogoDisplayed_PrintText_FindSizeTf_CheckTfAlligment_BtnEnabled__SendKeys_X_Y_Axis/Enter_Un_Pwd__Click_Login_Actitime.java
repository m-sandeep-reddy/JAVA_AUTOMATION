package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Un_Pwd__Click_Login_Actitime {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		d.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		d.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		d.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		d.close();
	}

}
