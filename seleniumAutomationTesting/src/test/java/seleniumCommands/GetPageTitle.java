package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetPageTitle {

	public static void main(String[] args) {
		
		// Selenium Browser Commands
		WebDriver driver = new ChromeDriver();
		
		// declare wait for FindElement(s) commands
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// open browser window and navigate to web page
		driver.get("http://newtours.demoaut.com/");
		
		// Retrieve page title
		String title = driver.getTitle();
		System.out.println("Web Page titile is >>>>>> " + title);
		System.out.println(driver.findElement(By.tagName("title")).getText());

		// check title with if-else condition
		if (title.contains("Welcome: Mercury Tours")) {
			System.out.println("I am on the right page");
		} else {
			System.out.println("I am on the wrong page");
		}
		
		// special way for assertion
		Assert.assertTrue(title.contains("Welcome: Mercury Tours"));
	}

}
