package Feb06_Soft_Hard_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verifying_Title_Using_Assert_Equals {
	
	@Test
	public void verifyTitle()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		String aTitle = "Google";
		String eTitle = d.getTitle();
				
		Assert.assertEquals(aTitle,eTitle);
		d.quit();

	}
	

}
