package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		
		// Page -- DOM
		//E1--v1
		//Refresh
		//Page - DOM
		//E1.click  -- ?
		
		
		// NAVIGATION METHOD :REFRESH , FORWARD, BACK 
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailid = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

		
		WebElement login_ele = driver.findElement(emailid);
		login_ele.sendKeys("jeet@gmail.com"); //dom v1
		Thread.sleep(4000);
		driver.navigate().refresh(); // STALE ELEMENT REFERENCE EXCEPTION 
		// dom -- v2
		
		login_ele = driver.findElement(emailid); // dom v2
		login_ele.sendKeys("jeetendra@gmail.com");
	}

}
