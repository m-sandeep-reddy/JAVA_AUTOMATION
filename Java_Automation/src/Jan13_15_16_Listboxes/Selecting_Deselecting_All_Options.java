package Jan13_15_16_Listboxes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Deselecting_All_Options {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		
		
		for (int i = 0; i < count; i++) {
			
			Thread.sleep(100);
			s.selectByIndex(i);	
		}
		/*Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);*/
		
		for(int i = count-1 ;i>=0;i--)	
		{
			Thread.sleep(100);
			s.deselectByIndex(i);
		}
		d.close();
	}
}
