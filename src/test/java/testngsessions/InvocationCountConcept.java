package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void loginTest() {
		System.out.println(" LoginPage test");
	   
	}
	
	
	@Test(invocationCount = 7, priority = 1)
	public void homePageTest() {
		System.out.println(" HomePage test");
	   
	}
	
	
	
	
}
