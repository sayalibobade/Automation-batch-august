package testng_package;

import org.testng.annotations.Test;

public class DependsonMethod {
  @Test
  public void launchBrowser() {
	  System.out.println("launchbrowser");
  }
  @Test(dependsOnMethods = "launchBrowser")
  public void hiturl() {
	  System.out.println("hiturl");
  }
  @Test(dependsOnMethods = "hiturl")
  public void webelement() {
	  System.out.println("webelement");
  }
}
