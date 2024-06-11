package org.pages;

import org.baseclass.BaseClas;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends BaseClas {


	public LogOutPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[text()='Back Home']")
	private WebElement clickBackHome;
	public WebElement getClickBackHome() {
		return clickBackHome;
	}
	
	@FindBy(xpath = "//*[text()='Open Menu']")
	private WebElement openMenu;
	public WebElement getOpenMenu() {
		return openMenu;
	}
	
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}
	
	@FindBy(xpath = "//*[@class='login_wrapper']")
	private WebElement validate_logout;
	public WebElement getValidate_logout() {
		return validate_logout;
	}
	}

    




