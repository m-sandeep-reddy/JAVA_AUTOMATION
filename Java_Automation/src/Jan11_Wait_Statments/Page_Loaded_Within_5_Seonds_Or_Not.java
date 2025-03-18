package Jan11_Wait_Statments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Loaded_Within_5_Seonds_Or_Not {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		try {
			d.get("https://www.wish.com/");
			System.out.println("Page loaded within 5 seconds");
		}
		catch(Exception e)
		{
			System.out.println("Page not loaded within 5 seconds");
		}
		d.close();
	}
}
