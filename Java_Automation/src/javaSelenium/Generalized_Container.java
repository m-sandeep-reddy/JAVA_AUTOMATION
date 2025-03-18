package javaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Generalized_Container {
	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		WebDriver d2 = new EdgeDriver();
		
		P6.gene(d1);
		P6.gene(d2);
		
	}

}
