package Jan23_HandlinTabs_MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Click_Or_Right_Click {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		
		WebElement target = d.findElement(By.partialLinkText("actiTIME Inc."));
		
		Actions a = new Actions(d);
		
		a.contextClick(target).perform();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);		//VK_T
		Thread.sleep(3000);
		d.quit();
	}

}
