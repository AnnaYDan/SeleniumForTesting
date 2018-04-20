package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewNewTest {

	WebDriver driver = new ChromeDriver();
	
	@Given("^a user navigate to travel portal home page with url \"([^\"]*)\"$")
	public void a_user_navigate_to_travel_portal_home_page_with_url(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.get(url);
	}

	@When("^a user type username = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void a_user_type_username_and_password(String name, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("^a user click Sign-In button$")
	public void a_user_click_Sign_In_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		driver.findElement(By.name("login")).click();
	}

	@Then("^a user should get \"([^\"]*)\" link$")
	public void a_user_should_get_link(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Assert.assertTrue(driver.findElement(By.linkText(link)).isDisplayed());
	}

	@Then("^and see as a page title \"([^\"]*)\"$")
	public void and_see_as_a_page_title(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains(expectedTitle));
	}


}
