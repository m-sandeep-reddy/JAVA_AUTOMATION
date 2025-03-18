package Jan06_RemovingText_CheckingBoxIsSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removing_Text_Present_In_Static_Webpage {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/"
				+ "java%20html%20codes/Button.html");
		
		d.findElement(By.xpath(("//input[@type = 'text' "
				+ "and @value = 'A']"))).clear();
		
		boolean res = d.findElement(By.xpath(
				"(//input[@type ='checkbox' and 'checked'])[1]")).isSelected();
		System.out.println(res);
		Thread.sleep(2000);
		d.close();
	}
	
/*
 1) xpath for status of programming type of work

--> //a[.='programming']/../../td[2]

2) xpath for set by default link for consulting type of work

--> //a[.='consulting']/../../td[4]

3) xpath for stable version of .NET/C# language present in the download page of selenium webpage

--> //p[.='.NET/C#']/../p[2]/a

4) xpath for changelog for python language

--> //p[.='Ruby']/../p[3]/a

5) xpath for API docs link for python language

--> //p[.='Python']/../p[4]/a

6) xpath for 1st Roadstar price present in myntra website

--> (//h3[.='Roadster'])[1]/../div/span[1]/span[1]

9) xpath for 1st iPhone 16 max price in amazon

--> (//span[contains(.,'iPhone 16 Pro Max')])[5]/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]

or 
--> (//span[@class='a-price-whole'])[5]

10) xpath for 1st boult smart price present in flipkart

--> (//a[contains(.,'Boult')])[1]/../a[3]/div/div[1]
*/

}
