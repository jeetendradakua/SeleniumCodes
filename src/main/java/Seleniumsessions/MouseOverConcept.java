package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverConcept {
 static WebDriver driver ;
 
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submeu-using-css-html");
/*
		WebElement contentElement = driver.findElement(By.className("menulink"));
		
	   Actions act = new Actions(driver);
		
		act.moveToElement(contentElement).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();
	*/
		
		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");
		selectSubMenu(parentMenu,childMenu);
	  
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	public static void selectSubMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();
		
	}
		
		public static void selectSubMenu(By parentMenu, By childMenu, By subChildMenu) throws InterruptedException {
			Actions act = new Actions(driver);
			act.moveToElement(getElement(parentMenu)).perform();
			Thread.sleep(2000);
			act.moveToElement(getElement(childMenu)).perform();
			Thread.sleep(2000);

			getElement(subChildMenu).click();
		
		}	
		
		public static void selectSubMenu(By parentMenu, By childMenu,By subChildMenu1, By subChildMenu2) throws InterruptedException {
			Actions act = new Actions(driver);
			act.moveToElement(getElement(parentMenu)).perform();
			Thread.sleep(2000);
			act.moveToElement(getElement(childMenu)).perform();
			Thread.sleep(2000);
			act.moveToElement(getElement(subChildMenu1)).perform();
			Thread.sleep(2000);
		
			getElement(subChildMenu2).click();
		
		}	
		
	}


