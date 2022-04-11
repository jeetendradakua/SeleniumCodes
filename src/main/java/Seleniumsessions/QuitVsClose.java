package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		
		
	System.setProperty("webdriver.chrome.driver","F:\\Javainfocampus\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //launch chrome
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	    //driver.quit();
		driver.close();
		
		//System.out.println(driver.getTitle());
		
		
		//quit : session id = null, no such exception
		//close : session id expired, invalid session id , no such session id exception
		
	       driver = new ChromeDriver();  //launch chrome with a new session id
			driver.get("https://google.com");
		     title = driver.getTitle();
			System.out.println(title);
	
		
		
		
		
		
		
		
		
	}

}
