package Jan20_Robot_Authentication_Printpopus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Class_Usage {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(1);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
