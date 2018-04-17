package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTest {

	WebDriver driver = new ChromeDriver();
	
	@Given("^I opened home page$")
	public void i_opened_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^I type username = a and password = a$")
	public void i_type_username_a_and_password_a() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
	}
	
	@When("^click Sign-In button$")
	public void click_Sign_In_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.name("login")).click();		
	}

	@Then("^I should get SIGN-OFF link$")
	public void i_should_get_SIGN_OFF_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		WebElement link = driver.findElement(By.linkText("SIGN-OFF"));
		Assert.assertTrue(link.isDisplayed());
	}

	@Then("^page title should have Find flight$")
	public void page_title_should_have_Find_flight() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	    String pageTitle = driver.getTitle();
	    Assert.assertTrue(pageTitle.contains("Find flight"));
	}

}
