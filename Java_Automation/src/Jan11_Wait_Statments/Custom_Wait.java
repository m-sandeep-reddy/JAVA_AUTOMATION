package Jan11_Wait_Statments;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custom_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
		d.get("http://localhost/login.do");
		
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
		
		int i = 0;
		try {
		while(i<=50)
		{
			Thread.sleep(2000);
			d.findElement(By.id("logoutLink")).click();
			break;
		}}
		catch(NoSuchElementException e)
		{
			i++;
		}
	}

}
