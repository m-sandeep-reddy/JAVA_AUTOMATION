package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Logo_Is_Displayed_Or_Not {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		
	boolean a = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img'] ")).isDisplayed();
	//System.out.println(a);
	if(a)
		System.out.println("Facebook logo is displayed");
	else
		System.out.println("Facebook logo is not displayed");
		d.close();
	}

}
