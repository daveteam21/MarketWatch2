/*package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LoginDefinations {
	
	@Given(" I am on the  homepage")
	public void goToHomePage() {
	HomePage homepage = new HomePage ();
	homepage.loadPage();
	
	// you dont need this anymore -> BrowserHelper.driver.get("https://www.marketwatch.com/");
		
		//WebElement overlayCloseButton =BrowserHelper.driver.findElement(By.className("close-btn"));
		//overlayCloseButton.click();
	
}

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		HomePage homepage = new HomePage();
		homepage.profileIcon.click(); 
		homepage.loginLink.click();

		
		//WebElement profileIcon = BrowserHelper.driver.findElement(By.cssSelector(".logged-out.profile"));
		//profileIcon.click();
    	//WebElement loginLink = BrowserHelper.driver.findElement(By.linkText("Log In"));
		//loginLink.click();

	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		WebElement username = BrowserHelper.driver.findElement(By.id("username"));
		username.sendKeys("mytalentech@gmail.com");
		WebElement continueButton = BrowserHelper.driver.findElement(By.cssSelector(".continue-submit.new-design.solid-button"));
		continueButton.click();
		WebElement password = BrowserHelper.driver.findElement(By.id("password-login-password"));
		password.sendKeys("tatentech123");
		WebElement signInButton = BrowserHelper.driver.findElement(By.cssSelector(".basic-login-submit.new-design.solid-button"));
		signInButton.click();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {

		WebElement profileIcon = BrowserHelper.driver.findElement(By.cssSelector(".logged-out.profile"));
		profileIcon.click();
		WebElement username = BrowserHelper.driver.findElement(By.cssSelector("profile--name"));
		Assert.assertEquals(username.getText(), "Talent Tech1");
	}

} 

*/
