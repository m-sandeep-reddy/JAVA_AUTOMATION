package Dec30_Delcookies_AutoSugg__CheckUrl_HTMLPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_HTML_SourceCode {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.seleniumhq.org/");
		String htmlCode = d.getPageSource();
		System.out.println(htmlCode);
		d.close();
	}

}
