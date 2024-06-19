package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Parameter {
  @Test//(priority=3)
  public void f() {
	  System.out.println("u");
  }
  @Test
  public void f1() {
	  System.out.println("e");
  }
  @Test
  public void f2() {
	  System.out.println("o");
  }
  @Test
  public void f3() {
	  System.out.println("i");
  }
  @Test
  public void f4() {
	  System.out.println("a");
  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }

}
