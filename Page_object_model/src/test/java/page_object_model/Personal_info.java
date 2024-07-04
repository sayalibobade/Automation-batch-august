package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Personal_info {
@FindBy(css="input#id_gender2") WebElement gender;
@FindBy(css="input#customer_firstname") WebElement firstname;
@FindBy(css="input#customer_lastname") WebElement lastname;
@FindBy(css="input#passwd") WebElement password;
@FindBy(css="select#days") WebElement days;
@FindBy(css="select#months") WebElement month;
@FindBy(css="select#years") WebElement year;
@FindBy(css="button#submitAccount") WebElement register_btn;

public Personal_info(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void perosnal_info() {
	gender.click();
	firstname.sendKeys("saheli");
	lastname.sendKeys("Rajote");
	password.sendKeys("sayali");
	
	
	Select sc1=new Select(days);
	sc1.selectByIndex(3);
	
	Select sc2=new Select(month);
	sc2.selectByIndex(8);
	
	Select sc3=new Select(year);
	sc3.selectByIndex(3);
	
	register_btn.click();
	
	
}


}
