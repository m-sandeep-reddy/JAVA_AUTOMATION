package Feb13_Using_POM_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page2 {
	
	WebElement unTbx;
	WebElement pwTbx;
	WebElement lgBtn;
	
	public Login_Page2(WebDriver driver) {
		
		unTbx = driver.findElement(By.id("username"));
		pwTbx = driver.findElement(By.name("pwd"));
		lgBtn = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	public void setUser(String un)
	{
		unTbx.sendKeys(un);
	}
	
	public void setPwd(String pw)
	{
		pwTbx.sendKeys(pw);
	}
	
	public void setLogin()
	{
		lgBtn.click();;
	}

}
