package PracticeSeleniumSessions;

public class CustomXpath {

	//xpath : address of the element inside DOM
	
	//htmltag[@attr='value']
	
	//input[@id='input-email']
	//input[@id]  --> all the input tags with id attribute 
	
	//input[@type='submit']
	
	//input[@type='submit' or @value='Login']  --> and/or works with x path
	//input[@type='submit' and @value='Login']
	
	//input[@placeholder='E-Mail Address']
	
	//*[@id]  --> *(astrik) use to get all the elements which have id attr
	//*[@id='input-email'] --> slower 
	//input[@id='input-email'] --> faster
	
	/*
 	<input id= "test_123">
	<input id= "test_456">
	<input id= "test_786">
	*/
	
	//contains():
	//htmltag[contains(@attr,'val']
	
	//input[contains(@id,'email')]
	
	//contains() with multiple attr:
	
	//htmltag[contains(@attr1,'val1')and contains(@attr2,'val2')]
	//input[contains(@id,'email') and contains(@placeholder,'E-Mail Address')]
	
	//input[contains(@id,'email') and @type ='text']
	
	//input[ @type ='text' and contains(@id,'email') ]
	
	//input[contains(@id,'input-password')]
	
	//text():
	
	//htmltag[text()='value']
	
	//a[text()='My Account']
	//h2[text()='Returning Customer']
	
	
	//text() and @attr
	//htmltag[text()='val' and @attr='value']
	//a[text()='Registry' and @data-csa-c-content-id = 'nav_cs_registry']
	//span[text()='Popular products in Wireless internationally']
	
	//span[contains(text(),'Wireless internationally') ]
	
	
	//start-with
	//htmltag[starts-with(text(),'value')]
	//a[starts-with(text(),'Amazon')]
	//a[starts-with(text(),'Gifts')]
	//input[starts-with(@class,'form')]
	
	
	
	//ends-with
	//not there in xpath 
	
	//indexing
//	(//htmltag[@attr='value'])[number] -->
//	(//htmltag[@attr='value'])[position()=number]
//	(//input[@class='form-control'])[2]
//	(//input[@class='form-control'])[1]
//	(//input[@class='form-control'])[position()=1]
	
//  (//div[@class='navFooterLinkCol navAccessibility'])[3]	
	
//  (//div[@class='navFooterLinkCol navAccessibility'])[1]//a --> captured all the links available in the first div	
//	(//div[@class='navFooterLinkCol navAccessibility'])[4]//a --> captured all the links available in the fourth div	
	
//last():	
//	(//input[@type='text' or @type='email' or @type='tel' or @ type='password'])[last()]
//	(//input[@type='text' or @type='email' or @type='tel' or @ type='password'])[last()-1]
//	(//input[@type='text' or @type='email' or @type='tel' or @ type='password'])[last()-2]
//	((//div[@class='navFooterLinkCol navAccessibility'])[4]//a)[last()]
//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
//	((//div[@class='navFooterLinkCol navAccessibility'])[last()-1]//a)[last()]
//	(//a[starts-with(text(),'Amazon')])[last()-1]
	
	//parents to child:
	
//	(//div[@class='form-group'])[1]/input[contains(@id,'email')]
	// single slash '/' --> direct child element
	// double slash '//'--> direct + indirect 
	//child::htmltag
	//div[@class='private-form__input-wrapper']/child::input
	
	// child to parent:
	
	//input[@id='username']/../../../../../../../../../.. -->child to parent backward traversing
	//input[@id='username']/parent::div--> to reach at the immediate parent
	//input[@id='username']/ancestor::div --> to give all the div(grand parents)
}
