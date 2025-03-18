package Jan17_Alert_Hidden_Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Pop_Up {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.makemytrip.com/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		d.close();
	}

}
