package selenium_maven.selenium_id1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Dynamic_Launchbrowser;

public class Action_sliderbar extends Dynamic_Launchbrowser {

	public static void main(String[] args) {
		launch_Browser("chrome");
		urlhit("https://jqueryui.com/slider/");

		Actions act = new Actions(driver);

		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);

		WebElement box = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
	act.dragAndDropBy(box, 300, 0).build().perform();
	act.moveToElement(box).clickAndHold().moveByOffset(-200, 0).release().build().perform();
	
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()=\"Sortable\"]")).click();

	}

}
