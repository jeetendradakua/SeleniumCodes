package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver","F:\\Javainfocampus\\Softwares\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
