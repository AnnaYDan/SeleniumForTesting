package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) {

	// declare browser driver
	WebDriver driver = new ChromeDriver();
	// navigating to training page
	driver.get("http://www.training.qaonlinetraining.com/testPage.php");
	// waiting for FindElement and FindElements commands
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	// declare and store in variable web element with attribute name equals to name
	WebElement nameElement = driver.findElement(By.name("name"));
	// declare and store in variable web element with attribute name equals to comment
	WebElement commentElement = driver.findElement(By.name("comment"));
	
	// using action library copy text from nameElement to commentElement
	Actions action = new Actions(driver);
	action.moveToElement(nameElement).doubleClick().build().perform();
	action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	action.click(commentElement).keyDown(Keys.CONTROL).sendKeys("v").
	keyUp(Keys.CONTROL).build().perform();
	action.keyDown(Keys.SHIFT).sendKeys("Hello").keyUp(Keys.SHIFT).build().perform();
	
	}
}
