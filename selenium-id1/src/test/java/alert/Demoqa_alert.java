package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;

public class Demoqa_alert extends Dynamic_Launchbrowser {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		Screenshot_way1("chrome_launch");
		urlhit("https://demoqa.com/alerts");
		Screenshot_way1("demoqa_urlhit");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Screenshot_way1("Scroll down");
//simple alert
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
//Thread.sleep(2000);
		//Screenshot_way1("simple alert popup");
		Alert simplealert = driver.switchTo().alert();
		// Screenshot_way1("simple alert popup");
		System.out.println(simplealert.getText());
		simplealert.accept();
//simple alert 5 sec
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		Alert simplealert5sec = driver.switchTo().alert();
		System.out.println(simplealert5sec.getText());
		simplealert5sec.accept();
//confirm alert
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();

		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		//confirmalert.accept();
		//WebElement confirm_oktext = driver.findElement(By.xpath("//span[@id=\"confirmResult\"]"));
		//System.out.println(confirm_oktext.getText());
		confirmalert.dismiss();
		WebElement confirm_ocanceltext = driver.findElement(By.xpath("//span[text()=\"Cancel\"]"));
		System.out.println(confirm_ocanceltext.getText());
		
		//prompt alert
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
	  promptalert.sendKeys("sayali");
	  promptalert.accept();
	  WebElement prompt_msg = driver.findElement(By.xpath("//span[text()=\"You entered \"]"));
		System.out.println(prompt_msg.getText());
	}

}
