package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Dynamic_Launchbrowser;

public class irctc_calender extends Dynamic_Launchbrowser {
	public static void main(String[] args) {
		launch_Browser("chrome");
		urlhit("https://www.irctc.co.in/");
		WebElement calender = driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]"));
		calender.click();

		// String Month_year =
		// driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title
		// ng-tns-c58-10\"]")).getText();
		// System.out.println("the selected month_year is: "+Month_year);
		// driver.findElement(By.xpath("//a[text()=\"22\"]")).click();
		int date = 22;
		while (true) {
			//String month_year = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title ng-tns-c58-10\"]")).getText();
			//if(!(month_year.equalsIgnoreCase("August 2024"))){
			String Month_year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month ng-tns-c58-10 ng-star-inserted\"]")).getText();
		System.out.println("the selected month_year is: " + Month_year);
			if (!(Month_year.equalsIgnoreCase("August"))) {
				driver.findElement(By.xpath("//span[@class=\"ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10\"]")).click();
			} else {
				//driver.findElement(By.xpath("//a[text()=\"22\"]")).click();
				break;
			}

		}
		driver.findElement(By.xpath("//a[text()=" + date + "]")).click();
		System.out.println(calender.getAttribute("value"));
	}
}
