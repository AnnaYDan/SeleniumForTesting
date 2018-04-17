package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressKeyboardKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement playButton = driver.findElement(By.id("gbqfbb"));
		String playButtonText = playButton.getAttribute("value");
		
		if (playButtonText.contains("I'm Feeling Lucky")) {
			playButton.sendKeys(Keys.ENTER);
		}
		
	}

}
