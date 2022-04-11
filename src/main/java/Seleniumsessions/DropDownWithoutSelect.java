package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	//	driver.findElement(By.id("Form_submitForm_Country")).sendKeys("India");
		
		
		List<WebElement> countryList = 
				             driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		
		
		for(WebElement e : countryList) {
			String text = e.getText();
			if(text.equals("India")) {
				e.click();
				break ;
			}
		}
		
		
		
		
		
		
		
		
		
		
	/*	By country =By.id("Form_submitForm_Country");
		By state =By.id("Form_submitForm_State");
	*/	

	}

}
