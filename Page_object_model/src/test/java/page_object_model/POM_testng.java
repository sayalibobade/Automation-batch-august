package page_object_model;

import org.testng.annotations.Test;

import dynamic_code.Dynamic_Launchbrowser;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class POM_testng extends Dynamic_Launchbrowser{
  @Test(priority=1)
  public void verify_account() {
	  Account_signin ac=new Account_signin(driver);
	  ac.account();
  }
  @Test(priority=2)
  public void personal_information_verify() {
	  Personal_info pi=new Personal_info(driver);
	  pi.perosnal_info();
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  launch_Browser("chrome");
	  urlhit("http://www.automationpractice.pl/");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
