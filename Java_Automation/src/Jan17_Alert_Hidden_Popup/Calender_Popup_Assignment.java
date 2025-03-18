package Jan17_Alert_Hidden_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Popup_Assignment {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		
		d.findElement(By.id("policynumber")).sendKeys("123");
		d.findElement(By.id("dob")).click();
		WebElement month = d.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s = new Select(month);
		s.selectByIndex(4);
		
		WebElement year = d.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("2001");
		
		d.findElement(By.xpath("//a[@data-date='5']")).click();
		
		d.findElement(By.id("alternative_number")).sendKeys("9845098450");
		
		d.findElement(By.id("renew_policy_submit")).click();
		
		boolean b = d.findElement(By.id("policynumberError")).isDisplayed();
		if(b)
			System.out.println("'Please enter valid Policy No.' is displayed");
		else
			System.out.println("'Please enter valid Policy No.' is not displayed");
		
		d.close();
	}

}
