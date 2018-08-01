package testNGexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ManageAlertsTestNG {
	
	// declare browser driver
	WebDriver driver = new ChromeDriver();
	
	// navigating to web page in before executing test method
	@BeforeMethod
	public void runAlwaysBefore() {
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Konstantinopolsky");
		System.out.println(">>>>>>>>>>>>>>>> before test finished");		
	}
	
	// first test for accept alert
	@Test (priority = 2)
	public void checkPromptWithAccept() {
		driver.switchTo().alert().accept();
		String demo = driver.findElement(By.id("demo")).getText();
		Assert.assertTrue(demo.contains("Konstantinopolsky"));
		System.out.println("*************** test with accept finished *************");		
	}
	
	// second test for dismiss alert
	@Test (priority = 1)
	public void checkPromptWithDismiss() {
		driver.switchTo().alert().dismiss();
		String demo = driver.findElement(By.id("demo")).getText();
		//Assert.assertTrue(!demo.contains("Konstantinopolsky"));
		Assert.assertFalse(demo.contains("Konstantinopolsky"));
		System.out.println("*************** test with dismiss finished *************");		
	}

	// running after executing test method with just printing about this fact
	@AfterMethod
	public void afterMethod() {
		//driver.quit();
		System.out.println("<<<<<<<<<<<<<<<< after test finished");		
	}

	// running after executing test method with just printing about this fact
	@AfterClass
	public void afterClass() {
		driver.quit();
		System.out.println("<<<<<<<<<<<<<<<< after class finished");		
	}
}
