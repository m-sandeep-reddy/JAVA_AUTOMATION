package Jan10_AutoSuggestionsLinksclicking_Products_Prices_HeadingsOfBBC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Search_Results_In_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.findElement(By.className("Pke_EE")).sendKeys("iphone");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> products = d.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> prices = d.findElements(By.xpath("//div[@class='KzDlHZ']/../../div[2]/div[1]/div[1]/div[@class='Nx9bqj _4b5DiR']"));
		int a = products.size();
		int b = prices.size();
		System.out.println("no.of products : "+ a);
		for (int i = 0; i < a; i++) {
			String name = products.get(i).getText();
			String price = prices.get(i).getText();
			System.out.println(i+1+") "+name+" ==> "+price);
			
		}
		d.close();
	}

}
