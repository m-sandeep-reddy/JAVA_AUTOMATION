package Jan20_Robot_Authentication_Printpopus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		boolean displayed = d.findElement(By.xpath("//h3[.='Basic Auth']")).isDisplayed();
		if(displayed)
			System.out.println("Login succesfull");
		else
			System.out.println("Invalid Credentials");
		
		d.quit();
	}

}
