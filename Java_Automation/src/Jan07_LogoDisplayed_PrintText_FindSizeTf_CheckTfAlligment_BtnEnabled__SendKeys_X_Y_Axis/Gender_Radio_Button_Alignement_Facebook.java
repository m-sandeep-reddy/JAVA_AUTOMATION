package Jan07_LogoDisplayed_PrintText_FindSizeTf_CheckTfAlligment_BtnEnabled__SendKeys_X_Y_Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gender_Radio_Button_Alignement_Facebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		int femaleY  = d.findElement(By.xpath("//input[@value=1]")).getLocation().y;
		int maleY = d.findElement(By.xpath("//input[@value=2]")).getLocation().getY();
		int customY = d.findElement(By.xpath("//input[@value=-1]")).getRect().y;
		
		if (femaleY ==  maleY && maleY== customY )
			System.out.println("All radio buttons are properly alligned");
		else
			System.out.println("\"All radio buttons are not properly alligned");
		d.close();
		
	}

}
