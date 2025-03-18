package Jan08_FontFamily_Colour_CopyPaseteTf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour_Forgotten_Password_Facebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement c =  d.findElement(By.linkText("Forgotten password?"));
		WebElement f = d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		String colour = c.getCssValue("color");
		System.out.println(f.getCssValue("background-color"));
		System.out.println("Forgotten password? link colour is : "+ colour);

		d.close();
	}
}