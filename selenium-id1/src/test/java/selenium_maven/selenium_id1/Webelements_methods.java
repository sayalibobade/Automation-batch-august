package selenium_maven.selenium_id1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.linkedin.com/");
		WebElement signin = driver
				.findElement(By.cssSelector("a[class=\"nav__button-secondary btn-md btn-secondary-emphasis\"]"));

		signin.click();
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.click();
		username.sendKeys("+919607123883");
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.click();
		password.sendKeys("Sayali22$");
		password.clear();
//driver.findElement(By.className("btn__primary--large from__button--floating")).click();

		WebElement forgotpass = driver
				.findElement(By.cssSelector("a[class=\"btn__tertiary--medium forgot-password\"]"));
		System.out.println(forgotpass.getText());
		forgotpass.click();
		WebElement un = driver.findElement(By.cssSelector("input#username"));
		un.click();
		un.sendKeys("sayli22bobade@gmail.com");
		//getattribute
		System.out.println(un.getAttribute("value"));
		System.out.println(un.getAttribute("spellcheck"));

		// getlocation

		Thread.sleep(3000);
		WebElement next = driver.findElement(By.cssSelector("button.form__submit"));
		System.out.println("the location of next button on forgot passwod is at: " + next.getLocation().x);
		System.out.println("the location of next button on forgot passwod is at: " + next.getLocation().y);
        //getsize
		System.out.println(next.getSize());
		// gettagnamed
		System.out.println(next.getTagName());
		// isenabled
		System.out.println(next.isEnabled());

		// isdisplayed
		WebElement headingforpass = driver.findElement(By.className("header__content__heading"));

		System.out.println(headingforpass.isDisplayed());

		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close();
		
	}

}
