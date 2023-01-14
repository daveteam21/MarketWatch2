package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;
	
	public String getTitle() {
		return driver.getTitle();
	}
}
