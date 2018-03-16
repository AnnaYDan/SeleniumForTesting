package appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPortalLogin {

	// declare webdriver 
	WebDriver driver;

	// declare that we are using page factory
	public TrainingPortalLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// locator for WebElements on login page
	@FindBy(id = "user_login") public WebElement uName;
	@FindBy(id = "user_pass") public WebElement password;
	@FindBy(id = "wp-submit") public WebElement signIn;
	
	// method for logging on training portal
	public void loginAutoFill() {
		uName.sendKeys("training@infotek-solutions.com");
		password.sendKeys("training@infotek-solutions.com");
		signIn.click();
	}
	
}
