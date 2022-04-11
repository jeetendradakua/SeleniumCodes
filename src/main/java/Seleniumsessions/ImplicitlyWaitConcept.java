package Seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {
 
	static WebDriver driver;
	
	public static void main(String[] args) {

		// Thread.sleep is a static wait . so its not advisable to use
		
		
		//dynamic wait :
		//implicitly wait:
		//global wait : it will be applicable for all the web elements
		// fe : imp wait will be applied by default
		// it works only for web elements 
		// it does not work for alerts, title , url
		// we avoid imp wait in framework design 
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("jeetendradakua@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("tst123@");
		
		//e3,e4,e5..
		
		// home page:10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// e6 e7
		
		// click on logout 
		// login page : 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click on registration :
		// register page : 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     
		
		//e9 10
		
		// product page :  0 secs -- nullify imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		
		
		
		
		
	}

}
