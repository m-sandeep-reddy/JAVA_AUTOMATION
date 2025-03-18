package Jan09_FindElements_AutoSuggestions;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_Url_From_The_User {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url of the website");
		String url = sc.next();
		WebDriver d = new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
		d.close();
		
	}

}
