package Jan11_Wait_Statments;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.5movierulz.vu/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("search_term")).sendKeys("robo");
		d.findElement(By.id("searchsubmit")).click();
		//Thread.sleep(2000);
		System.out.println(d.findElement(By.xpath("//img[@alt='T.I.M.']")).isEnabled());
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
	}

}
