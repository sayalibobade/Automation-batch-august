package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dynamic_code.Dynamic_Launchbrowser;

public class Account_signin  extends Dynamic_Launchbrowser{
	
	//public static WebElement driver;
@FindBy(css="a.login") WebElement signin_btn;
@FindBy(css="input#email_create") WebElement email_address;
@FindBy(css="button#SubmitCreate") WebElement create_acc_btn;

	public  Account_signin(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	
	public void account() {
		signin_btn.click();
		javascript(400);
		email_address.sendKeys("sayli22bobade@gmail.com");
		create_acc_btn.click();
	}
	
}
