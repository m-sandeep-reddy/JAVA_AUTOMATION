package Jan13_15_16_Listboxes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Alphabetical_Options_Mtr_Listbox {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		
		List<WebElement> allOp = s.getOptions();
		TreeSet ts = new TreeSet();			//Without dupliicates
		//ArrayList a = new ArrayList(); //with duplicates
		
		for(WebElement we : allOp)
		{
			ts.add(we.getText());
			//a.add(we.getText());
		}
		System.out.println("Alphabetical order of optins are : \n");
		for(Object t:ts)
		{
			System.out.println(t);
		}
		d.close();
	}

}
