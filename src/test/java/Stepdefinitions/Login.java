package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;	
@Given("User navigates to login page")
public void User_navigates_to_login_page() {
	driver =Driverfactory.getdriver();
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.linkText("Login")).click();	
}

@When("User has enters valid email address {string} into email field")
public void User_has_enters_valid_email_address_into_email_field(String emailText) {
	driver.findElement(By.id("input-email")).sendKeys(emailText);
}

@And("User has enters valid passowrd {string} into passoword field")
public void User_has_enter_valid_passowrd_into_passoword_field(String passwordText) {
	driver.findElement(By.id("input-password")).sendKeys("passwordText");
}

@And("User clicks on Login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//input[@value='Login']")).click();  
}

@Then("User should get successfully logged in")
public void user_should_get_successfully_logged_in() {
	Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed()); 
}
 
@When("User has enters Invalid email address {string} into email field")
public void user_has_enters_invalid_email_address_into_email_field(String InvalidemailText) {
	driver.findElement(By.id("input-email")).sendKeys("InvalidemailText");
   
}

@When("User has enters Invalid passowrd {string} into passoword field")
public void user_has_enters_invalid_passowrd_into_passoword_field(String InvalidpassowrdText) {
	driver.findElement(By.id("input-password")).sendKeys("InvalidpasswordText");
}

@Then("User should get proper warning message about invalid credentials")
public void user_should_get_proper_warning_message_about_invalid_credentials() {
 Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password")); 
}

@When("User has to dont enters any email address into email field")
public void user_has_to_dont_enters_any_email_address_into_email_field() {
	driver.findElement(By.id("input-email")).sendKeys("");
}

@When("User has to dont enters any passowrd into passowrd field")
public void user_has_to_dont_enters_any_passowrd_into_passowrd_field() {
	driver.findElement(By.id("input-password")).sendKeys(""); 
}
}