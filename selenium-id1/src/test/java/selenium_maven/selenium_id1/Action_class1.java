 package selenium_maven.selenium_id1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Dynamic_Launchbrowser;

public class Action_class1 extends Dynamic_Launchbrowser{

	public static void main(String[] args) {
		launch_Browser("Chrome");
		urlhit("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Fresh\"]"));
		act.moveToElement(fashion).perform();

		WebElement minitv = driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]"));
		act.moveToElement(minitv).contextClick().build().perform();
		
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		act.moveToElement(search).click().sendKeys("tshirt").build().perform();
		act.doubleClick(search).build().perform();
		
	}

}
