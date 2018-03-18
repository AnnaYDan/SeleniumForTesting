package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneScriptForBrowsers {

	public static void main(String[] args) {

		// declare Chrome driver
		WebDriver driver = new ChromeDriver();
		// declare Firefox driver
		WebDriver driverF = new FirefoxDriver();
		// declare Edge driver
		WebDriver driverME = new EdgeDriver();
		
		// applying waiting for each driver
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverF.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverME.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navigating to web site in each browser
		driver.get("http://newtours.demoaut.com/");
		driverF.get("http://newtours.demoaut.com/");
		driverME.get("http://newtours.demoaut.com/");
		
		// store user name web element as variable in each browser
		WebElement uName = driver.findElement(By.name("userName"));
		WebElement uNameF = driverF.findElement(By.name("userName"));
		WebElement uNameME = driverME.findElement(By.name("userName"));

		// clean and type user name in each browser
		uName.clear();
		uName.sendKeys("a");
		uNameF.clear();
		uNameF.sendKeys("a");
		uNameME.clear();
		uNameME.sendKeys("a");
		
		// locate, clean and type password in each browser
		driver.findElement(By.name("password")).sendKeys("a");
		driverF.findElement(By.name("password")).sendKeys("a");
		driverME.findElement(By.name("password")).sendKeys("a");

		// locate and click sign-in button in each browser
		driver.findElement(By.name("login")).click();
		driverF.findElement(By.name("login")).click();
		driverME.findElement(By.name("login")).click();

		// assert in Chrome
		if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			System.out.println("Page title in Chrome for pass block >>>>> " + driver.getTitle());
			System.out.println("Chrome Pass");
		} else {
			System.out.println("Page title in Chrome for fail block >>>>> " + driver.getTitle());
			System.out.println("Chrome Fail");
		}

		// assert in FireFox
		if (driverF.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			System.out.println("Page title in Firefox for pass block >>>>> " + driver.getTitle());
			System.out.println("Firefox Pass");
		} else {
			System.out.println("Page title in Firefox for fail block >>>>> " + driver.getTitle());
			System.out.println("Firefox Fail");
		}

		// assert in Edge
		if (driverME.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			System.out.println("Page title in Edge for pass block >>>>> " + driver.getTitle());
			System.out.println("Edge Pass");
		} else {
			System.out.println("Page title in Edge for fail block >>>>> " + driver.getTitle());
			System.out.println("Edge Fail");
		}
		
		// close all browsers
		driver.quit();
		driverF.quit();
		driverME.quit();
		
	}

}
