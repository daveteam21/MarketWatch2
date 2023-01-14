package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage2;

public class Login2Definations {


	@Given("I am on the  homepage")
	public void i_am_on_the_homepage() {
	HomePage homepage = new HomePage ();
	homepage.loadPage();
	
}

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		HomePage homepage = new HomePage();
		homepage.profileIcon.click(); 
		homepage.loginLink.click();

	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		LoginPage2 loginpage2 = new LoginPage2();
		loginpage2.usernameField.sendKeys("milk12@gmail.com");
		loginpage2.continueButton.click();
		loginpage2.passwordField.sendKeys("1qazXSW@3");
		loginpage2.signInButton.click();

	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() throws InterruptedException {
	HomePage homepage = new HomePage();
	homepage.profileIcon.click();
	Thread.sleep(1000);
		Assert.assertEquals(homepage.username.getText(), "MILK GODD");
		

	}
}
