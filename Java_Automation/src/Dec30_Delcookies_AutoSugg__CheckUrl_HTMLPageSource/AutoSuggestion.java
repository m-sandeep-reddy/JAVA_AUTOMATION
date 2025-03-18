package Dec30_Delcookies_AutoSugg__CheckUrl_HTMLPageSource;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.google.com/");
		d.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> allSugg = d.findElements(By.xpath("//span[contains(.,'java')]"));
		for(int i=0;i<allSugg.size();i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		d.quit();

	}

}
