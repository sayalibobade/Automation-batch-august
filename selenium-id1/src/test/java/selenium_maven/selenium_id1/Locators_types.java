package selenium_maven.selenium_id1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_types {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.in/");
//id
driver.findElement(By.id("a-page"));
driver.findElement(By.id("skiplink"));
//name
driver.findElement(By.name("google-site-verification"));
driver.findElement(By.name("site-search"));
//class
driver.findElement(By.className("copilot-secure-display"));
driver.findElement(By.className("skip-link"));
//linktext
driver.findElement(By.linkText("https://images-eu.ssl-images-amazon.com/images/I/4171sdbgqbL.css?AUIClients/AmazonGatewayAuiAssets"));
driver.findElement(By.linkText("Amazon Pharmacy"));
//partialLinkText
driver.findElement(By.partialLinkText("images-eu"));
driver.findElement(By.partialLinkText("Amazon Phar"));

//findelements
driver.findElements(By.tagName("div"));
driver.findElements(By.tagName("a"));


//css selector
//tagname and id value(tagname#Idvalue)
driver.findElement(By.cssSelector("a#nav-top"));
driver.findElement(By.cssSelector("div#a-page"));

//tagname and class name(tagname.classvalue)
driver.findElement(By.cssSelector("header.nav-progressive-attribute"));
driver.findElement(By.cssSelector(" div.appContainer"));

//tagname and attribute(tagname[attribute="value of attribute"])
driver.findElement(By.cssSelector("div[class=\"a-section\"]"));
driver.findElement(By.cssSelector("a[id=\"nav-hamburger-menu\"]"));

//tagname and multiple attribute
driver.findElement(By.cssSelector("div[id=\"nav-flyout-ewc\"][class=\"nav-ewc-lazy-align nav-ewcFlyout nav-flyout nav-locked\"]"));
driver.findElement(By.cssSelector("header[id=\"navbar-main\"][class=\"nav-opt-sprite nav-flex nav-locale-in nav-lang-en nav-ssl nav-unrec nav-progressive-attribute\"]"));

//contains
driver.findElement(By.cssSelector("div[id*=\"root\"]"));
driver.findElement(By.cssSelector("div[id*=\"navb\"]"));

//startswith
driver.findElement(By.cssSelector("div[id^=\"a-po\"]"));
driver.findElement(By.cssSelector("div[id^=\"navba\"]"));

//endswith
driver.findElement(By.cssSelector("div[id$=\"root\"]"));
driver.findElement(By.cssSelector("div[id$=\"bar\"]"));

//pseudo class
//1st child
driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
	driver.findElement(By.cssSelector("a[id=\\\"nav-link-groceries\\\"] :first-child"));
	
//last child
driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
driver.findElement(By.cssSelector("a[id=\"nav-link-groceries\"] :last-child"));

//nth child
driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(4)"));
driver.findElement(By.cssSelector("a[id=\"nav-link-groceries\"] :nth-child(2)"));

//nth last child
driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-last-child(5)"));
driver.findElement(By.cssSelector("a[id=\"nav-link-groceries\"] :nth-last-child(2)"));

//Xpath
//absolute xpath
driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div/div[2]/div[2]/div[3]/a/span"));
driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[7]"));

//relative Xpath
//tagname and attribute
driver.findElement(By.xpath(""));
driver.findElement(By.xpath("//a[@class=\"nav-a\"]"));
driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]  "));

//tagname and multiple attribute
driver.findElement(By.xpath("//input[@id=\"isscrid\"] [@name=\"crid\"] "));
driver.findElement(By.xpath("//div[@id=\"nav-flyout-amazonprime\"] [@class=\"nav-coreFlyout nav-flyout\"] "));

//And operator
driver.findElement(By.xpath("//div[@id=\"nav-al-wishlist\"and@class=\"nav-al-column nav-tpl-itemList nav-flyout-content nav-flyout-accessibility\"] "));
driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\" and@class=\"nav-logo-link nav-progressive-attribute\"]"));

//or operator
driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" or@type=\"t\"]"));
driver.findElement(By.xpath("//div[@id=\"a-popover-root\"or@style=\"z-index:-1;position:absolute;\"]"));

//contains
driver.findElement(By.xpath("//style[contains(@mark,\"CSS\")]"));
driver.findElement(By.xpath("//a[contains(@id,\"nav-t\")]"));

//starts with
driver.findElement(By.xpath("//span[starts-with(@id,\"logo\")]"));
driver.findElement(By.xpath("//form[starts-with(@id,\"nav-\")]"));

//link text
driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
driver.findElement(By.xpath("//a[text()=\"Customer Service\"]"));

//xpath using index
driver.findElement(By.xpath("(//script[@type=\"text/javascript\"])[1]"));
driver.findElement(By.xpath("(//link[@rel=\"dns-prefetch\"])[1]"));

//self

driver.findElement(By.xpath("//meta[@name=\"pageInstance\"]//self::meta"));
driver.findElement(By.xpath("(//link[@rel=\"preload\"]//self::link)[1]"));

//parent of current element
driver.findElement(By.xpath("//option[@value=\"search-alias=aps\"]//parent::select"));
driver.findElement(By.xpath("//span[@tabindex=\"0\"]//parent::div"));

//child node from parent tag name
driver.findElement(By.xpath("(//div[@id=\"a-popover-1\"]//child::span)[1]"));
driver.findElement(By.xpath("(//div[@id=\"hmenu-container\"]//child::div)[1]"));





	}
	

}
