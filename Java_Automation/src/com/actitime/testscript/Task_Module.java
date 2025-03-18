package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

public class Task_Module extends Base_Class {
	
	@Test(groups= {"SmokeTest","RegressionTest","kk"})
	public void createTask()
	{
		Reporter.log("Create Task",true);
	}
	
	@Test(groups= "RegressionTest")
	public void modifyTask()
	{
		Reporter.log("Modify Task",true);
	}
	
	@Test(groups= "RegressionTest")
	public void deleteTask()
	{
		Reporter.log("Delete Task",true);
	}
}
