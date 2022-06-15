package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag1 {
  @Test(description = "This method perform login opertion")
  public void login () {
	  Reporter.log("Login is performed",true);
  }
}
