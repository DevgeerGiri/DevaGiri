package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Flag6 {

	@Test
	public void login()
	{
		Reporter.log("login",true);

	}

	@Test(dependsOnMethods = "login")
	public void createUser()
	{
		Assert.fail();
		Reporter.log("Create user",true);

	}

	@Test(dependsOnMethods = "createUser",alwaysRun = true)
	public void logout()
	{

		Reporter.log("logout",true);
	}


}
