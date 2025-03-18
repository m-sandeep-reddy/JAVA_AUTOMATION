package Jan13_15_16_Listboxes;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searching_Option_In_Listbox {
public static void main(String[] args) throws InterruptedException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option to be searched");
		String option = sc.next();
		
		WebDriver d = new ChromeDriver();
		d.get("C:\\Users\\SANDEEP\\Documents\\java html codes\\multiple list box.html");
		
		WebElement mtr = d.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> allOp = s.getOptions();
		int count = 0;
		
		for(WebElement we : allOp)
		{
			if(option.equalsIgnoreCase(we.getText()))
				count++;
		}
		if(count == 0)
			System.out.println(option+" is not present in List");
		else if(count == 1)
			System.out.println(option+" is present in List without duplicate");
		else if(count >1)
			System.out.println(option+" is  present in List with duplicates");
		d.close();
	}

}
