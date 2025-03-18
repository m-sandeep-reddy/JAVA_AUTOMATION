package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Headings_Under_More_News_BBC {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		
		//List<WebElement> headings = d.findElements(By.xpath
		//		("//h2[@data-testid='ohio-title']/../../../../../../div[2]/div"));
				
		List<WebElement> headings = d.findElements(By.xpath
				("//h2[@data-testid='ohio-title']/../../../../../..//div[2]//h2[@data-testid='card-headline']"));
		
		System.out.println("Count of headings is : "+headings.size()+"\n");
		int a = 1;
		for(WebElement we : headings)
		{
			System.out.println(a+++" -> "+we.getText()+"\n");
		}
		d.close();
	}

}
