package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Contents_Of_Static_Webpge {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/travering.html");
		
		  List<WebElement> content = d.findElements(By.tagName("td"));
		  
		  for(WebElement we : content)
		  {
			  System.out.println(we.getText());
		  }
		  d.close();
	}

}
