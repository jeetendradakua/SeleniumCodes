package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcepts {

	//avoid dependency in tests 
	// test cases -- should independent to each other
	
	@Test
	public void loginTest() {
		System.out.println(" LoginPage test");
	 int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("HomePage test");
	
	 int i=9/0;
	}
	
	
	
	@Test(dependsOnMethods = {"loginTest","homePageTest"})
	public void SearchPageTest() {
		System.out.println("Search Pagetest");
	}
	
}
