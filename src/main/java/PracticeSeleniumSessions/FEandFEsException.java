package PracticeSeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEandFEsException {

	static WebDriver driver;
	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    
    driver.get("https://freshworks.com/");
 
  //Illegal State Exception  
  //StaleElementRefException
    //ElementNotInteractableException
    //ElementNotFoundException(not in selenium)
    //NoSessionException
    //TimeOutException
    //NoAlertException
    //NoFrameException
    //NoWindowException
    //NoBrowserWindowException
    
  //  driver.findElement(By.linkText("Customer111")).click();
  //  NoSuchElementException
    
    // wrong selector :  InvalidSelectorExcepiton
    //
   List<WebElement> footerList =    driver.findElements(By.xpath("//ul[@class='footer-nav11']//a"));
   System.out.println(footerList.size());
   
   if(footerList.size()>0) {
	   for(WebElement e : footerList) {
		 String text =  e.getText();
		 System.out.println(text);
	   }
   }
    //
  if( driver.findElements(By.linkText("Customers")).size() > 0) {
	   System.out.println("customer link is present on the page");
   }
  System.out.println(isElementPresent(By.linkText("customer")));

}
	public static List<WebElement> getElements (By locator) {
		return driver.findElements(locator);
	}
	public static boolean isElementPresent (By locator) {
		if(getElements(locator).size()>0) {
			return true;
		}
		return false;
	}
}