package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartDemo {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
 
		ElementUtil eleUtil = new ElementUtil (driver);
		
		By registerLink = By.linkText("Register");
        eleUtil.doClick(registerLink);
       
        By firstName = By.id("input-firstname");
        eleUtil.doSendKeys(firstName, "Jeetendra");
        
        By lastName = By.id("input-lastname");
        eleUtil.doSendKeys(lastName, "Dakua");
       
        By emailId = By.name("email");
		eleUtil.doSendKeys(emailId,"jeetendradakua72@gmail.com");	
		
		By telephone = By.xpath("//*[@id=\"input-telephone\"]");
		eleUtil.doSendKeys(telephone, "45784578");
		
		By password = By.xpath("//*[@id=\"input-password\"]");
		eleUtil.doSendKeys(password, "test123@");
		
		By confirm = By.cssSelector("#input-confirm");
		eleUtil.doSendKeys(confirm, "test123@");
		
		By subscription = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		eleUtil.doClick(subscription);
		
		By agree = By.name("agree");
		eleUtil.doClick(agree);
		
		By submit = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		eleUtil.doClick(submit);
		
		
	//	By verify=By.xpath("//*[@id=\"content\"]/h1");
		String title=driver.getTitle();
		String title1 = "Your Account Has Been Created!";
		
	/*	By verify = By.xpath("//*[@id=\"content\"]/h1");
		String text = eleUtil.doElementGetText(verify);
        System.out.println(text);
        String text1 = "Your Account Has Been Created!";
		if (text.equals(text1))
		*/
		if(title.equals(title1)){
			System.out.println("verified");
		}
		else 
		{
			System.out.println("Failed registering");
		}
	}

}
