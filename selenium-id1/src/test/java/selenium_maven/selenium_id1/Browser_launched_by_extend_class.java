package selenium_maven.selenium_id1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.Dynamic_Launchbrowser;

public class Browser_launched_by_extend_class extends Dynamic_Launchbrowser {

	public static void main(String[] args) throws IOException {
	launch_Browser("Chrome");
	urlhit("https://www.shaadi.com");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
File target = new File("./Screenshot/urlscreenshot.png");
FileHandler.copy(Source, target);


	}

}

