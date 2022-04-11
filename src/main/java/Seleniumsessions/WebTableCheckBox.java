package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
			
		selectUserName ("Joe.Root");
		selectUserName ("Jhon.Smith");
		
	}
	
	public static void selectUserName (String userName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}
	

}
