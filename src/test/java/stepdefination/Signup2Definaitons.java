package stepdefination;

import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Signup2Page;

public class Signup2Definaitons {
	
	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {
		Signup2Page signuppage = new Signup2Page();
		signuppage.loadPage();
				
	}

	@When("I enter my {string}")
	public void i_enter_my_a_bc_gmail_com(String email) { 
		Signup2Page signup2page = new Signup2Page();
		BrowserHelper.driver.switchTo().frame(signup2page.iframe);
		signup2page.emailInput.sendKeys(email);
		
	}
	@When("click create an account")
	public void click_create_an_account() throws InterruptedException {
		Thread.sleep(2000);
		Signup2Page signup2page = new Signup2Page();
		signup2page.createButton.click();
	}
	@Then("I should see an error")
	public void i_should_see_an_error() {	
		Signup2Page signup2page = new Signup2Page();
			Assert.assertEquals(signup2page.errorMessage.getText(), "Please enter a valid email address.");
			
		}
	@Then("I should be on the signup page")
	public void i_should_be_on_the_signup_page() {
		Signup2Page signup2page = new Signup2Page();
			 Assert.assertEquals(signup2page.getTitle(), "Welcome - Learn About Member Benefits - MarketWatch - MarketWatch");
		}
		
	} 





	
