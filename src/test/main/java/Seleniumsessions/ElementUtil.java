package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver ;

	public ElementUtil(WebDriver driver) {
		
		this.driver = driver;
	}
	
	 public  WebElement getElement (By locator) {
		  return driver.findElement(locator);
		
	  }
	  
	  public  void doSendKeys(By locator,String value) {
		  getElement(locator).sendKeys(value);
	
	  
	
	}
	
	  public  By getBy(String locatorType,String locatorValue) {
			
			
			By locator = null;
			
			
			switch (locatorType.toLowerCase()) {
			case "id":
			locator = By.id(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
					break;
			case "className":
				locator = By.className(locatorValue);
					break;
			case "xpath":
				locator = By.xpath(locatorValue);
					break;
			case "cssSelector":
				locator = By.cssSelector(locatorValue);
					break;
			case "linkText":
				locator = By.linkText(locatorValue);
					break;
			case "partialLinkText":
				locator = By.partialLinkText(locatorValue);
					break;
			case "tagName":
				locator = By.tagName(locatorValue);
					break;
			default:
				break;
			}
			return locator;
		}

	public void doClick(By locator) {
		  getElement(locator).click();	
	}
	public String doElementGetText (By locator) {
		 return getElement(locator).getText();	
	}
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
}
