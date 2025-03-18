package Jan23_HandlinTabs_MouseActions;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Mutliple_Qspiders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		d.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		d.findElement(By.xpath("//section[.='Drag & Drop']")).click();
		d.findElement(By.xpath("//a[.='Drag Multiple']")).click();
		
		WebElement target1 = 
				d.findElement(By.id("dragElement1"));
		WebElement target2 = 
				d.findElement(By.id("dragElement2"));
		WebElement target3 = 
				d.findElement(By.id("dragElement3"));
		
				d.findElement(By.id("dragElement4"));
		WebElement target4 = 
				d.findElement(By.id("dragElement4"));
		
		WebElement dest1 = d.findElement(By.id("dropZone1"));
		WebElement dest2 = d.findElement(By.id("dropZone2"));
		Actions a = new Actions(d);
		
		a.click(target1).perform();
		a.click(target2).perform();
		a.click(target3).perform();
		a.click(target4).perform();
		a.clickAndHold(target4).moveToElement(dest1).release().perform();
		
		//a.click(target1).click(target2).click(target3).clickAndHold(target4).moveToElement(dest1).release().perform();
		
		Thread.sleep(3000);
		d.close();	
	}

}
