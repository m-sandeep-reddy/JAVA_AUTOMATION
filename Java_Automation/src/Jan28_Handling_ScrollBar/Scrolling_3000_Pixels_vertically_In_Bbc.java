package Jan28_Handling_ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_3000_Pixels_vertically_In_Bbc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		
		JavascriptExecutor j = (JavascriptExecutor) d;
		
		j.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(0,2000)");
	}

}
