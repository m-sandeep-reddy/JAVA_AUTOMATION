package Dec31_ClickingLinksUsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_Static_Webpage_Using_Tagname {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/OneDrive/Desktop/qspidersLink.html");
		d.findElement(By.tagName("a")).click();
		d.close();
	}

}
