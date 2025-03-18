package Jan23_HandlinTabs_MouseActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Of_Vtiger_Using_Double_Click {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.vtiger.com/");
		
		WebElement target = d.findElement(By.xpath("(//a[contains(.,'Login')])[2]"));
		
		Actions a = new Actions(d);
		a.doubleClick(target).perform();
			
		if(d.getTitle().equals("Login - Vtiger"))
				System.out.println("Vtiger Login page is displayed");
		else
			System.out.println("Vtiger Login page is not displayed");
		d.quit();
	}

}
