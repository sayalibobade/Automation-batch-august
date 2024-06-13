package dropdown;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown {


	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize(); 

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

/*driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
WebElement products = driver.findElement(By.cssSelector("select#first"));
products.click();
Select sc=new Select(products);
sc.selectByIndex(3);
Thread.sleep(3000);
sc.deselectAll();
sc.selectByValue("Google");*/

driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
String projectpath=System.getProperty("user.dir");

WebElement country = driver.findElement(By.xpath("//option[@value=\"ALA\"]//parent::select"));

Select sc1=new Select(country);
sc1.selectByValue("ALA");
//sc1.deselectByIndex(2);

TakesScreenshot ts=(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File target = new File(projectpath+"\\Screenshotofdragdrop\\selectALA.png");
FileHandler.copy(source, target);

//sc1.deselectByVisibleText("American Samoa");
driver.get("https://demoqa.com/select-menu");
WebElement color = driver.findElement(By.cssSelector("select#oldSelectMenu"));
Select sc2=new Select(color);
sc2.selectByVisibleText("Blue");
TakesScreenshot ts1=(TakesScreenshot) driver;
File source1 = ts1.getScreenshotAs(OutputType.FILE);
File target1 = new File("./Screenshotofdragdrop/selectcolorblue.png");
FileHandler.copy(source1, target1);


	}

}
