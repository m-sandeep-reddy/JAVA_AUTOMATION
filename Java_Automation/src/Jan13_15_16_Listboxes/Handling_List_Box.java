package Jan13_15_16_Listboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_List_Box {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/r.php?entry_point=login");
		Object day = d.findElement(By.xpath("//select[@id='day']"));
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select s1 = new Select((WebElement) day);
		Select s2 = new Select((WebElement) month);
		Select s3 = new Select((WebElement) year);
		s1.selectByIndex(4);
		System.out.println(s1.isMultiple());
		//Thread.sleep(2000);
		//s.selectByVisibleText("2");
		s2.selectByValue("5");
		s3.selectByVisibleText("2001");
		Thread.sleep(2000);
		//s1.selectByContainsVisibleText("J");
		d.close();
	}

}
