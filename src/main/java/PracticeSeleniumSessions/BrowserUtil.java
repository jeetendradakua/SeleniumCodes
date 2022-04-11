package PracticeSeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;
/**
 * 
 * @param url
 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Enter Borwser name :" + browserName);
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pas the right browser : " + browserName);
		}
		return driver;
	}

    public void launchUrl (String url) {
    	if(url == null) {
    		System.out.println("please pass the right url ");
    		return;
    	}
    	if(url.contains("http")||url.contains("https")) {
    		driver.get(url);
    	}else {
    		driver.close();
			try {
				throw new Exception("INVALIDURLEXCEPTION -- pass the url with http(s)");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
    
    public String getPageTitle( ) {
    	return driver.getTitle();
    }
    
    public String getPageUrl() {
    	return driver.getCurrentUrl();
    }
    
    public void closeTheBrowser() {
    	driver.close();
    }
    
    public void quitBrowser () {
    	driver.quit();
    }
}	
	
	
	

