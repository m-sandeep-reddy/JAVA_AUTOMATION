package Jan23_HandlinTabs_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Or_Drop_Down_Menu {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.vtiger.com/");
		
		WebElement target = d.findElement(By.partialLinkText("Company"));
		
		Actions a = new Actions(d);
		
		a.moveToElement(target).perform();
		
		d.findElement(By.partialLinkText("Contact Us")).click();
		String phno = d.findElement(By.xpath("//p[contains(.,' Bengaluru, India')]/../p[2]")).getText();
		
		System.out.println(phno);
		
		d.quit();
	}

}
