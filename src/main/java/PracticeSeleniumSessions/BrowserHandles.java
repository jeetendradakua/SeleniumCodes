package PracticeSeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		Set<String>handler=driver.getWindowHandles();
		 
		Iterator<String>it=handler.iterator();
		
		String parentWindowId=it.next(); 
		System.out.println("Parent window id :"+ parentWindowId);
		
		Thread.sleep(5000);
		
		String childWindowIdA=it.next();
		System.out.println("Child Window id:"+ childWindowIdA);
		
		String childWindowIdB=it.next();
		System.out.println("Child Window id:"+ childWindowIdB);
		
		Thread.sleep(5000);
		
		
		driver.switchTo().window(childWindowIdA);
		System.out.println("child window poopu up titleA:"+driver.getTitle());
		
		driver.close();
		 
		driver.switchTo().window(childWindowIdB);
		System.out.println("child window poopu up titleB:"+driver.getTitle());
		 
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window poopu up title:"+driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
