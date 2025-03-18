package Jan23_HandlinTabs_MouseActions;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//open actitime,login,click on help and click on about your actitime an
//click on read your actitieme and print all the headings present in the tab
public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("(//div[@class='popup_menu_label'])[3]")).click();
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Read License Agreement']")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		List<WebElement> headings = null;
		
		for(String s : allwh)   	
		{
			driver.switchTo().window(s);
			if(driver.getTitle().equals("actiTIME License Agreement"));		
				headings = driver.findElements(By.xpath("//h2"));
		}
		
		for(WebElement we : headings)			
		{
			System.out.println(we.getText());	
		}
		
		for(String s : allwh)					
		{
			driver.switchTo().window(s);
			driver.close();						
		}
		
	}

}
