package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageAlerts {
	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void runAlwaysBefore() {
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Konstantinopolsky");
	}
	
	@Test
	public void checkPromptWithAccept() {
		driver.switchTo().alert().accept();
		String demo = driver.findElement(By.id("demo")).getText();
		Assert.assertTrue(demo.contains("Konstantinopolsky"));
	}
	
	@Test
	public void checkPromptWithDismiss() {
		driver.switchTo().alert().dismiss();;
		String demo = driver.findElement(By.id("demo")).getText();
		//Assert.assertTrue(!demo.contains("Konstantinopolsky"));
		Assert.assertFalse(demo.contains("Konstantinopolsky"));
	}
	

}
