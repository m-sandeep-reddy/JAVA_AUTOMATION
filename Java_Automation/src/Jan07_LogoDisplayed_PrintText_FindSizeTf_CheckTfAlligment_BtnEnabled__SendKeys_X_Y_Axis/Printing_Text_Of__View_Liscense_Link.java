package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Text_Of__View_Liscense_Link {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		
	String text = d.findElement(By.id("licenseLink")).getText();
	System.out.println(text);
	//System.out.println(d.getPageSource());
	Thread.sleep(5000);
	d.close();
	}

}
