package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
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
