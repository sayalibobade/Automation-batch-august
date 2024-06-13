package dynamic_code;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report_dynamic {
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");
	public static ExtentReports er;
	public static ExtentTest et;
	
	public static void launch_Browser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("internet explorer")) {
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		System.out.println("the launched browser is: " + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void urlhit(String url) {
		/*
		 * if(url.equalsIgnoreCase("Amazon")) { driver.get("https://www.amazon.in");
		 * }else if(url.equalsIgnoreCase("make my trip")) {
		 * driver.get("https://www.makemytrip.com/");
		 * }System.out.println("website is: "+url);
		 */

		driver.get(url);

	}

	public static void Screenshot_way1(String screenshotname) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Alert_screenshot/" + screenshotname + ".png");
		FileHandler.copy(source, target);
	}

	public static void Screenshot_way2(String Screenshotnm) throws Throwable {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(Projectpath + "\\Flipcart_report_screenshot\\" + Screenshotnm + ".png");
		FileHandler.copy(source1, target1);

	}
	public  static void report(String Document_title,String report_name,String app) {
		ExtentSparkReporter esr = new ExtentSparkReporter(Projectpath + "\\Report\\Flipcart_report");
		esr.config().setDocumentTitle(Document_title);
		esr.config().setReportName(report_name);
		esr.config().setTheme(Theme.STANDARD);
		
		 er = new ExtentReports();
		er.attachReporter(esr);

		er.setSystemInfo("os", "windows 10");
		er.setSystemInfo("browser", "Chrome");
		er.setSystemInfo("tester", "sayali");
		er.setSystemInfo("Application", app);

	}
	public static void  reporttest(String Test_name,String test_info) {
		 et = er.createTest(Test_name);
		et.log(Status.INFO,test_info);
	
	}
	public static void getscreenshot_report(String screenshot_name) {
et.addScreenCaptureFromPath(Projectpath+"\\Amazon Report\\"+screenshot_name+".png");
	 er.flush();
}
}
	


