package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class LoginLogoutTest {

	// declare browser driver as a webdriver
	WebDriver driver = new ChromeDriver();

	// test with correct credentials by using data provider listed below
	@Test(dataProvider = "dpCorrectData")
	public void LogintestWithCorrectCredentials(String name, String password) {
		System.out.println("<<<<<<<<<<<<<<<< test is executing >>>>>>>>>>>>>>>>>>>");
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	// data provider for correct credentials
	@DataProvider
	public Object[][] dpCorrectData() {
		return new Object[][] { new Object[] { "b", "b" }, new Object[] { "c", "c" }, };
	}

	// running before executing test method with navigating to the web page
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(">>>>>>>>>>>>>>>>>> before test is executing");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	// running after executing test method with just printing about this fact
	@AfterMethod
	public void afterMethod() {
		System.out.println("<<<<<<<<<<<<<<<< after test finished");
	}

}
