package testingFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {

	WebDriver driver = new ChromeDriver();

	@Test(dataProvider = "dpCorrectData")
	public void LogintestWithCorrectCredentials(String name, String password) {
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

	@DataProvider
	public Object[][] dpCorrectData() {
		return new Object[][] { new Object[] { "a", "a" }, new Object[] { "b", "b" }, };
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(">>>>>>>>>>>>>>>>>> before test is executing");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("<<<<<<<<<<<<<<<< after test finished");		
	}

}
