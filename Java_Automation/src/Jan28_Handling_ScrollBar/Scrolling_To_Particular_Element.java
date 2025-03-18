package Jan28_Handling_ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_To_Particular_Element {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		
		JavascriptExecutor j = (JavascriptExecutor) d;
		
		int y = d.findElement(By.xpath("//h2[.='War in Ukraine']")).getRect().getY();
		j.executeScript("window.scrollTo(0,"+y+")");
	}

}
