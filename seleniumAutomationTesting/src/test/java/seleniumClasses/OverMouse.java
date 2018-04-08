package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OverMouse {

	public static void main(String[] args) {
		// this program will over mouse on a link and check whether the backgorund color is changing  to yellow
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/test/testPage.php");
		WebElement googleLink = driver.findElement(By.partialLinkText("Open Google"));
		Actions action = new Actions(driver);
		String bgColor = googleLink.getCssValue("background-color");
		System.out.println("background color before over mouse is = " + bgColor);
		action.moveToElement(googleLink).build().perform();
		bgColor = googleLink.getCssValue("background-color");
		System.out.println("background color after over mouse is = " + bgColor);

	}

}