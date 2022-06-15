package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag41 {
  @Test(priority =3 )
  public void z() {
	  Reporter.log("Z",true);
  }
  @Test(priority =3 )
  public void f() {
	  Reporter.log("Z",true);
  }
  @Test(priority =1 )
  public void h() {
	  Reporter.log("h",true);
  }
  @Test(priority =0 )
  public void p() {
	  Reporter.log("p",true);
  }
  @Test(priority =2)
  public void s() {
	  Reporter.log("s",true);
  }
}
