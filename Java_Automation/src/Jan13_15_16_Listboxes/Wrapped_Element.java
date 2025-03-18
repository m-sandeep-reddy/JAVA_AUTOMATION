package Jan13_15_16_Listboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrapped_Element {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		
		String all = s.getWrappedElement().getText();
		System.out.println(all);
		d.quit();
	}

}
