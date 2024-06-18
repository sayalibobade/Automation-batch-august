package testng_package;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

public class Test_ng_class   {
	
	public static WebDriver driver;
	//public static WebElement search;
	
	
	@BeforeClass
	public void wait1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println("implicit wait for 5 sec");
		
	}
	@BeforeTest
	
	public void win_max() {
		driver.manage().window().maximize();
		System.out.println("maximize window");
	}
	@BeforeSuite   
	public void launch() {
	 driver=new ChromeDriver();
	 System.out.println("chrome browser launch");
	
	}
	
	@BeforeMethod
	public void urlhit() {
		driver.get("https://www.amazon.in");
		System.out.println("url hit");
	}
	
	
	
	//public void launch
  @Test
  public void search() {
	   WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	  search.click();
	  System.out.println("click on search ");
	  
  }
  @Test
  public void sendk() throws Throwable {
	  Thread.sleep(2000);
	  WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	  search.sendKeys("shoes");
	  System.out.println("tshirt search");
  }
  @AfterMethod
  public void aftermeth() {
	  System.out.println("after method");
  }
  @AfterClass
  public void afterclas() {
	  System.out.println("after class");
  }
  @AfterTest
  public void aftertes() {
	  System.out.println("after test");
  }
  @AfterSuite
  public void afterSuit() {
	  System.out.println("after suit");
  }
}
