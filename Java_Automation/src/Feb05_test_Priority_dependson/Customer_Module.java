package Feb05_test_Priority_dependson;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_Module {
	
	@Test(priority = 1)
	public void createCustomer()
	{
		Reporter.log("Create Custoemer",true);
	}
	
	@Test(priority = 1 ,dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("Modify Custoemer",true);
	}
	
	@Test(priority = 1 ,dependsOnMethods = "modifyCustomer")
	public void deleteCustomer()
	{
		Reporter.log("Delete Custoemer",true);
	}
}
