package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("User opens the application")
	public void user_opens_the_application() {
	
	}

	@When("User enters the valid product {string} into search field")
	public void user_enters_the_valid_product_into_search_field(String ValidProductText) {
	  
	}

	@And("User Clicks on search button")
	public void user_clicks_on_search_button() {

	}

	@Then("User should get valid product displayed in search list")
	public void user_should_get_valid_product_displayed_in_search_list() {
	 
	}

	@When("User enters the Invalid product {string} into search field")
	public void user_enters_the_invalid_product_into_search_field(String InvalidPorductText) {
	
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {

	}

	@When("User dont enter anything into search field")
	public void user_dont_enter_anything_into_search_field() {

	}

}
