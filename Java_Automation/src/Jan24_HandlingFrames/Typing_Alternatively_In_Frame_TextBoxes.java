package Jan24_HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typing_Alternatively_In_Frame_TextBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Page1.html");
		
		d.findElement(By.id("t1")).sendKeys("a");
		d.switchTo().frame("f1");
		d.findElement(By.id("t2")).sendKeys("b");
		d.switchTo().defaultContent();
		d.findElement(By.id("t1")).sendKeys("c");
		
		WebElement we =d.findElement(By.tagName("iframe"));
		d.switchTo().frame(we);
		d.findElement(By.id("t2")).sendKeys("d");
		
		//d.switchTo().frame("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Page2.html")
		Thread.sleep(3000);
		d.quit();
	}

}
