package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumScript {

	public static void main(String[] args) {

		// declare browser driver
		WebDriver driver = new ChromeDriver();
		// waiting for FindElement(s) commands
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// navigating to web page
		driver.get("http://newtours.demoaut.com/");
		// variable for user name field
		WebElement uName = driver.findElement(By.name("userName"));
		// clean user name field
		uName.clear();
		// type in user name field
		uName.sendKeys("a");
		// variable for password field
		WebElement pwd = driver.findElement(By.name("password"));
		// clean password field
		pwd.clear();
		// type in password field
		pwd.sendKeys("a");
		// locate Sign-in button and click
		driver.findElement(By.name("login")).click();
		
		// getting page title and assert with if-else condition: is it displaying or not
		WebElement link = driver.findElement(By.linkText("SIGN-OFF"));
		if (link.isDisplayed()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// close all browser windows under automation 
		driver.quit();

	}

}
