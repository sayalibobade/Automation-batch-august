package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Dynamic_Launchbrowser;

public class Keyboard_Action extends Dynamic_Launchbrowser {
public static void main(String[] args) {
	launch_Browser("chrome");
	urlhit("https://www.shaadi.com/");
	Actions act=new Actions(driver);
	
WebElement login = driver.findElement(By.xpath("//a[@class=\"common_login__2FLV3 css-ny049c\"]"));
act.moveToElement(login).click().build().perform();

WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
act.moveToElement(email).click().sendKeys("sayli22bobade@gmail.com").build().perform();
act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
act.keyDown(Keys.TAB).perform();
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

act.keyDown(Keys.PAGE_DOWN).perform();
act.keyDown(Keys.PAGE_UP).build().perform();


}
	

}
