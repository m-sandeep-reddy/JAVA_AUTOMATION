package Feb06_Soft_Hard_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifying_Title_Using_Soft_Assert {
	
	@Test
	public void verifyTitle()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		String aTitle = "Google";
		String eTitle = d.getTitle();
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(aTitle,eTitle);
		d.quit();
		s.assertAll();
		//System.out.println(eTitle);
	}
	

}
