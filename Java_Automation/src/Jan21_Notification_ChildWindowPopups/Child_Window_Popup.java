package Jan21_Notification_ChildWindowPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Popup {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		String ss = d.getWindowHandle();
		System.out.println(ss);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		
		d.quit();
	}

}
