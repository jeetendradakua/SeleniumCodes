package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		//ele1 --> ele2
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions (driver);
/*		
		act
		.clickAndHold(sourceEle)
		.moveToElement(targetEle)
		.release()
		.build()  // will check all the actions 
		.perform();
*/		
		
		act.dragAndDrop(sourceEle, targetEle).perform(); // if we have only 1 action then only .perform() used 
	//	act.dragAndDrop(sourceEle, targetEle).build().perform();
	//	act.dragAndDrop(sourceEle, targetEle).build();  // NA

		
		
		
		
		
	}

}
