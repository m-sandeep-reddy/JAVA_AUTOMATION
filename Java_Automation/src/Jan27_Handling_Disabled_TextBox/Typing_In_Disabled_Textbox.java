package Jan27_Handling_Disabled_TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Typing_In_Disabled_Textbox {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/SANDEEP/Documents/java%20html%20codes/Disabled.html");
		
		d.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r = (RemoteWebDriver) d;
		r.executeScript("document.getElementById('d2').value = 'manager'");
		
		/*
		document.getElementById('d2').value = ' '
		for deleting text in disabled textbox
		document.getElementById('d2').click()
		for clicking the element
		*/
	}

}
