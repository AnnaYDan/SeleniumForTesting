package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appManager.TrainingPortalLogin;

public class ChooseMenuItem {

	public static void main(String[] args) {
		
		// declare browser driver
		WebDriver driver = new ChromeDriver();
		// using page object from appManager class
		TrainingPortalLogin login = new TrainingPortalLogin(driver);

		// navigiting to training portal page
		driver.get("http://www.training.qaonlinetraining.com/");
		
		// waitings
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		
		// locating web element with name Selenium
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu-item-52\"]/a"));
		
		// declaring class Action to use it for choosing from menu
		Actions action = new Actions(driver);

		// executing moving to Selenium link in menu
		action.moveToElement(menu).build().perform();
		// executing for moving down from Selelnium link
		action.moveByOffset(50, 120).perform();
		// adding such way of waiting because others doesn't work
		try {
			Thread.sleep(2000); // miliseconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// executing click action
		action.click().perform();
		
		// adding such way of waiting because others doesn't work
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// calling method from class TrainingPortalLogin in appManager package
		// login should be fail because of incorrect username and password
		login.loginAutoFill();

	}

}
