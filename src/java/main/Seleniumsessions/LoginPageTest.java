package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil ();
		
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		System.out.println(brUtil.getPageurl());
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil (driver);
		
		eleutil.doSendKeys(email,"jeetu@gmail.com");
		eleutil.doSendKeys(password, "test1234@");
		
		brUtil.quiteBrowser();
	}

}
