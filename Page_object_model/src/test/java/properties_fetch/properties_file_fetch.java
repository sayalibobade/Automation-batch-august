package properties_fetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class properties_file_fetch {
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties p2;
	public static Properties p3;
	public static WebDriver driver;
public static void property_file() throws Throwable {
	//browserurl
	 fis=new FileInputStream(projectpath+"\\src\\test\\resources\\Browser_url.properties");
 p=new Properties();
p.load(fis);

//Automation_practise
fis=new FileInputStream(projectpath+"\\src\\test\\resources\\Automation_practise_data.properties");
 p2=new Properties();
p2.load(fis);
//locator file
fis=new FileInputStream(projectpath+"\\src\\test\\resources\\Locators.properties");
p3=new Properties();
p3.load(fis);
}

public static void open_browser(String browserkey) {
	if (p.getProperty(browserkey).equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	} else if (p.getProperty(browserkey).equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	} else if (p.getProperty(browserkey).equalsIgnoreCase("internet explorer")) {
		driver = new InternetExplorerDriver();
	} else if (p.getProperty(browserkey).equalsIgnoreCase("Firefox")) {
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("The luanch browser is: "+p.getProperty(browserkey));
	
	
}
public static void navigate_urlhit(String urlkey) {
	driver.get(p.getProperty(urlkey));
	System.out.println("the url is: "+p.getProperty(urlkey));
	System.out.println("the title is: "+driver.getTitle());
	
	
}
}
