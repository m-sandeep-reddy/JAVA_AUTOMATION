package Jan09_FindElements_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions_In_Google_Search_Bar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		d.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(2000);
		List <WebElement>allLinks = d.findElements(By.xpath("//span[contains(text(),'java')]"));
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
