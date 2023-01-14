/*package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupDefinations {
	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {
		BrowserHelper.driver.get("https://www/marketwatch.com/sign-up");
	
	}
//	I enter my abc@gmail  
//  I enter my a bc@gmail.com 
//	I enter my#$$@gmail.com 
	
	@When("I enter my {String}")
	public void i_enter_my_a_bc_gmail_com(String email) {  //<- String email because it run as a text 
	//	System.out.println(email); <- check to see how email runs
		WebElement iframe = BrowserHelper.driver.findElement(By.xpath("//iframe[@class=\"ifame\"]"));
		BrowserHelper.driver.switchTo().frame(iframe);
		WebElement emailInput = BrowserHelper.driver.findElement(By.id("email"));
		emailInput.sendKeys(email);
}
	@When("click create an account")
	public void click_create_an_account() throws InterruptedException {
		WebElement createButton = BrowserHelper.driver.findElement(By.xpath("BrowserHelper"));
		createButton.click();
		Thread.sleep(2000); // <-- Slow down the click
	}
		@Then("I should see an error")
		public void i_should_see_an_error() {
			WebElement errorMessage = BrowserHelper.driver.findElement(By.xpath("//*[@class=*button-mw-newreg\"]/button"));
			errorMessage.getText();
			Assert.assertEquals(errorMessage.getText(), "asfsf");
		}
		@Then("I should be on the signup page")
		public void i_should_be_on_the_signup_page() {
			// Assert.assertEquals(BrowserHelper.driver.getCurrentUrl());
			 Assert.assertEquals(BrowserHelper.driver.getTitle(), "MarketWatch: Stock Market News - Financial News - MarketWatch");
		}
	}
	   */