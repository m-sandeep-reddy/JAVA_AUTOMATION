package Jan24_HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typing_Without_FindElemet {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		d.manage().window().maximize();
		
		d.switchTo().activeElement().sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		
		Thread.sleep(3000);
		d.quit();
	}

}
