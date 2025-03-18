package Dec30_Delcookies_AutoSugg__CheckUrl_HTMLPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Old_Url_To_New_Url {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.seleniumhq.org/");
		String url1 = d.getCurrentUrl();
		System.out.println(url1);
		if(url1.equals("https://www.selenium.dev/"))
			System.out.println("old url is navigating to new url succeesfully");
		else
			System.out.println("old url is not navigating to new url");
		d.close();
	}
	

}
