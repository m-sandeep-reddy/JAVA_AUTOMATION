package Jan25_CopyPassteInNestedFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		d.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		String mail_id = d.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		
		WebElement we1 =d.findElement(By.tagName("iframe"));
		d.switchTo().frame(we1);
		
		//d.switchTo().frame(0);
		d.findElement(By.id("email")).sendKeys(mail_id);
		
		d.switchTo().parentFrame();
		String pwd = d.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		
		WebElement we2 =d.findElement(By.tagName("iframe"));
		d.switchTo().frame(we2);
		
		//d.switchTo().frame(0);
		d.findElement(By.id("password")).sendKeys(pwd);
		
		d.switchTo().parentFrame();
		String confPwd = d.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		
		WebElement we3 =d.findElement(By.tagName("iframe"));
		d.switchTo().frame(we3);
		
		//d.switchTo().frame(0);
		d.findElement(By.id("confirm-password")).sendKeys(confPwd);
		d.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
		
		d.switchTo().defaultContent(); 
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean res = d.findElement(By.xpath("//div[text()='Sign up successful!']")).isDisplayed();
		
		if(res)
			System.out.println("Sign is successful");
		else
			System.out.println("Sign is not successful");
		
		Thread.sleep(1000);
		d.quit();
		
		
		/*WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		d.manage().window().maximize();
		Thread.sleep(15000);
		//d.switchTo().frame(0);
		//WebElement we =d.findElement(By.tagName("iframe"));
		//d.switchTo().frame(we)
		d.switchTo().frame(0);
		d.findElement(By.id("username")).sendKeys("hii");
		*/
	}

}
