package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
  @Test(groups ="A" )
  public void a1() {
	  Reporter.log("a1");
  }
  
  @Test(groups ="A" )
  public void a2() {
	  Reporter.log("a2");
  }
  
  @Test(groups ="C" )
  public void c1() {
	  Reporter.log("c1");
  }
  
  @Test(groups ="B" )
  public void b2() {
	  Reporter.log("b2");
  }
  
  @Test(groups ="A" )
  public void a3() {
	  Reporter.log("a3");
  }
  
  @Test(groups ="C" )
  public void c2() {
	  Reporter.log("c2");
  }
  
  @Test(groups ="B" )
  public void b1() {
	  Reporter.log("b1");
  }
}
