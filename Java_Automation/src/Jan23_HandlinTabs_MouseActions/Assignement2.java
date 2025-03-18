package Jan23_HandlinTabs_MouseActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//closing child tab first and then closing the parent tab
public class Assignement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("actiTIME Inc.")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> allWh = d.getWindowHandles();
		
		ArrayList a = new ArrayList(allWh);
	
		ListIterator i = a.listIterator(2);
		
		while(i.hasPrevious())
		{
			d.switchTo().window((String) i.previous());
			Thread.sleep(2000);
			d.close();
		}
	}

}
