package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamic_code.Dynamic_Launchbrowser;

public class Upload_file extends Dynamic_Launchbrowser {

	public static void main(String[] args) throws AWTException {
		launch_Browser("chrome");
		urlhit("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//span[text()=\"Select PDF file\"]")).click();
		
		StringSelection ss=new StringSelection("file:///E:/SAYLI/Manual-Testing-Step-by-Step-Tutorial.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}

