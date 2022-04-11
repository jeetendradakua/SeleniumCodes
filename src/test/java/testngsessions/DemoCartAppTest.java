package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCartAppTest extends BaseTest {
	   
		
		
		@Test(priority=3)
		public void titleTest() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Account Login");
		}
		@Test(enabled=true , description =" urltest") // to execute we use true or false for a specific test case
		public void urlTest() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertTrue(url.contains("cart"));
		}
		
		@Test(priority=1, description = "search test")
		public void searchTest() {
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search']/input")).isDisplayed());
		}
	
}
