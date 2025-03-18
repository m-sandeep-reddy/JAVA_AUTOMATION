package Jan17_Alert_Hidden_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Assignment {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		d.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert a = d.switchTo().alert();
		a.dismiss();
		WebElement we = d.findElement(By.xpath("//p[@id='demo']"));
		if(we.isDisplayed())
			System.out.println('"'+we.getText()+'"'+" is displayed");
		else
			System.out.println(we.getText()+" is not displayed");
		d.close();
	}

}
