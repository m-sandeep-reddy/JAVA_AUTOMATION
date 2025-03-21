package Feb07_Before_After_Method_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customer_Module2 {
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
	}
	
	@Test(priority =1 ,invocationCount = 2)
	public void editCustomer()
	{
		//Assert.fail();
		Reporter.log("Edit Custoemer",true);
		//Assert.fail();
	}
	
	@Test
	public void registerCustomer()
	{
		Reporter.log("Register Custoemer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("Delete Custoemer",true);
	}
}
