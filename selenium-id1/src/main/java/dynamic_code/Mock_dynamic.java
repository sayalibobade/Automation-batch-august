package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mock_dynamic {
public static WebDriver driver;
public static void browser1(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}System.out.println(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

public static void hiturl(String url) {
	driver.get(url);
}
public static void screenshot(String Filename) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./Mock_screenshot/"+Filename+".png");
	FileHandler.copy(source, target);
}

}
