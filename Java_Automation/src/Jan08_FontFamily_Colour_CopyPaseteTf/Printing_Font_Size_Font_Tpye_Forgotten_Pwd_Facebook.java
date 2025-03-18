package Jan08_FontFamily_Colour_CopyPaseteTf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Font_Size_Font_Tpye_Forgotten_Pwd_Facebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement c =  d.findElement(By.linkText("Forgotten password?"));
		String fs = c.getCssValue("font-size");
		String ft = c.getCssValue("font-family");
		System.out.println("Forgotten password? link font size is : "+ fs);
		System.out.println("Forgotten password? link font type is : "+ ft);

		d.close();
	}

}
