package Feb13_Using_POM_Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Of_Login_Page1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Login_Page1 l = new Login_Page1(driver);
		//driver.navigate().refresh();
		l.setUser("admin");
	}

}
