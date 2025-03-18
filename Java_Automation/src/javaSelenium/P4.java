package javaSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) throws InterruptedException {
			
		ChromeDriver d = new ChromeDriver();
		d.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		Thread.sleep(2000);
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.close();
		
	}

}
