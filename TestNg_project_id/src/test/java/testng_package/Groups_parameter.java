package testng_package;

import org.testng.annotations.Test;

public class Groups_parameter {
	//h:5;m:5;l:5
  @Test(groups = {"High"})
  public void browser_launch() {
	  System.out.println("launch_browser");
  }
  @Test(groups = {"Medium"})
  public void urlhit() {
	  System.out.println("urlhit");
  }
  @Test(groups = {"Medium"})
  public void search_locate() {
	  System.out.println("search_locate");
  }
  @Test(groups = {"Medium"})
  public void search_sendkeys() {
	  System.out.println("search_sendkeys");
  }
  @Test(groups = {"High"})
  public void select_option() {
	  System.out.println("select_option");
  }
  @Test(groups = {"High"})
  public void click_search() {
	  System.out.println("click_search");
  }
  
  @Test(groups = {"Low"})
  public void cosmetic_error() {
	  System.out.println("cosmetic_error");
  }
  
  
}
