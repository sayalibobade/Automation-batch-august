package dropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;
import selenium_maven.selenium_id1.javascriptexecutor1;

public class Dynamic_dropdown2 extends Dynamic_Launchbrowser{

	public static void main(String[] args)  {
		launch_Browser("Chrome");
		urlhit("https://www.railyatri.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement from_field = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));
		from_field.sendKeys("pun");
		   List<WebElement> from_options = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));
		
		   for(int a=0;a<=from_options.size();a++) {
			   try {
				   if(from_options.get(a).getText().contains("PUNARAKH")) {
					   from_options.get(a).click();
				   }
			} catch (IndexOutOfBoundsException e) {
				
			}
			  
		   }
System.out.println(from_field.getAttribute("value"));
	}

}
