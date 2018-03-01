package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FirstSeleniumScript2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriver driverF = new FirefoxDriver();
		//WebDriver driverO = new OperaDriver();
		System.setProperty("webdriver.edge.driver", "C:/Users/TOSHIBA/Downloads/edgedriver/MicrosoftWebDriver.exe");
		WebDriver driverME = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverF.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driverO.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverME.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/");
		driverF.get("http://newtours.demoaut.com/");
		//driverO.get("http://newtours.demoaut.com/");
		driverME.get("http://newtours.demoaut.com/");

		WebElement uName = driver.findElement(By.name("userName"));
		WebElement uNameF = driverF.findElement(By.name("userName"));
		//WebElement uNameO = driverO.findElement(By.name("userName"));
		WebElement uNameME = driverME.findElement(By.name("userName"));

		uName.clear();
		uName.sendKeys("a");
		uNameF.clear();
		uNameF.sendKeys("a");
		//uNameO.clear();
		//uNameO.sendKeys("a");
		uNameME.clear();
		uNameME.sendKeys("a");
		
		driver.findElement(By.name("password")).sendKeys("a");
		driverF.findElement(By.name("password")).sendKeys("a");
		//driverO.findElement(By.name("password")).sendKeys("a");
		driverME.findElement(By.name("password")).sendKeys("a");

		driver.findElement(By.name("login")).click();
		driverF.findElement(By.name("login")).click();
		//driverO.findElement(By.name("login")).click();
		driverME.findElement(By.name("login")).click();

		if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			;
			System.out.println("Chrome Pass");
		} else {
			;
			System.out.println("Chrome Fail");
		}
		;

		if (driverF.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			;
			System.out.println("Firefox Pass");
		} else {
			;
			System.out.println("Firefox Fail");
		}
		;

/*		if (driverO.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			;
			System.out.println("Opera Pass");
		} else {
			;
			System.out.println("Opera Fail");
		}
		;*/

		if (driverME.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			;
			System.out.println("Edge Pass");
		} else {
			;
			System.out.println("Edge Fail");
		}
		;
		
		driver.quit();
		driverF.quit();
		//driverO.quit();
		driverME.quit();

	}

}
