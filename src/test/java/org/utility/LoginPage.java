package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
//	private WebElement getTextUserName() {
//		WebElement txtUsername = driver.findElement(By.id("email"));
//		return txtUsername;
//	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "email")
	private WebElement txtUsername;
	
	@FindBy (id = "pass")
	private WebElement txtPassword;
	
	@FindBy (name = "login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
	
	}

	
	
	
	


