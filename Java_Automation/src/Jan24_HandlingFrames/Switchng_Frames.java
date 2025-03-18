package Jan24_HandlingFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchng_Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Page1.html");
		d.switchTo().frame(0);
		
	}

}
