package selenium_maven.selenium_id1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

import dynamic_code.Mock_dynamic;

public class PractiseforMock extends Mock_dynamic {

	public static void main(String[] args) throws IOException {
		browser1("chrome");
		hiturl("https://www.amazon.in/");
		screenshot("hiturlamazon");
		/*WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.in/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getWindowHandle());
//driver.findElement(null);
WebElement search = driver.findElement(By.cssSelector("input#nav-search-submit-button"));

//search.click();
//System.out.println(search.getText());
System.out.println(search.getAttribute("value"));
System.out.println(search.getAttribute("id"));
TakesScreenshot ts=(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File target = new File("./Mock_screenshot/screenhotrefresh.png");
org.openqa.selenium.io.FileHandler.copy(source, target);*/



	}

}
