package Feb13_Using_POM_Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Of_Login_Page {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Login_Page l = new Login_Page (driver);
		
		l.setLogin("admin1","manager1");
		Thread.sleep(3000);
		l.setLogin("admin","manager");
	}

}