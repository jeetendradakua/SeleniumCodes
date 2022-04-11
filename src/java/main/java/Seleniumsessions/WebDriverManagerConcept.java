package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.safaridriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();

	}

}
