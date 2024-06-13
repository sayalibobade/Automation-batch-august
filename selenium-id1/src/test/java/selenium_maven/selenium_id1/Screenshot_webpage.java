package selenium_maven.selenium_id1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

public class Screenshot_webpage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/Browserlaunch.png");
		FileHandler.copy(source, target);

		driver.get("https://www.shaadi.com/");
		String ProjectPath = System.getProperty("user.dir");
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(ProjectPath + "\\Screenshot\\Applicationhit.png");
		FileHandler.copy(source1, target1);

		
		WebElement forlooking = driver.findElement(By.xpath("(//div[@class=\"Dropdown-control\"])[1]"));
		forlooking.click();
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File("./Screenshot/LookingFo1r.png");
		FileHandler.copy(source2, target2);

		WebElement LookingFor = driver.findElement(By.xpath("(//div[@class=\"Dropdown-placeholder is-selected\"])[1]"));
		LookingFor.click();
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE);
		File target3 = new File("./Screenshot/LookingFor.png");
		FileHandler.copy(source3, target3);

		WebElement age = driver.findElement(By.xpath("(//div[@class=\"Dropdown-placeholder is-selected\"])[2]"));
		age.click();
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File source4 = ts4.getScreenshotAs(OutputType.FILE);
		File target4 = new File("./Screenshot/ageField.png");
		FileHandler.copy(source4, target4);

		WebElement religion = driver.findElement(By.xpath("(//div[@class=\"Dropdown-placeholder is-selected\"])[4]"));
		religion.click();
		String projectpath1 = System.getProperty("user.dir");
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File source5 = ts5.getScreenshotAs(OutputType.FILE);
		File target5 = new File(projectpath1 + "\\Screenshot\\religion.png");
		FileHandler.copy(source5, target5);
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		String project = System.getProperty("user.dir");
		TakesScreenshot st7 = (TakesScreenshot) driver;
		File source7 = st7.getScreenshotAs(OutputType.FILE);
		File target7 = new File(project + "\\Screenshot\\login.png");
		FileHandler.copy(source7, target7);


		
	}

}
