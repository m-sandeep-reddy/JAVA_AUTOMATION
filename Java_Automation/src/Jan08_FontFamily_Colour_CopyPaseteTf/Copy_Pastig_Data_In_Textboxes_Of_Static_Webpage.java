package Jan08_FontFamily_Colour_CopyPaseteTf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Pastig_Data_In_Textboxes_Of_Static_Webpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Button.html");
		
		d.findElement(By.xpath("//input[@type ='text' "
				+ "and @value = 'A']")).sendKeys(Keys.CONTROL+"ac");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@type ='text' "
				+ "and @value = 'B']")).sendKeys(Keys.CONTROL+"av");
		
		Thread.sleep(2000);
		
		d.close();
		
	}

}
