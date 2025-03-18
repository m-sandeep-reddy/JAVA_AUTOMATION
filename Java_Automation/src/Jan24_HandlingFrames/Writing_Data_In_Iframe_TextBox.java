package Jan24_HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writing_Data_In_Iframe_TextBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Page1.html");
		
		d.findElement(By.id("t1")).sendKeys("jsp");
		
		d.switchTo().frame(0);
		System.out.println(d.getWindowHandle());
		System.out.println(d.getPageSource());
		System.out.println();
		d.findElement(By.id("t2")).sendKeys("qsp");
		
		d.switchTo().defaultContent();
		System.out.println(d.getWindowHandle());
		System.out.println(d.getPageSource());
		d.findElement(By.id("t1")).sendKeys("jsp");
		
		d.switchTo().frame(0);
		d.findElement(By.id("t2")).sendKeys("qsp");
		
		//d.switchTo().frame("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Page2.html")
		Thread.sleep(3000);
		d.quit();
	}

}
