package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstTest {

	WebDriver driver = new ChromeDriver();
	
	@Given("^I am on tralev portal homepage \"([^\"]*)\"$")
	public void i_am_on_tralev_portal_homepage(String url) throws Throwable {
		driver.get(url);
	}

	@When("^I type username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_type_username_and_password(String name, String pass) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("^click Sign-in button$")
	public void click_Sign_in_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^link \"([^\"]*)\" should be displayed$")
	public void link_should_be_displayed(String link) throws Throwable {
		Assert.assertTrue(driver.findElement(By.linkText(link)).isDisplayed());
		//Assert.assertTrue(true);
	}
}
