package org.pages;

import org.baseclass.BaseClas;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClas{

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "user-name")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id="password")
	private WebElement passWord;
	public WebElement getPassWord() {
		return passWord;
	}
	
	
	@FindBy(id = "login-button")
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	@FindBy(xpath = "//*[text()='Swag Labs'])[2]")
	private WebElement validateLogin;
	public WebElement getValidateLogin() {
		return validateLogin;
	}
		
	}
	

