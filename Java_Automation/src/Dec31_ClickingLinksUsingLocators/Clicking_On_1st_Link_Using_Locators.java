package Dec31_ClickingLinksUsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_On_1st_Link_Using_Locators {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/OneDrive/Desktop/qspidersLink.html");
		d.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		
		d.navigate().back();
		d.findElement(By.id("d1")).click();
		Thread.sleep(1000);
		
		d.navigate().back();
		d.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		
		d.navigate().back();
		d.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		
		d.navigate().back();
		d.close();
	}

}
