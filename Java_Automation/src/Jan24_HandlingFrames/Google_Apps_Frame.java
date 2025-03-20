package Jan24_HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Apps_Frame {
	public static void main(String[] args){
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("app"));
		//switchig using iframe name string
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		//switching using int index
		//WebElement wef = d.findElement(By.xpath("(//iframe)[2]"));
		//switching using webelent (finiding web element using tagname)
		WebElement wef = d.findElement(By.xpath("//iframe[@name='app']"));
		//switching using webelent (finiding web element using xpath)
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wef));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//span[text()='Gmail']")).click();
	}

}
