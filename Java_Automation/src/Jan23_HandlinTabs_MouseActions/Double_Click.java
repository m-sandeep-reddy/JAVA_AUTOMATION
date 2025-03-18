package Jan23_HandlinTabs_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		Actions a = new Actions(d);

		a.doubleClick().perform();
		
	}

}
