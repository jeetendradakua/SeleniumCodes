package PracticeSeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil ();
		br.launchBrowser("chrome");
		br.launchUrl("https://www.amazon.com");
		String title = br.getPageTitle();
		System.out.println(title);
		if(title.contains("amazon")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		System.out.println(br.getPageUrl());
		br.closeTheBrowser();
	}

}
