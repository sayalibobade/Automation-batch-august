package report;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Report_dynamic;

public class Report_flipcart extends Report_dynamic {

	public static void main(String[] args) throws Throwable  {
		launch_Browser("Chrome");
		Screenshot_way2("launch browser");
		urlhit("https://www.flipkart.com/");
		Screenshot_way2("flipcart_application_hit");
		
		 WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));//sendKeys("tshirt");
		 search.sendKeys("tshirt");
		report("flipcart_tab", "flipcart_report", "flipcart_application");
		
		reporttest("flipcart_search", "sendkeys_tshirt");
		getscreenshot_report("sendkeys_screenshot");
		
		Actions act=new Actions(driver);
		act.moveToElement(search);
		act.keyDown(Keys.ENTER).build().perform();
		
		reporttest("click on tshirt", "tshirt_search");
		getscreenshot_report("tshirt_search");

	}

}
