package Feb13_Using_POM_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	WebElement unTbx;
	WebElement pwTbx;
	WebElement lgBtn;
	
	public Login_Page(WebDriver driver) {
		
		unTbx = driver.findElement(By.id("username"));
		pwTbx = driver.findElement(By.name("pwd"));
		lgBtn = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	public void setLogin(String un,String pwd)
	{
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pwd);
		lgBtn.click();
	}

}
