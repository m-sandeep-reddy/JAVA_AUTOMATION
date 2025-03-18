package Jan22_GetWindowHandles;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anti_Popup_Blocker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> allWh = d.getWindowHandles();
		
		for(String wh : allWh)
		{
			
			d.switchTo().window(wh);
			String text = d.getPageSource();
			if(text.contains("Anti-Popup-Blocker screen"))
			{
				System.out.println(d.getTitle());
			}
			d.close();
		}
	}

}
