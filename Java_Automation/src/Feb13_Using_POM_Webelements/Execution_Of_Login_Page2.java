package Feb13_Using_POM_Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Of_Login_Page2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Login_Page2 l = new Login_Page2 (driver);
		
		l.setUser("admin");
		l.setPwd("manager");
		l.setLogin();
	}

}