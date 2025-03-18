package Jan11_Wait_Statments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(0));
		d.get("http://localhost/login.do");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
		d.findElement(By.xpath("//div[.='REPORTS']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		System.out.println(d.getTitle());
		//System.out.println(condition);
		d.close();
	}

}
