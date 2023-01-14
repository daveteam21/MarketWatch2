package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BrowserHelper;

public class LoginPage2 {

	WebDriver driver;

	@FindBy(id = "username")
	public WebElement usernameField;

	@FindBy(css = ".continue-submit.new-design.solid-button")
	public WebElement continueButton;

	@FindBy(id = "password-login-password")
	public WebElement passwordField;

	@FindBy(css = ".basic-login-submit.new-design.solid-button")
	public WebElement signInButton;


	public LoginPage2() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);
	
	}

	public void loadPage() {
		 Assert.assertEquals(BrowserHelper.driver.getTitle(), "Log In");
	/*
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://sso.accounts.dowjones.com/login-page?op=localop&scope=openid%20idp_id%20roles%20email%20given_name%20family_name%20djid%20djUsername%20djStatus%20trackid%20tags%20prts%20suuid%20createTimestamp&client_id=5hssEAdMy0mJTICnJNvC9TXEw3Va7jfO&response_type=code&redirect_uri=https%3A%2F%2Faccounts.marketwatch.com%2Fauth%2Fsso%2Flogin&nonce=128d2e84-caa2-481d-ab3e-05f0e820dae0&ui_locales=en-us-x-mw-11-8&ns=prod%2Faccounts-mw&state=Itc2Sd1nzsP3yXi8.CAnB8sJJ7cGZqZiuIRCcZLi_MVyA7u3a5YL87c22dhE&protocol=oauth2&client=5hssEAdMy0mJTICnJNvC9TXEw3Va7jfO#!/signin") {  // <- this way it will not reload the page twice. only if the url is not the same page>
		driver.get("https://sso.accounts.dowjones.com/login-page?op=localop&scope=openid%20idp_id%20roles%20email%20given_name%20family_name%20djid%20djUsername%20djStatus%20trackid%20tags%20prts%20suuid%20createTimestamp&client_id=5hssEAdMy0mJTICnJNvC9TXEw3Va7jfO&response_type=code&redirect_uri=https%3A%2F%2Faccounts.marketwatch.com%2Fauth%2Fsso%2Flogin&nonce=128d2e84-caa2-481d-ab3e-05f0e820dae0&ui_locales=en-us-x-mw-11-8&ns=prod%2Faccounts-mw&state=Itc2Sd1nzsP3yXi8.CAnB8sJJ7cGZqZiuIRCcZLi_MVyA7u3a5YL87c22dhE&protocol=oauth2&client=5hssEAdMy0mJTICnJNvC9TXEw3Va7jfO#!/signin");
	} */
	}
	}



