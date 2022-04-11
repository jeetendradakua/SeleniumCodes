package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of given browser
	 * 
	 * @param browserName
	 * @return This returns the driver
	 */

	public WebDriver launchBrowser(String browserName) {

		System.out.println("browser name is : " + browserName);

		if (browserName.equalsIgnoreCase("Chrome")) {
			
		WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver",
				//	"F:\\Javainfocampus\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Javainfocampus\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser : " + browserName);
		}

		return driver;
	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("please pass the right url");
			return;
		}
		if (url.contains("https") || url.contains("http")) {
			driver.get(url);
		} else {
			driver.close();
			try {
				throw new Exception("INVALIDURLEXCEPTION");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageurl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
