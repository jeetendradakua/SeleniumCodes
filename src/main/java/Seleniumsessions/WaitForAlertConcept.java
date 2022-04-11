package Seleniumsessions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
	private static final Function<? super WebDriver, Object> Expectedconditions = null;
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		
		//driver.switchTo().alert();
		
		
		
		
		
	}
	
	public static Alert waitForAlert(int timeOUt) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOUt));
		
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static void acceptAlert(int timeOUt) {
			
		waitForAlert(timeOUt).accept();
			
		}
	
	public static void dismissAlert(int timeOUt) {
		
		waitForAlert(timeOUt).dismiss();
			
		}
	
     public static String getAlertText(int timeOUt) {
		
		return waitForAlert(timeOUt).getText();
			
		}
	
	
	

}
