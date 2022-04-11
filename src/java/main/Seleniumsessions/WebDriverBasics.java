package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver","F:\\Javainfocampus\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //launch chrome
		
		//Top Casting :
		// ChromeDriver class object can be referred by parent WebDriver Interface ref Variable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://google.com");
		String title = driver.getTitle();
	    System.out.println(title);
	    
	    
	    //Validation point / checkpoint/ act vs exp result / assertions
	    
	    
	    if(title.equals("Google")) {
	    	System.out.println("correct title");
	    }else {
	    	System.out.println("incorrect title");
	    }
	    
	    
	    
	    //automation steps + // validation point / checkpoint/ act vs exp result / assertions // Automation testing
	    
	    System.out.println(driver.getCurrentUrl().contains("google"));
	    
	    System.out.println(driver.getPageSource().contains("Copyright The Closure Library Authors"));
	    
	    
	    
	    
	    
	    
		driver.quit();
		
		
		
		
		
		
		
	}

}
