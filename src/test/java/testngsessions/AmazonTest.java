package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
     

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test
	public void searchTest() {
		driver.get("https://www.amazon.com");
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}

	
	
}
