package Jan13_15_16_Listboxes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printing_Duplictes_In_ListBox {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		
		List<WebElement> allOp = s.getOptions();
		LinkedHashSet ts = new LinkedHashSet();
		HashSet tss = new HashSet();
		
		System.out.print("Duplicte options are : ");
		for(WebElement we : allOp)
		{
			if(!(tss.add(we.getText())))
				System.out.print(we.getText());
		}
		/*for(Object t:ts)
		{
			System.out.println(t);
		}*/
		d.close();
	}

}
