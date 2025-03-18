package Jan04_Finding_Xpaths;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_To_Identify_Status_For_Testing_In_ActiTime {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://localhost/administration/btlist.do");
		String status = d.findElement(By.xpath("//a[.='testing']/../../..//tr[6]/td[2]")).getText();
		System.out.println(status);
		Thread.sleep(2000);
		d.close();
	}

}
