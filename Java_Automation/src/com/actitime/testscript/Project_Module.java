package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

public class Project_Module extends Base_Class {
	
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void createProject()
	{
		Reporter.log("Create Project",true);
	}
	
	@Test(groups= "RegressionTest")
	public void modifyProject()
	{
		Reporter.log("Modify Project",true);
	}
	
	@Test(groups= "RegressionTest")
	public void deleteProject()
	{
		Reporter.log("Delete Project",true);
	}
}
