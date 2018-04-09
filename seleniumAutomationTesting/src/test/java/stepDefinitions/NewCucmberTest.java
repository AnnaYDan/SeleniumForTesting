package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCucmberTest {

	WebDriver driver = new ChromeDriver();
	
	@Given("^I opened newtours page$")
	public void i_opened_newtours_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}

	@When("^I type a as username and a as a password$")
	public void i_type_a_as_username_and_a_as_a_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
	}

	@When("^click sign-in button$")
	public void click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("login")).click();
	}
	
	@Then("^I should get sign-off link$")
	public void i_should_get_sign_off_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}


}
