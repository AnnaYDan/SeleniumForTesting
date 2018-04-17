package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageTravelPortal {

	// declare browser driver as webdriver
	WebDriver driver = new ChromeDriver();
	
	// equivalent code for cucumber file about navigating to travel portal home page
	@Given("^I am on at newtours homepage \"(.*?)\"$")
	public void i_am_on_at_newtours_homepage(String url) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get(url);
	}

	// equivalent code for cucumber file about typing user name and password which are passing from cucumber feature file
	@When("^I insert username = \"(.*?)\" and password =\"(.*?)\"$")
	public void i_insert_username_and_password(String name, String pass) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	// equivalent code for cucumber file about clicking login button
	@When("^click login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	// equivalent code for cucumber file about checking expecting and actual results
	@Then("^\"(.*?)\" link should be displayed$")
	public void link_should_be_displayed(String link) throws Throwable {
		String check = driver.findElement(By.linkText(link)).getText();
		Assert.assertTrue(driver.findElement(By.linkText(link)).isDisplayed());
		if (check.contains("SIGN-OFF")) driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.quit();
	}
	
}
