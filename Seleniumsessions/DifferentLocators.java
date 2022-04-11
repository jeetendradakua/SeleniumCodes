package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
       ElementUtil eleUtil = new ElementUtil (driver);
		//1.id: unique --I
		//2. name : CAN BE DUPLICATE --II
		
	//	driver.findElement(By.name("email")).sendKeys("test@gmail.com");
	
	/*	By emailId = By.name("email");
		eleUtil.doSendKeys(emailId,"test@gmail.com");
	*/
      
       
       
     /*  String emailId_name = "email";
       By emailId = eleUtil.getBy("name",emailId_name );
       eleUtil.doSendKeys(emailId,"tom@gmail.com");
     */  
        
       
        //3. className :  can be same for the different elements -- NOT RECOMMENDED--III
         
     /*    By ele = By.className("form-control");
         driver.findElement(ele).sendKeys("test@gmail.com");
      */  
         
         //4. xpath : is not attribute . this is the address of the element in the html dom
  /*       
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
    //   driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
   
        By loginBtn =  By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
        eleUtil.doClick(loginBtn);
    */    
        
        
        
        //5. css selector : is not an attribute.
      /* 
        driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
      */
       
         
       //6. link text : only for links:
         // html tag : <a>
         //href -hyperlink reference link property (attribute)
       
     /*  
         By registerLink =By.linkText("Register");
         eleUtil.doClick(registerLink);
     */    
        
         
         //7. partialLinkText : 
         
         
         
  /*       
       By forgotPwdLink =  By.partialLinkText("Forgotten");
         eleUtil.doClick(forgotPwdLink);
  */
         
 //    8. By tagName: html tag, not the attribute
        
       String text =  driver.findElement(By.tagName("h2")).getText();         
       System.out.println(text); 
       
        
         
   //      By header = By.tagName("h2");
   //      By register  = By.linkText("Register");
         
       //  String text = eleutil.doElementGetText(header);
     //    System.out.println(text);
         
         
         
         
         
         
	}

}
