package Jan21_Notification_ChildWindowPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Notification_Popup {
	public static void main(String[] args) {
		
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--disable-notificiations");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yatra.com/");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(option);
		d.get("https://www.yatra.com/");
		
		driver.quit();
		d.quit();
		
	}

}
