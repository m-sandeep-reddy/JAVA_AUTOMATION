package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_Class_Using_Property_Data{
	
		WebDriver d;
		File_Lib f = new File_Lib();
		
		@BeforeTest(groups= {"SmokeTest","RegressionTest"})
		public void openBrowser() throws IOException
		{
			Reporter.log("Open Browser",true);
			d = new ChromeDriver();
			d.get(f.getPropertyData("url"));
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}

		@BeforeMethod(groups= {"SmokeTest","RegressionTest"})
		public void login() throws InterruptedException, IOException
		{
			Reporter.log("login",true);
			d.findElement(By.name("username")).sendKeys(f.getPropertyData("username"));
			Thread.sleep(1000);
			d.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
			Thread.sleep(1000);
			d.findElement(By.linkText("Login")).click();
			Thread.sleep(1000);
		}
		
		@AfterMethod(groups= {"SmokeTest","RegressionTest"})
		public void logout() throws InterruptedException
		{
			Reporter.log("logout",true);
			Thread.sleep(2000);
			d.findElement(By.id("logoutLink")).click();
	
		}
		
		
		@AfterTest(groups= {"SmokeTest","RegressionTest"})
		public void closeBrowser() throws InterruptedException
		{
			Reporter.log("Close Browser",true);
			d.close();
			
		}

}
