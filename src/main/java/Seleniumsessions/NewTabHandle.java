package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String parentWindowId = driver.getWindowHandle();
       
        driver.switchTo().newWindow(WindowType.WINDOW); //selenium 4.x
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.close(); //close child window
        
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
	}

}
