package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:/Users/TOSHIBA/Downloads/edgedriver/MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//System.setProperty("webdriver.opera.driver", "C:/Users/TOSHIBA/Downloads/operadriver_win64/operadriver.exe");
		//WebDriver driver = new OperaDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement uName = driver.findElement(By.name("userName"));
		uName.clear();
		uName.sendKeys("a");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("a");
		driver.findElement(By.name("login")).click();
		
		WebElement link = driver.findElement(By.linkText("SIGN-OFF"));
		
		if (link.isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		//driver.quit();
		
	}

}
