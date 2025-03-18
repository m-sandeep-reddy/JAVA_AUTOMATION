package Jan13_15_16_Listboxes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printing_All_Selected_Options_In_Slv {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement slv = d.findElement(By.id("slv"));
		Select s = new Select(slv);
		
		List<WebElement> allOptions = s.getAllSelectedOptions();
		int count = allOptions.size();
		
		/*for (int i = 0; i < count; i++) {
			
			String text = allOptions.get(i).getText();
			System.out.println(text);	
		}*/
		
		for(WebElement we : allOptions)
		{
			System.out.println(we.getText());
		}
	
	}
}
