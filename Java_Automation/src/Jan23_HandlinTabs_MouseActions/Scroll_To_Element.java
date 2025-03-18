package Jan23_HandlinTabs_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_To_Element {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		
		WebElement target = d.findElement(By.xpath("//h2[.='Video']"));
		
		Actions a = new Actions(d);

		a.scrollToElement(target).perform();
		
		d.quit();
	}

}
