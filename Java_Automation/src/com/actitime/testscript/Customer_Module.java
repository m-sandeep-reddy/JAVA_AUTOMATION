package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

public class Customer_Module extends Base_Class {
	
	@Test(groups= {"SmokeTest","RegressionTest","kk"})
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
	}
	
	@Test(groups= "RegressionTest")
	public void modifyCustomer()
	{
		Reporter.log("Modify Custemer",true);
	}
	
	@Test(groups= "RegressionTest")
	public void deleteCustomer()
	{
		Reporter.log("Delete Custemer",true);
	}
}
