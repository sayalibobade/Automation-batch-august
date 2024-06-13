package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Dynamic_Launchbrowser;

public class Action_drag$drop extends Dynamic_Launchbrowser {

	public static void main(String[] args) {
		launch_Browser("Chrome");
		urlhit("https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
		WebElement frame = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		//act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		
		
		driver.switchTo().defaultContent();
		WebElement selectable = driver.findElement(By.xpath("//a[text()=\"Selectable\"]"));
		
		act.moveToElement(selectable).click().build().perform();
		
		
	}

}
