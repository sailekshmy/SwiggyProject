package com.swiggy.testscripts;

import java.util.ArrayList;

import org.testng.Assert;

import com.swiggy.pages.RestaurantList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver {

	@Given("user is in the landing page of swiggy")
	public void user_is_in_the_landing_page_of_swiggy() {
		Assert.assertEquals(driver.getTitle(),"Order food online from India's best food delivery service. Order from restaurants near you" );
	}

	        
	@When("user clicks on  {string} hyperlink")
	public void user_clicks_on_hyperlink(String string) {
		landingPage.searchBangalorelocn();
	}

	@When("click on search bar")
	public void click_on_search_bar() {
		restaurantList.clickLocn();
	}

	@When("enter {string} restaurant on search bar")
	public void enter_restaurant_on_search_bar(String string) {
		restaurantList.searchLocation();
	}

	@When("hover over {string} and click")
	public void hover_over_and_click(String BTM) {
		restaurantList.enterLocation(BTM);
		restaurantList.clickBTM();
	}

		@When("Click on the first restaurant on the next page")
	public void click_on_the_first_restaurant_on_the_next_page() {
		firstRestaurantPage.clickFirstRestaurant();
	}

	@When("Click {string} on the first item of the restaurant page")
	public void click_on_the_first_item_of_the_restaurant_page(String string) {
		addItemPage.addToCart();
		}

	@When("Click {string} button")
	public void click_button(String string) {
		addItemPage.clkCheckout();
	}

	@Then("Verify you are on Checkout page by verifying the text ‘SECURE CHECKOUT’.")
	public void verify_you_are_on_checkout_page_by_verifying_the_text_secure_checkout() {
		String expectedMsg = "SECURE CHECKOUT";
        String actualMsg = confirmationPage.confirmationMsg();
        Assert.assertEquals(actualMsg, expectedMsg);		}
	
}
