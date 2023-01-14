package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BrowserHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

	@BeforeAll
	public static void before_all() {
		BrowserHelper.setupDriver();
		BrowserHelper.driver.get("https://www.marketwatch.com/");
		try {
			WebElement overlayCloseButton = BrowserHelper.driver.findElement(By.className("close-btn"));
			overlayCloseButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterAll
	public static void after_all() {
		BrowserHelper.driver.close();
	}

	@After("@iframe") // <- With @iframe tag it will switch back to the main frame.
	public void switchToDefaultContent() {
		BrowserHelper.driver.switchTo().defaultContent();

	}

}
