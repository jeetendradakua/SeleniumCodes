package Seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		
		// WebDriverWait (c) extends FluentWWait (c) implements Wait (Interface)
	
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout)); // sel 4.x
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("https://demo.opencart.com/index.php?route=account/login");

			By emailid = By.id("input-email");
			By password = By.id("input-password");
			By loginBtn = By.xpath("//input[@value='Login']");

			waitForElementPresentWithFluentWait(emailid, 10, 2).sendKeys("test123@gmail.com");
	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.pollingEvery(Duration.ofSeconds(2));
	  wait.ignoring(NoSuchElementException.class);
	
	
	}
	
	
	public static WebElement waitForElementPresentWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class,
						ElementNotInteractableException.class);
		
	return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	public static WebElement waitForElementVisiblityWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class);
		
	return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	

}
}