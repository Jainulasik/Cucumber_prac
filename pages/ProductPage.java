package org.pages;

import java.util.List;

import org.baseclass.BaseClas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClas {

	
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
			
	}
	
	
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement validate_login;
	public WebElement getValidate_login() {
		return validate_login;
	}

	@FindBy(xpath = "//div[@id='inventory_container']//div[@class='inventory_item']//button")
	private List<WebElement> addCarts;
	public List<WebElement> getAddCarts() {
		return addCarts;
	}
	
	@FindBy(xpath = "//*[@class='shopping_cart_badge']")
	private WebElement validate_carts;
	public WebElement getValidate_carts() {
		return validate_carts;
	}
	
	
	@FindBy(xpath= "//button[text()='Remove']")
	private List<WebElement>removeCart;
	public List<WebElement> getRemoveCart() {
		return removeCart;
	}
	
	@FindBy(xpath = "//*[text()='4']")
	private WebElement validate_4items;
	public WebElement getValidate_4items() {
		return validate_4items;
	}
	
	
	@FindBy(xpath = "//*[@class='shopping_cart_link']")
	private WebElement clickCart;
	public WebElement getClickCart() {
		return clickCart;
	}
	
	
}
	




	
	
	
	
	
		
	
	









	
