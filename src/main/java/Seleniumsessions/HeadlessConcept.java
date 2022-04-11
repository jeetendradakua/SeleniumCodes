package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcept {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
