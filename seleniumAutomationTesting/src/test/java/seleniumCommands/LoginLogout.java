package seleniumCommands;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import junit.framework.Assert;

public class LoginLogout {

	public static void main(String[] args)  {
		// automate login logout Travel Portal
		// System.setProperty("webdriver.chrome.driver", "/Users/anna/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open web site
		driver.get("http://newtours.demoaut.com/");
		// locate user name and send keys
		driver.findElement(By.name("userName")).sendKeys("a");
		// locate password and send keys
		driver.findElement(By.name("password")).sendKeys("a");
		// locate login button and click
		driver.findElement(By.name("login")).click();
		
		// optional click sign-off and close driver
		//driver.findElement(By.linkText("SIGN-OFF")).click();
		//driver.close();
		
		// an assertion using if-else condition
/*		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Find a Flight")) {
			System.out.println("Pass");
		}else {
			System.out.println(pageTitle);
		}*/
		
		//through assertion
		//Assert.assertTrue(pageTitle.contains("Find a Flight"));

		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		
	}

}
