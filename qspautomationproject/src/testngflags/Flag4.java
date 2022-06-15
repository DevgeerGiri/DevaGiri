package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void c() {
	  Reporter.log("c",true);
  }
  @Test
  public void a() {
	  Reporter.log("a",true);
  }
  @Test
  public void f() {
	  Reporter.log("f",true);
  }
  @Test
  public void p() {
	  Reporter.log("p",true);
  }
  @Test
  public void s() {
	  Reporter.log("s",true);
  }
}
