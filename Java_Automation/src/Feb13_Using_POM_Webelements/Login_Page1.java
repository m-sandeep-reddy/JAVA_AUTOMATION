package Feb13_Using_POM_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page1 {
	
	WebElement unTbx;
	
	public Login_Page1(WebDriver driver) {
		
		unTbx = driver.findElement(By.id("username"));
	}
	
	public void setUser(String un)
	{
		unTbx.sendKeys(un);
	}

}
