package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Tagname_Attribute_Of_ViewLIscence_Actitime {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.navigate().to("http://localhost/login.do");
		
		String tagName = d.findElement(By.linkText("View License")).getTagName();
		String attValue = d.findElement(By.linkText("View License")).getAttribute("id");
		d.findElement(By.linkText("View License")).click();
		System.out.println("TagName name is : "+tagName);
		System.out.println("Attribute value is id is : "+attValue);
		d.quit();
	}

}
