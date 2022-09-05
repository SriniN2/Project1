package org.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass{
	
	public static void main(String[] args) {
		
		browserLaunch ("chrome");
		urlLaunch ("https://www.facebook.com/login/");
		maximize();
		implicitlyWait(10);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Sri");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("12345");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
