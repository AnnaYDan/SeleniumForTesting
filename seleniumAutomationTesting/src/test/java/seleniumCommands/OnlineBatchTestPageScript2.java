package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineBatchTestPageScript2 {

	public static void main(String[] args) {
		// create an object driver as a copy of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		// navigate to test page
		// driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.navigate().to("http://www.training.qaonlinetraining.com/testPage.php");
		
		// to declare implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click "alert me" button, get text, print it on console, and accept alert
		driver.findElement(By.id("alert")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("text in alert is\n >>>>>>> \n" + alertText + "\n <<<<<<<");
		driver.switchTo().alert().accept();
		
		// click "confirm me" button, dismiss and assert that we get Cancel in text on page
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		String srtDemoConfirm = driver.findElement(By.id("demo")).getText();
		if (srtDemoConfirm.contains("Cancel!"))
		{
			System.out.println("confirm part pass");
		}
		
		// click "prompt me" button, type Online batch, accept alert, and assert that we get text which we type in text on page 
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Online batch");
		driver.switchTo().alert().accept();
		String srtDemoPrompt = driver.findElement(By.id("demo")).getText();
		if (srtDemoPrompt.contains("Online batch")) {
			System.out.println("prompt part pass");
		}
		
		
	}

}
