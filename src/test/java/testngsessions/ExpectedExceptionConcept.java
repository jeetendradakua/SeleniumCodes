package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	
	String name;
	
	
	
	
	
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	//(expectedExceptions = Exception.class)
	public void loginTest() {
		System.out.println(" LoginPage test");
	    int i=9/0;
	 	ExpectedExceptionConcept obj =  null ;
	 	obj.name="tom";
	}
	
	
	
}
