package com.stepdefinition;

import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pomgreen.Page_object_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {

	Page_object_manager pom = new Page_object_manager(driver);

	@Given("User Launch the url")
	public void user_launch_the_url() throws InterruptedException {
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);

	}

	@When("User Click the add to cart button\\(beetroot)")
	public void user_click_the_add_to_cart_button_beetroot() throws InterruptedException {
		pom.getPomPage01().getBeetroot().click();
		Thread.sleep(2000);

	}

	@When("User Click the add to cart button\\(carrot)")
	public void user_click_the_add_to_cart_button_carrot() throws InterruptedException {
		pom.getPomPage01().getBrinjal().click();
		Thread.sleep(2000);

	}

	@When("User Click the items")
	public void user_click_the_items() throws InterruptedException {
		pom.getPomPage01().getItems().click();
		Thread.sleep(2000);
	}

	@When("User Click the Proceed to CheckOut")
	public void user_click_the_proceed_to_check_out() throws InterruptedException {
		pom.getPomPage01().getcheckout().click();
		Thread.sleep(2000);

	}

	@Then("Next page shown")
	public void next_page_shown() throws InterruptedException {
		Thread.sleep(2000);
		
	}
	@When("User enter promo code")
	public void user_enter_promo_code() {
		pom.getPomPage02().getPromo().sendKeys("abcd");
		
	}
	@When("User click the apply botton")
	public void user_click_the_apply_botton() {
		pom.getPomPage02().getPromo().click();
		
	}
	@When("User Click the Place Order")
	public void user_click_the_place_order() {
		pom.getPomPage02().getPlaceorder().click();
		
	}
	@Then("Next Page Shown1")
	public void next_page_shown1() {
	}
	
		@When("User Select the Country")
		public void user_select_the_country() throws InterruptedException {
			Select s = new Select(pom.getPomPage03().getCountry());
		    s.selectByValue("India");
		    Thread.sleep(2000);
		   	
		}
		@When("User Click the Agree button")
		public void user_click_the_agree_button() {
			pom.getPomPage03().getCheckbox().click();
			
			
		}
		@When("User Click the Proceed")
		public void user_click_the_proceed() throws InterruptedException {
			 pom.getPomPage03().getProceed().click();
			 Thread.sleep(2000);
		
             Thread.sleep(2000);
             quit();
		}

	}

	

	

