package testng_package;

import org.testng.annotations.Test;

public class Invocation_count {
  @Test(invocationCount = 2,priority = 1)
  public void name() {
	  System.out.println("name");
  }
  @Test(invocationCount = 4,priority = 2,enabled = false)
  public void city() {
	  System.out.println("city");
  }
  @Test(priority = 3,description = "country belongs to the person from name method")
  public void country() {
	  System.out.println("country");
  }
}
