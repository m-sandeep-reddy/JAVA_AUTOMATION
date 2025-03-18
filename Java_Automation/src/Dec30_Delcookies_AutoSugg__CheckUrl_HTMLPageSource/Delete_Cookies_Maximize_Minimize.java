package Dec30_Delcookies_AutoSugg__CheckUrl_HTMLPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Cookies_Maximize_Minimize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.5movierulz.rip/");
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.manage().window().minimize();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		d.close();
	}

}
