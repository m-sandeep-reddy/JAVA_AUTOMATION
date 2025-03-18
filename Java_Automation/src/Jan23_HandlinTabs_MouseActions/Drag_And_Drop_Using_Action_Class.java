package Jan23_HandlinTabs_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Using_Action_Class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("http://www.dhtmlgoodies.com/"
				+ "scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = d.findElement(By.xpath("//div[.='Rome'][2]"));
		WebElement dest = d.findElement(By.xpath("//div[.='Italy']"));
		
		Actions a = new Actions(d);
		//a.clickAndHold(src).release(dest).perform();
		a.dragAndDrop(src, dest).perform();
		//a.clickAndHold(src).moveToElement(dest).release().perform();
		Thread.sleep(2000);
		d.close();	
	}

}
