package Jan23_HandlinTabs_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drad_And_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement src = d.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dest = d.findElement(By.xpath("//h1[.='Block 4']"));
		
		Actions a = new Actions(d);
		
		a.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		d.close();
	}

}
