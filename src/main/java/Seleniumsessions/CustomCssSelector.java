package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
		
		//css selector:
		By.cssSelector("//#input-email");
			
		//    id-->#id          --->//#input-email
		//    class-->.class    --->//.form-control
		
				
				
				
	}

}
