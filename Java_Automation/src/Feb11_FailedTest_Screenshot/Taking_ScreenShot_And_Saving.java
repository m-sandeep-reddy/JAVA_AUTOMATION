package Feb11_FailedTest_Screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Taking_ScreenShot_And_Saving {
	
	@Test
	public void screeshot() throws AWTException, IOException
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		TakesScreenshot t = (TakesScreenshot) d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ss.png");
		FileUtils.copyFile(src, dest);
		d.quit();
		
	}

}


/*
Robot r = new Robot();
r.keyPress(KeyEvent.VK_WINDOWS);
r.keyPress(KeyEvent.VK_PRINTSCREEN);
r.keyRelease(KeyEvent.VK_WINDOWS);

File f = new File("./screenshot/ss.png");
f.createNewFile();
*/