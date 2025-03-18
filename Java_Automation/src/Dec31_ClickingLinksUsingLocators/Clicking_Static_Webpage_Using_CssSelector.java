package Dec31_ClickingLinksUsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_Static_Webpage_Using_CssSelector {
	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.get("file:///C:/Users/SANDEEP/OneDrive/Desktop/qspidersLink.html");
	d.findElement(By.cssSelector("a[id=\"d1\"]")).click();
	Thread.sleep(1000);
	d.navigate().back();
	d.findElement(By.cssSelector("a[class=\"c1\"]")).click();
	Thread.sleep(1000);
	d.navigate().back();
	d.findElement(By.cssSelector("a[name=\"n1\"]")).click();
	Thread.sleep(1000);
	d.navigate().back();
	d.findElement(By.cssSelector("a[href=\"https://www.qspiders.com\"]")).click();
	Thread.sleep(1000);
	d.navigate().back();
	d.close();
	}
}
