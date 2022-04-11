package Seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowIterator {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        
        
        
        
       Set<String> handles = driver.getWindowHandles();
       Iterator <String> it =  handles.iterator();

       while(it.hasNext()) {
    	   
    	   String childWindowId = it.next();
    	   driver.switchTo().window(childWindowId);
    	   System.out.println(driver.getTitle());
    	   driver.close();
       }
       
	}   
}
