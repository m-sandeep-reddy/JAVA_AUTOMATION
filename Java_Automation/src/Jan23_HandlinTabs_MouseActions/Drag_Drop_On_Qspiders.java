package Jan23_HandlinTabs_MouseActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_On_Qspiders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		
		
		d.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(2000);
		WebElement target3 = 
				d.findElement(By.xpath("//button[.='Yes']"));
		
		Actions a = new Actions(d);
		a.doubleClick(target3).perform();
		Thread.sleep(2000);
		boolean res = d.findElement(By.xpath("//span[.='You selected \"Yes\"']")).isDisplayed();
		if(res)
			System.out.println("You Selected \"Yes\" is displayed");
		else
			System.out.println("You Selected \"Yes\" is not displayed");
		
		Thread.sleep(2000);
		d.close();	
	}

}
