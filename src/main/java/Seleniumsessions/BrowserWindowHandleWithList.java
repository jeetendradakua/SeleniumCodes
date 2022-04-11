package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        //child window
        
        Set<String> handles = driver.getWindowHandles();
   List<String> handlesList = new ArrayList<String>(handles);
   
//   for(String e : handlesList) {
//	System.out.println(e);
	
//   }
   
  String parentWindowId = handlesList.get(0);
  String childWindowId = handlesList.get(1);
  driver.switchTo().window(childWindowId);
  System.out.println(driver.getTitle());
  driver.close();
  
  driver.switchTo().window(parentWindowId);
  System.out.println(driver.getTitle());
  driver.quit();
  
}
	
}

