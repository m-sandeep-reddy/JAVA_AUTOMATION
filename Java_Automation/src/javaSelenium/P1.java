package javaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		d.get("https://www.gmail.com/");
		Thread.sleep(2000);
		d.close();
	}

}
