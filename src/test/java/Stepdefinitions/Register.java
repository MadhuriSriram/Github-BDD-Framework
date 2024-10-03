package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Given("User navigates to Register page")
	public void user_navigates_to_register_page() {
	  driver=Driverfactory.getdriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@When("User enters the below details into mandatory fields of registration page")
	public void user_enters_the_below_details_into_mandatory_fields_of_registration_page(DataTable dataTable) {
	  
	}

	@And("User selects privacy policy")
	public void user_selects_privacy_policy() {
	}

	@And("User clicks on continue button")
	public void user_clicks_on_continue_button() {

	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	 
	}

	@And("User selects Yes for newsletter")
	public void user_selects_yes_for_newsletter() {
	  
	}

	@When("User dont enter any details")
	public void user_dont_enter_any_details() {
	 
	}

	@Then("Proper warning messgae should displayed")
	public void proper_warning_messgae_should_displayed() {
	    
	}

}
