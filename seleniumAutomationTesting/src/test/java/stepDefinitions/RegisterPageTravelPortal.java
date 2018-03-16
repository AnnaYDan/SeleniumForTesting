package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageTravelPortal {

	// declare browser driver as webdriver
	WebDriver driver= new ChromeDriver();

	// equivalent code for cucumber file about navigating to travel portal registration page
	@Given("^user open registraion page \"(.*?)\"$")
	public void user_open_registraion_page(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);	
	}

	// equivalent code for cucumber file about filling common data to travel portal registration page
	@Given("^type correct data to registration form$")
	public void type_correct_data_to_registration_form(DataTable credencials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> data = credencials.asMaps(String.class, String.class);
		driver.findElement(By.name("firstName")).sendKeys(data.get(0).get("firstName"));
		driver.findElement(By.name("lastName")).sendKeys(data.get(0).get("lastName"));
		driver.findElement(By.name("phone")).sendKeys(data.get(0).get("phone"));
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.name("address1")).sendKeys(data.get(0).get("address"));
		driver.findElement(By.name("city")).sendKeys(data.get(0).get("city"));
		driver.findElement(By.name("state")).sendKeys(data.get(0).get("state"));
		driver.findElement(By.name("postalCode")).sendKeys(data.get(0).get("postalCode"));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("userName"));	
		}

	// equivalent code for cucumber file about typing password and its confirmation which are passing from cucumber feature file
	@When("^user type password \"(.*?)\" and confirm password  \"(.*?)\"$")
	public void user_type_password_and_confirm_password(String pass, String confirm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirm);
		}

	// equivalent code for cucumber file about clicking submit button
	@When("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("register")).click();
	}

	// equivalent code for cucumber file about checking expecting and actual results
	@Then("^user should see this \"(.*?)\"$")
	public void user_should_see_this(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getCurrentUrl().contains(url));
		driver.quit();
		}
	
}
