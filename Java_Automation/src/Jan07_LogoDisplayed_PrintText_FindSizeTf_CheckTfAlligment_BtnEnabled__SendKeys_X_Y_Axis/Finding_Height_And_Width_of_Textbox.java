package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Height_And_Width_of_Textbox {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		WebElement e = d.findElement(By.id("username"));
		
		String title = d.getCurrentUrl();
		String t2 = d.getTitle();
		System.out.println(title);
		System.out.println(t2);
		
		//int height = e.getSize().getHeight();
		int height = e.getRect().height;
		int width = e.getSize().width;
		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		d.close();
	}
}
