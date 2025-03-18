package javaSelenium;

import org.openqa.selenium.WebDriver;

public class P6 {
	
		static void gene(WebDriver e)
		{
			e.get("https://www.youtube.com/");
			String title = e.getTitle();
			System.out.println(title);
			e.close();
		}
}
