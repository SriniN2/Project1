package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch (String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static void browserLaunch1 (String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}			
	}
		
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}
	
	public static void urlLaunch (String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitlyWait (long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	
	public static void sendKeys (WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void click (WebElement e) {
		e.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static String currentUrl () {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title () {
		String title = driver.getTitle();
		return title;
	}
	
	public static String getAttribute (WebElement e) {
		String att = e.getAttribute("value");
		return att;
	}
	
	public static void moveToElement (WebElement target) {
		Actions a = new Actions (driver);
		a.moveToElement(target).perform();
	}
	
	public static void selectByIndex (WebElement e, int index) {
		Select s = new Select (e);
		s.selectByIndex(index);
	}
	
	
	
	
	
	
	
	
}


