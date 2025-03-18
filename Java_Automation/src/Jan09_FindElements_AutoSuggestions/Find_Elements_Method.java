package Jan09_FindElements_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements_Method {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		System.out.println(allLinks.get(1));
		System.out.println(allLinks.get(2).getText());
		d.close();
	}

}
