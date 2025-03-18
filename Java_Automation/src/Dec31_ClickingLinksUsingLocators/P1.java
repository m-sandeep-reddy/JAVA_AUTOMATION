package Dec31_ClickingLinksUsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/OneDrive/Desktop/qspidersLink.html");
		d.findElement(By.partialLinkText("Goo")).click();
		System.out.println();
		d.close();
	}
}
