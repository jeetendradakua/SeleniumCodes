package Seleniumsessions;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		//Xpath : address of the element inside DOM
		// HTMLtag [@attr='value']
		// eg. //input[@id='input-email']  (faster)
		//*[@id='input-email'] 
		
		//*: all the atrr avails : //*[@id]
				//*[@id='input-email']
		
		//input[@id]
		//input[@type = 'submit']
		
		//htmltag[@attr1='value'and@attr2='value']
		//placeholder(watermark in text field)
		
		// dynamic ids :
		// <input id = "test_123">
		// <input id = "test_456>
		// <input id = "test_785">

		
		//contains():
		//htmltag[contains(@attr,'value')]
        //input[contains(@id,'test_')]'
		
		//contains() with multiplt attributes :
		//htmltag[contains(@attr1,'value')and contains(@attr2,'value')]
		//input[contains(@id,'mail'] and contains(@name,'email')]
		//input[contains(@id,'mail'] and contains(@name,'email') and contains(@placeHolder,'email')]
		
		//one attr with contains and one without contains
		//input[contains(@id,'mail'] and @type ='text']
		//input[contains(@id,'mail'] and contains(@name,'email')]
		
		
		//text():
		//htmltag[text()='value']
		//a[text()='MyAccount']
		//h2[text()='Returning Customer']
		
		
		
		
		//text() and @attr
		//html[text()='value' and @attr='value']
		//a[text()='Buy Again' and @data-csa-c-content-id='nav_cs_buy_again']
		
		
		//contains() with text ():
		//htmltag[contains
		
		
	
		
	}

}
