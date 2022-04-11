package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEAndFEsException {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
	
		
		//IllegalStateException
		//StaleElementRefException
		//ElementNotInteractableException
		//ElementNotFoundException : not from selenium
		//NoSuchSessionExeption
		//TimeOutException
		//NoAlertException
		
		
	//	driver.findElement(By.linkText("Customers111")).click();
	//	NoSuchElementException
	
		
		//wrong selector (xpath css etc) : InvalidSelectorException
		
	List<WebElement> footerList = driver.findElements(By.xpath("ul[@class='footer-nav']//a"));
	  System.out.println(footerList.size());
	// if element is not available on the page the it will return empty list (size=0) it will not give nay exception like
	// in case of find element
	
	  if(footerList.size() > 0) {
		  System.out.println("footers are present on the page ");
		  for(WebElement e: footerList) {
				String text = e.getText();
				System.out.println(text);
			}
	  }
	  
	 //
//	 if (driver.findElements(By.linkText("Customers")).size() > 0) {
//		 System.out.println("customer link is present on the page");
//	 }
	  System.out.println(isElementPresent(By.linkText("Customers")));
	}
	
	public static boolean isElementPresent (By locator) {
		if(getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
