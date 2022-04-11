package PracticeSeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	
		static WebDriver driver ;
		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver () ;
			
			driver.get("https://www.amazon.com");
		
		/*	
			String hrefval = driver.findElement(By.linkText("Sell")).getAttribute("href");
	    System.out.println(hrefval);
		
		*/
	    By links = By.tagName("a");
	    getElementAttribute(links, "href");
		
		By images = By.tagName("img");
		System.out.println("total images: "+ getElements(images).size());
		
		List<String> srcList = getElementAttribute(images, "src");
		List<String> altList = getElementAttribute(images, "alt");
		}

		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		public static List<String> getElementAttribute(By locator, String attrName) {
			List<WebElement> eleList = getElements(locator);
		    List<String> eleAttrList = new ArrayList<String>();
			for  (WebElement e : eleList) {
				String attrValue = e.getAttribute(attrName);
				System.out.println(attrValue);
					 eleAttrList.add(attrValue);
		
		
		}
		return  eleAttrList ;
		
		
		
		

		
		

		}	
		
		
		
		
		
		
		
		
}
