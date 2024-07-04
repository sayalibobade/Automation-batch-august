package properties_fetch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Executable_propertifile extends properties_file_fetch {
  @Test
  public void f() throws Throwable {
	  property_file();
	  System.out.println(p.getProperty("chromebrowser"));
	  System.out.println(p.getProperty("facebookurl"));
	  
	  System.out.println(p2.getProperty("useremail"));
	  open_browser("chromebrowser");
	  navigate_urlhit("facebookurl");
	  
	 // locate signin
	 driver.findElement(By.cssSelector(p3.getProperty("emailbox_css")))
	  .sendKeys(p2.getProperty("useremail"));
	  
	 // locate password
	  driver.findElement(By.cssSelector(p3.getProperty("password_css")))
	  .sendKeys(p2.getProperty("password"));
	  
	 
  }
}
