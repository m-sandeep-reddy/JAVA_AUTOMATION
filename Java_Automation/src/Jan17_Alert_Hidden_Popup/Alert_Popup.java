package Jan17_Alert_Hidden_Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(2000);
		
		//d.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		//d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//d.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		//d.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = d.switchTo().alert();
		//a.accept();
		
		/*
		System.out.println(a.getText());
		Thread.sleep(1000);
		//a.accept();
		a.sendKeys("sandeep");
		a.accept();
		Thread.sleep(1000);
		System.out.println(d.findElement(By.xpath("//p[@id='demo1']")).getText());
		Thread.sleep(1000);
		//System.out.println(a.getText());
		*/
		
		d.close();
		
	}

}
