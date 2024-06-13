package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdown_forloop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source");
	
	
	driver.findElement(By.xpath("(//a[@class='chzn-single chzn-default'])[1]")).click();
List<WebElement> religion = driver.findElements(By.xpath("//ul[@class=\"chzn-results\"]//child::li"));
	System.out.println(religion.size());

	for(int b=0;b<religion.size();b++) {
		if(religion.get(b).getText().equalsIgnoreCase("hindu")) {
			religion.get(b).click();
			
		}
	
}
//	Actions ac=new Actions(driver);
//	ac.keyDown(Keys.TAB);
//	ac.keyDown(Keys.TAB);
//	
	
	//driver.findElement(By.xpath("//div[@id=\"reg_caste_chzn\"]")).click();
	
	
	
	
	
	driver.findElement(By.xpath("//div[@id=\"reg_city_res_chzn\"]")).click();
	List<WebElement> city = driver.findElements(By.xpath("//li[@class=\"active-result group-option\"]"));
System.out.println(city.size());
for(int a=0;a<city.size();a++) {
	if(city.get(a).getText().contains("Mumbai")) {
		city.get(a).click();
		
		
	}
}}


/*driver.findElement(By.xpath("(//a[@class=\"chzn-single chzn-default\"])[1]")).click();
List<WebElement> religion = driver.findElements(By.xpath("//li[@class=\"active-result\"]"));
System.out.println(religion.size());

for(int b=0;b<religion.size();b++) {
	if(religion.get(b).getText().equalsIgnoreCase("Hindu")) {
		religion.get(b).click();
		
	}
	
}*/

	}
	
