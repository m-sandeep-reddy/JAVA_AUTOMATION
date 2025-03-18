package Jan23_HandlinTabs_MouseActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_Tabs_Without_Quit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allWh = d.getWindowHandles();
		System.out.println("The total no of tabs is : "+allWh.size());
		
		for(String wh : allWh)
		{
			d.switchTo().window(wh);
			d.close();
		}
		
		
	}

}
