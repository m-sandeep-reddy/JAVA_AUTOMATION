package Jan28_Handling_ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Bottom_And_Up {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver d = new ChromeDriver();
	d.get("https://www.bbc.com/");
	
	JavascriptExecutor j = (JavascriptExecutor) d;
	
	//j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//scrollto not adds extra starts from 0
	//scrollby starts from where the cursor is present is and add the height or width
	//j.executeScript("window.scrollBy(document.body.scrollWidth,0)");
	j.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");
	Thread.sleep(3000);
	
	j.executeScript("window.scrollTo(0,0)");
	
	}
}