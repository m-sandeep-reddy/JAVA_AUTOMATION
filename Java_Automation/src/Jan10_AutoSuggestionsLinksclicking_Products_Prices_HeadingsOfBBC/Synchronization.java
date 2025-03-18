package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		d.close();
	}

}
