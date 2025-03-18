package Jan09_FindElements_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_All_Links_In_Flipkart {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		System.out.println("No of links in flipkart are : "+allLinks.size()+"\n");
		
		for( WebElement al: allLinks)
		{
			System.out.println(al);
		}
		
		/*for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i));
		}*/
		
		d.close();
	}

}
