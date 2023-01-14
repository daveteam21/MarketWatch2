package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomePage {

	WebDriver driver;

	@FindBy(css = ".profile") // <- need to declare it
	public WebElement profileIcon;
	// public WebElement profileIcon =
	// driver.findElement(By.cssSelector(".logged-out.profile"));

	@FindBy(linkText = "Log In")
	public WebElement loginLink;
	// public WebElement loginLink = driver.findElement(By.linkText("Log In"));

	// public WebElement profileIcon =
	// BrowserHelper.driver.findElement(By.cssSelector(".logged-out.profile"));
	// public WebElement loginLink =
	// BrowserHelper.driver.findElement(By.linkText("Log In"));

	@FindBy(css = ".profile--name")
	public WebElement username;
	
	public HomePage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); // <- use this in a same class name>
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.marketwatch.com/") {  // <- this way it will not reload the page twice. only if the url is not the same page>
			driver.get("https://www.marketwatch.com/");
		}
	}
}
