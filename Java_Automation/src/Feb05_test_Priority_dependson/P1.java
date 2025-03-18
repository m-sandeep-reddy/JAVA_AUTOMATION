package Feb05_test_Priority_dependson;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class P1 {
	
	
	@Test(priority = -1)
	public void aemo() {
		Reporter.log("demo",true);
	}
	
	@Test(priority = -2)
	public void bogo() {
		Reporter.log("logo",true);
	}
	
	@Test(priority = -3)
	public void cutton() {
		Reporter.log("button",true);
	}

}
