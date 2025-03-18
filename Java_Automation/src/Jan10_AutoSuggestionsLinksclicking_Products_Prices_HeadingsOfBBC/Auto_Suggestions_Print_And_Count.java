package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions_Print_And_Count {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		d.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		List <WebElement>allLinks = d.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println("Total Auto Suggestions : "+allLinks.size()+"\n");
		
		for (WebElement allWh : allLinks) {
			System.out.println(allWh.getText());
			
		}
		Thread.sleep(2000);
		allLinks.getLast().click();
		//allLinks.get(allLinks.size()-1).click();
		Thread.sleep(2000);
		
		d.close();
	}

}
