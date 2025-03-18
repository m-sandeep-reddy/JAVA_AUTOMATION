package Jan20_Robot_Authentication_Printpopus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_Popup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.selenium.dev/");
		d.manage().window().maximize();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(1000);
		
		for(int i = 1; i<=4; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		d.quit();
	}

}
