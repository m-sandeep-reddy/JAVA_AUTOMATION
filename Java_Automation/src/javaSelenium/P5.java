package javaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		//d.get("https://www.youtube.com/");
		//Thread.sleep(2000);
	
		d.navigate().to("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		d.close();
	}

}
