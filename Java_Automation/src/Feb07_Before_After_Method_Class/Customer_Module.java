package Feb07_Before_After_Method_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customer_Module {
	
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
	
	@Test(invocationCount = 0)
	public void createCustomer()
	{
		Reporter.log("Create Custoemer",true);
		Assert.fail();
	}
	
	@Test(priority = 1 ,dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("Modify Custoemer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("Delete Custoemer",true);
	}
}
