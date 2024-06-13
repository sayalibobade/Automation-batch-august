package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Dynamic_Launchbrowser;

public class Report_amazon extends Dynamic_Launchbrowser {

	public static void main(String[] args) throws Throwable {
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\Report\\main report");
		esr.config().setDocumentTitle("Document");
		esr.config().setReportName("report_name");
		esr.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);

		er.setSystemInfo("os", "windows 10");
		er.setSystemInfo("browser", "Chrome");
		er.setSystemInfo("tester", "sayali");
		er.setSystemInfo("Application", "amazon");

		ExtentTest et = er.createTest("create test for Amazon search functionality");
		et.log(Status.INFO, "find search functionality");
		
		ExtentTest et1 = er.createTest("click on amazon search");
		et.log(Status.INFO, "click search functionality");
		
		ExtentTest et2 = er.createTest("sendkeys shirt in search functionality");
		et.log(Status.INFO, "sendkeys in search functionality");
		et2.addScreenCaptureFromPath(projectpath+"\\Amazon Report\\amazon tshirt search.png ");
		//et.log(Status.PASS, "search functionality test case pass");

		launch_Browser("chrome");
		urlhit("https://www.amazon.in");
 
		
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.click();
		search.sendKeys("tshirt");
		Screenshot_way2("amazon tshirt search ");
		//et2.addScreenCaptureFromPath(projectpath+"\\Amazon Report\\amazon tshirt search.png ");
		er.flush();

	}

}
