package Jan18_FileUploadpopup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		File f = new File("./data/SANDEEP_RESUME_JAVA.pdf");
		String abpath = f.getAbsolutePath();
		
		d.findElement(By.id("fileInput")).sendKeys(abpath);
		
		//System.out.println(abpath);;
		//System.out.println(f.getAbsoluteFile());
		//d.findElement(By.id("fileInput")).sendKeys(abpath);
		
		d.quit();
	}

}
