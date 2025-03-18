package Feb06_Soft_Hard_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verifying_Title_Using_If_Else {
	
	@Test
	public void verifyTitle()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		String aTitle = "Soogle";
		String eTitle = d.getTitle();
		
		if(aTitle.equals(eTitle))
			Reporter.log("Title is matchig",true);
		else
			Reporter.log("Title is not matching",true);
		d.quit();
		
	}

}
