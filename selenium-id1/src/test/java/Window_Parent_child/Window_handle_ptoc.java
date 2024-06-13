package Window_Parent_child;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium_maven.selenium_id1.javascriptexecutor1;


public class Window_handle_ptoc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.redbus.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		driver.findElement(By.xpath("//a[@id=\"contact_us_footer\"]")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();
		Thread.sleep(2000);
		String parent_id = id.next();
		System.out.println("the parent id is : "+parent_id);
		Thread.sleep(2000);
		String child_id = id.next();
		System.out.println("the child id is: "+child_id);
		driver.switchTo().window(child_id);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Train Tickets\"]")).click();
		System.out.println("click on train ticketson child window ");
		Thread.sleep(2000);
		driver.switchTo().window(parent_id);
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_UP);
		act.keyDown(Keys.PAGE_UP);
		act.keyDown(Keys.PAGE_UP);
		act.keyDown(Keys.PAGE_UP);
		Thread.sleep(2000);
		driver.quit();
	}

}
