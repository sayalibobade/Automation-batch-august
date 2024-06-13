package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;

public class Initvar_calender extends Dynamic_Launchbrowser {

	public static void main(String[] args) {
		launch_Browser("chrome");
		urlhit("https://www.railyatri.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,200)");

WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
calender.click();
int date=8;
while(true) {
 String month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
System.out.println(month_year);
if(!(month_year.equalsIgnoreCase("August 2024"))){
	driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
}else {

	break;
}

}
driver.findElement(By.xpath("//td[text()="+date+"]")).click();
}	
	
}


