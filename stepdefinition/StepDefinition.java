package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClas;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.CheckOutPage;
import org.pages.LogOutPage;
import org.pages.LoginPage;
import org.pages.ProductPage;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClas{


	public static BaseClas base = new BaseClas();
	public static WebDriver driver;

	// LOGIN PAGE

	@Given("User is in login page")
	public void user_is_in_login_page() throws IOException {

		browserLaunch("chrome");
		urlLaunch(base.readExcel(1, 2));

	}


	@When("User enter the username")
	public void user_enter_the_username() throws IOException {
		LoginPage log = new LoginPage();
		WebElement userName = log.getUserName();
		sendText(userName, base.readExcel(1, 0));


	}

	@When("User enter the password")
	public void user_enter_the_password() throws IOException {
		LoginPage log = new LoginPage();

		WebElement passWord = log.getPassWord();
		sendText(passWord, base.readExcel(1, 1));
	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		LoginPage log = new LoginPage();
		WebElement loginbutton = log.getLoginbutton();
		buttonClick(loginbutton);

		System.out.println("SUCCESSFULLY FINISHED LOGIN PAGE");


	}

	// PRODUCT PAGE

	@Given("User clicked Add to cart for six items")
	public void user_clicked_add_to_cart_for_six_items() {

		ProductPage pro = new ProductPage();
		List<WebElement> addCarts = pro.getAddCarts();
		for (int i=0; i<6; i++) {
			addCarts.get(i).click();
		}
	}

	@When("User Removed two items of six From carts")
	public void user_removed_two_items_of_six_from_carts() {
		ProductPage pro = new ProductPage();
		List<WebElement> removeCart = pro.getRemoveCart();
		for (int i=0; i<2; i++) {
			removeCart.get(i).click();
		}
	}


	@Then("User click the Cart icon")
	public void user_click_the_cart_icon() {
		ProductPage pro = new ProductPage();
		WebElement clickCart = pro.getClickCart();	
		buttonClick(clickCart);

		System.out.println("SUCCESSFULLY FINISHED PRODUCT PAGE");
	}


	//CHECKOUT PAGE


	@Given("User click checkout option")
	public void user_click_checkout_option() {

		CheckOutPage page = new CheckOutPage();
		WebElement clickCheckout = page.getClickCheckout();
		buttonClick(clickCheckout);
	}

	@When("User enter firstname")
	public void user_enter_firstname() {
		CheckOutPage page = new CheckOutPage();
		WebElement firstName = page.getFirstName();
		sendText(firstName, "ASIK");

	}

	@When("User Enter lastname")
	public void user_enter_lastname() {
		CheckOutPage page = new CheckOutPage();
		WebElement lastName = page.getLastName();
		sendText(lastName, "JAINUL");
	}

	@When("User Enter postal code")
	public void user_enter_postal_code() {

		CheckOutPage page = new CheckOutPage();
		WebElement postalCode = page.getPostalCode();
		sendText(postalCode, "526982");
	}

	@When("User click continue button")
	public void user_click_continue_button() {
		CheckOutPage page = new CheckOutPage();

		WebElement clickContinuee = page.getClickContinuee();
		clickk(clickContinuee);
	}

	@Then("User click the Finish option")
	public void user_click_the_finish_option() {
		CheckOutPage page = new CheckOutPage();
		WebElement clickFinishElement = page.getClickFinishElement();	
		buttonClick(clickFinishElement);

		System.out.println("SUCCESSFULLY FINISHED CHECKOUT PAGE");

	}



	//LOGOUT PAGE

	@Given("User Click the Open menu icon in left corner")
	public void user_click_the_open_menu_icon_in_left_corner() {

		LogOutPage out = new LogOutPage();
		WebElement openMenu = out.getOpenMenu();
		clickk(openMenu);
	}


	
	@When("User clicked the logout button")
	public void user_clicked_the_logout_button() {
		LogOutPage out = new LogOutPage();
		WebElement logOut = out.getLogOut();
		implicitwait(2000);
		clickk(logOut);
		
		System.out.println("SUCCESSFULLY FINISHED LOGOUT PAGE");

	}









}


























