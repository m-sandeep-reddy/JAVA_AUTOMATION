package Feb11_FailedTest_Screenshot;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

@Listeners(Feb11_FailedTest_Screenshot.Listener_Implemenetaion.class)
public class Listener_Failed_Test extends Base_Class{
	
	@Test
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
		Assert.fail();
	}

}
