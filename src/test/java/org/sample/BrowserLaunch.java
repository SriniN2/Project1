package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		//Browser Launch
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//url launch
		driver.get("https://www.facebook.com/login/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Sri");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("12345");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
