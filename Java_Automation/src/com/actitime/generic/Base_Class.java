package com.actitime.generic;

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

public class Base_Class{
	
		public static WebDriver d;
		
		@BeforeTest(groups= {"SmokeTest","RegressionTest"})
		public void openBrowser()
		{
			Reporter.log("Open Browser",true);
			d = new ChromeDriver();
			d.get("http://localhost/login.do");
			
		}

		@BeforeMethod(groups= {"SmokeTest","RegressionTest"})
		public void login() throws InterruptedException
		{
			Reporter.log("login",true);
			d.findElement(By.name("username")).sendKeys("admin");
			//Thread.sleep(500);
			d.findElement(By.name("pwd")).sendKeys("manager");
			//Thread.sleep(1000);
			d.findElement(By.linkText("Login")).click();
			//Thread.sleep(1000);
		}
		
		@AfterMethod(groups= {"SmokeTest","RegressionTest"})
		public void logout() throws InterruptedException
		{
			Reporter.log("logout",true);
			//Thread.sleep(2000);
			d.findElement(By.id("logoutLink")).click();
	
		}
		
		
		@AfterTest(groups= {"SmokeTest","RegressionTest"})
		public void closeBrowser()
		{
			Reporter.log("Close Browser",true);
			d.close();
			
		}

}
