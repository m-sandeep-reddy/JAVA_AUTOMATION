package Jan13_15_16_Listboxes;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Removing_Duplicates_In_Listbox {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		
		List<WebElement> allOp = s.getOptions();
		LinkedHashSet ts = new LinkedHashSet();		//no alphabetic order
		TreeSet tss = new TreeSet();				//alphabetic order
		
		for(WebElement we : allOp)
		{
			ts.add(we.getText());
		}
		System.out.println("After removing duplicates options are : \n");
		for(Object t:ts)
		{
			System.out.println(t);
		}
		d.close();
	}

}
