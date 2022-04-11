package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	 
 
		//execute js
		//JavaScriptExecutor will help to execute the JS
		
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://demo.opencart.com/index.php?route=account/login");
			JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
			
			//jsUtil.generateAlert("hi this is my alert");
		String pageText = jsUtil.getPageInnerText();
	    System.out.println(pageText);
		System.out.println(pageText.contains("upcoming meetings"));
			
//			String title = jsUtil.getTitleByJS();
//          String title = driver.findElement(By.tagName("title")).getText();
//			System.out.println(title);
			
//			jsUtil.refreshBrowserByJS();
//			WebElement loginForm = driver.findElement(By.id("loginForm"));
//			jsUtil.drawBorder(loginForm);
			
			
//			WebElement email = driver.findElement(By.id("input-email"));
//			jsUtil.flash(email);
//			email.sendKeys("naveen@gmail.com");
//			
//			WebElement pwd = driver.findElement(By.id("input-password"));
//			jsUtil.flash(pwd);
//			pwd.sendKeys("test@123");
			
//			jsUtil.scrollPageDown();
//			Thread.sleep(2000);
//			jsUtil.scrollPageUp();
			
			//jsUtil.scrollPageDown("500");
//			WebElement ele = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
//			jsUtil.scrollIntoView(ele);
			
			//infinite loading///lazy page loading
			
			//WebElement reg = driver.findElement(By.linkText("Registry"));
			//jsUtil.clickElementByJS(reg);
			//click, Actions-click : click is happening on the element on the page
			//JS click: clicking on the element by injecting the java script.
			
			
			
		}

	}