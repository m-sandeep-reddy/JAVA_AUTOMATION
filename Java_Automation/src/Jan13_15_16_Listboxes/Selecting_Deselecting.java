package Jan13_15_16_Listboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Deselecting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		s.selectByValue("v");
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByVisibleText("dosa");
		Thread.sleep(2000);
		
		//s.deselectAll();
		String dd = s.getWrappedElement().getText();
		System.out.println(dd);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("v");
		Thread.sleep(2000);
		s.deselectByVisibleText("dosa");
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		d.close();
		
		
	}

}
