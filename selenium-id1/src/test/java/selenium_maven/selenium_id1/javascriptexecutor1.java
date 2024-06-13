package selenium_maven.selenium_id1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;

public class javascriptexecutor1 extends Dynamic_Launchbrowser {

	private static javascriptexecutor1 javascriptExecutor;

	public static void main(String[] args) throws Throwable {
		launch_Browser("Firefox");
		Screenshot_way2("browerLaunch");
		urlhit("https://www.amazon.in/");
		Screenshot_way2("Amazon Application Open");
		driver.findElement(By.xpath("//div[@class=\"nav-line-1-container\"]")).click();
		Screenshot_way2("Amazon sign in");
		WebElement email = driver.findElement(By.cssSelector("input#ap_email"));
		email.click();
		email.sendKeys("sayli22bobade@gmail.com");
		Screenshot_way2("emailId enter");
		driver.findElement(By.cssSelector("input#continue")).click();
		Screenshot_way2("click on continue");
		WebElement password = driver.findElement(By.cssSelector("input#ap_password"));
		password.click();
		password.sendKeys("sumit123");
		Screenshot_way2("enter password");

		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		Screenshot_way2("click on forgot password");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
		Screenshot_way2("back on previous page");

		js.executeScript("window.history.back()");
		js.executeScript("window.history.back()");

		js.executeScript("window.history.go(0)");
		Screenshot_way2("refresh home page");

		js.executeScript("window.scrollBy(0,2000) ");
		Screenshot_way2("Scrollby");

		js.executeScript("window.scrollBy(0,document.body.scrollHeight) ");
		Screenshot_way2("footer");

		js.executeScript("window.scrollBy(0,-3000)  ");
		Screenshot_way2("down to top");

		driver.navigate().forward();
		//js.executeScript("window.history.forword() ");
		Screenshot_way2("next page ");

		driver.close();

	}

}
