package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.BrowserHelper;

public class Signup2Page {
	WebDriver driver;

	@FindBy(xpath = "//iframe[@class=\"iframe\"]")
	public WebElement iframe;
	 	
	@FindBy(id = "email")
	public WebElement emailInput;
	
	@FindBy (css = ".free-register-button-newreg-mw-home")
	public WebElement createButton;

	//@FindBy(xpath = "//*class=\"button-mw-newreg\"]/button")
	//public WebElement createButton;

	@FindBy(xpath ="//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/label[2]")
	public WebElement errorMessage;
	
//	@FindBy(xpath = "//label{@class=\"error\"]")
//	public WebElement errorMessage;

	public Signup2Page() {  //<- second correct construction 
		driver = BrowserHelper.driver;   //  
		PageFactory.initElements(driver, this); // Third initialize elements so 
	}

	public void loadPage() {
			driver.get("https://www.marketwatch.com/sign-up");
		}
	public String getTitle() {
		return driver.getTitle();
	}
	}
  
