package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;

public class Automate_Alert extends Dynamic_Launchbrowser {



	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		urlhit("https://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);
		Screenshot_way2("simple alert popup");
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
	
		simplealert.accept();
		
		
		//confirmation alert
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		  Alert confiralert = driver.switchTo().alert();
		System.out.println(confiralert.getText());
		  confiralert.accept();
WebElement msg = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
System.out.println(msg.getText());
	}

}
