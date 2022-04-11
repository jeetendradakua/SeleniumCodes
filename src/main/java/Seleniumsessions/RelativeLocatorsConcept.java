package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;  //selenium 4.x

import java.util.List;

import org.openqa.selenium.By;
public class RelativeLocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://aqi.in/dashboard/canada");
        WebElement ele = driver.findElement(By.linkText("Olds, Canada"));
		
        String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(index);
		
        String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
        System.out.println(rank);
		
		
        String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
        System.out.println(below);
		
        String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
        System.out.println(above);
		
        String near =  driver.findElement(with(By.tagName("p")).near(ele)).getText();
        System.out.println(near);
        
        List<WebElement>aboveList = driver.findElements(with(By.tagName("a")).above(ele));
        for(WebElement e : aboveList) {
        	System.out.println(e.getText());
        }
        
        
        
	}

}
