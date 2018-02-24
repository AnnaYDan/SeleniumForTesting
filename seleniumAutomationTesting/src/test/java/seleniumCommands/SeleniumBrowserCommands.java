package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumBrowserCommands {

	public static void main(String[] args) {
		// Selenium Browser Commands
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//drivet.get is to open browser window
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		
//check title with if-else condition
		if (title.contains("Welcome: Mercury Tours")) {
			System.out.println("I am on the right page");
		}else {
			System.out.println("I am on the wrong page");
		}
//special way for assertion		
		Assert.assertTrue(title.contains("Welcome: Mercury Tours"));
		System.out.println(title);
	}

}
