package Jan21_Notification_ChildWindowPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Address_Of_Indeed {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F%3Fr%3Dus&tmpl=desktop&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fprofile.indeed.com%2Fwelcome%3Fhl%3Den_IN%26co%3DIN%26from%3Dgnav-homepage%26continue%3Dhttps%253A%252F%252Fonboarding.indeed.com%252Fonboarding%253Fhl%253Den_IN%2526co%253DIN%2526from%253Dgnav-homepage&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess");
		d.manage().window().maximize();
		
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		
		Set<String> allWh = d.getWindowHandles();
		//System.out.println(d.getTitle());
		
		for(String wh : allWh)
		{
			System.out.println(wh);
		}
		
		//System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.quit();
	}

}
