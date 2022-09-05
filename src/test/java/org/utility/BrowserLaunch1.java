package org.utility;

public class BrowserLaunch1 extends BaseClass{
	
	public static void main(String[] args) {
		
		browserLaunch ("chrome");
		urlLaunch ("https://www.facebook.com/");
		maximize();
		implicitlyWait(10);
		
		LoginPage l=new LoginPage();
		
		sendKeys(l.getTxtUsername(), "Srini");
		sendKeys(l.getTxtPassword(), "12345");
		
		driver.navigate().refresh();
		
		sendKeys(l.getTxtUsername(), "Kumaran");
		sendKeys(l.getTxtPassword(), "12345");
		click(l.getBtnLogin());
		
		
		
		
		
	}

}
