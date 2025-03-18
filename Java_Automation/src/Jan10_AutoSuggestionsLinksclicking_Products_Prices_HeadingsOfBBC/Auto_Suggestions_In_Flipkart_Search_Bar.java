package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions_In_Flipkart_Search_Bar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		 //d.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		
		d.findElement(By.className("Pke_EE")).sendKeys("iphone");
		Thread.sleep(2000);
		
		//d.findElement(By.className("Pke_EE")).sendKeys(Keys.ENTER);
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//List <WebElement> sugg = d.findElements(By.xpath("//span[contains(text(),'iph')]"));
		List <WebElement> sugg = d.findElements(By.xpath("//a[@class='oleBil']"));
		System.out.println("Total Auto Suggestions : "+sugg.size()+"\n");
		
		for (WebElement allWh : sugg) {
			System.out.println(allWh.getText());
			
		}
		Thread.sleep(2000);
		sugg.getLast().click();
		
		//allLinks.get(allLinks.size()-1).click();
		Thread.sleep(2000);
		
		d.close();
	}

}
