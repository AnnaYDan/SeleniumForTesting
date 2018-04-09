package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver08HandleAlerts {

	public static void main(String[] args) {
		// declare web browser
		WebDriver driver = new ChromeDriver();
		// declare waiting for FindElement(s) command
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open browser window and navigate to web page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");

		driver.findElement(By.id("alert")).click();
		String srtAlert = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println("text in alert window: " + srtAlert);
		
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Sunday batch");
		driver.switchTo().alert().accept();
		
		String srtcheck = driver.findElement(By.id("demo")).getText();
				if (srtcheck.contains("Sunday batch")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
