package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws StaleElementReferenceException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		
		WebElement search_button = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search_button.sendKeys("tshirt");
		List<WebElement> tshirt_search = driver
				.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));

		for (int a = 0; a < tshirt_search.size(); a++) {

			try {
				if (tshirt_search.get(a).getText().contains("tshirt for men")) {
					tshirt_search.get(a).click();
					driver.navigate().refresh();
				}
			} 
			catch (StaleElementReferenceException e) {
		
		}catch (Throwable e) {
	
		}
			}
		

		System.out.println(search_button.getAttribute("value"));

//direct choose dropdown option by locating webelement
//		search_button.clear();
//		
//		search_button.sendKeys("fastrack");
//WebElement watch = driver.findElement(By.xpath("//span[text()=\"watch fastrack for men\"]"));
//watch.click();
//System.out.println(search_button.getAttribute("value"));
	}

}
