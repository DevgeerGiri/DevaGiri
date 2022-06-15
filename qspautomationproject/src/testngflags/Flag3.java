package testngflags;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Flag3 {
  @Test(invocationCount =10)
  public void login() {
	  Reporter.log("inconsistent",true);
  }
 

}
