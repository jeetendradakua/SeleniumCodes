package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver ;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver ();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
		
		//create webelement + perform actions (click, send keys , isdisplayed, get text
		
		
		//1. id  : unique
	//1.
//	driver.findElement(By.id("input-email")).sendKeys("jeetendra@gmail.com");
//	driver.findElement(By.id("input-password")).sendKeys("test123@");
	
	//2.
		
	/*	WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailId.sendKeys("jeetendra@gmail.com");
		password.sendKeys("test123@");
	*/	
		
		//3.By locators
		
	/*	
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		driver.findElement(email).sendKeys("jeetendra@gmil.com");
		driver.findElement(password).sendKeys("test123@");
	*/	
		
		//4. By locators : generic function
		
	/*	By email = By.id("input-email");
		By password = By.id("input-password");
		
		getElement(email).sendKeys("jeetendra@gmail.com");
		getElement(password).sendKeys("test123@");
	*/
		
	//5. By locators : generic functions(GE,actions)
	
	/*	By email = By.id("input-email");
		By password = By.id("input-password");
		
		doSendKeys(email,"jeetendra@gmail.com");
		doSendKeys(password,"test123@");
	*/	
	
	//6. By locator : generic functions(GE, actions) in a utility class	
		
		
	/*	
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil (driver);
		eleutil.doSendKeys(email,"jeetendra@gmail.com");
		eleutil.doSendKeys(password, "test123@");
	*/	
		//7. use browser util & elemnt util		
		
		
		//8. String locators --> By Locator
		
		String email_id = "input-email";
		String password_id = "input-password";
		ElementUtil eleutil = new ElementUtil (driver);
		
		By email = getBy("id",email_id);
		By password = getBy("id",password_id);
		
		
		eleutil.doSendKeys(email,"jeetendra@gmail.com");
		eleutil.doSendKeys(password, "test123@");
	}
	 
	public static By getBy(String locatorType,String locatorValue) {
	
		
		By locator = null;
		
		
		switch (locatorType.toLowerCase()) {
		case "id":
		locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}
	
	
	
	
	
	
	
	  public static WebElement getElement (By locator) {
		  return driver.findElement(locator);
		
	  }
	  
	  public static void doSendKeys(By locator,String value) {
		  getElement(locator).sendKeys(value);
	
	  
	
	}

}
