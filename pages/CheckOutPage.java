package org.pages;

import java.util.List;

import org.baseclass.BaseClas;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClas {


	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	private WebElement clickCheckout;
	public WebElement getClickCheckout() {
		return clickCheckout;
	}
	
	@FindBy(xpath = "//*[text()='Checkout: Your Information']")
	private WebElement validate_checkoutpage;
	public WebElement getValidate_checkoutpage() {
		return validate_checkoutpage;
	}
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalCode;
	public WebElement getPostalCode() {
		return postalCode;
	}
	
	@FindBy(id = "continue")
	private WebElement clickContinuee;
	public WebElement getClickContinuee() {
		return clickContinuee;
	}
	
	
	@FindBy(xpath = "//*[text()='Checkout: Overview']")
	private WebElement validate_chkoutoverview_page;
	public WebElement getValidate_chkoutoverview_page() {
		return validate_chkoutoverview_page;
	}
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private List<WebElement> cartProductList;
	public List<WebElement> getCartProductList() {
		return cartProductList;
	}
	
	@FindBy(id = "finish")
	private WebElement clickFinishElement;
	public WebElement getClickFinishElement() {
		return clickFinishElement;
	}
	
	
	@FindBy(xpath = "//*[text()='Thank you for your order!']")
	private WebElement validate_orderconformpageDispl;
	public WebElement getValidate_orderconformpageDispl() {
		return validate_orderconformpageDispl;
	}













}
