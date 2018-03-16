package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiPageHandling {

	public static void main(String[] args) {
		// declre driver
		WebDriver driver = new ChromeDriver();

		// wait will be applied for any element not available for the first try
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// opening a test page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");

		// store handle id of this tab
		String homePageID = driver.getWindowHandle();

		// declare that for handle id for yahoo is null
		String yahooID = null;

		// print home page handle id
		System.out.println("home page:" + homePageID);

		// find link for yahoo page by partial link text
		driver.findElement(By.partialLinkText("open Yahoo page")).click();

		// waiting while page will be uploaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		// some other ways to wait
		// using WebDriverWait class
		// WebDriverWait wait=new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

		// for each window handle execute this script
		for (String currID : driver.getWindowHandles()) {
			// printing for debugging code
			// System.out.println(currID);
			
			// assign handle id for yahoo page if current handle id is not equal to home page id 
			if (!currID.contains(homePageID)) {
				yahooID = currID;
			}
		}

		// printing handle id of yahoo page
		System.out.println("yahoo ID is " + yahooID);
		
		// switch to window with yahoo page
		driver.switchTo().window(yahooID);
		
		// find search field and type Selenium
		driver.findElement(By.name("p")).sendKeys("Selenium WebDriver");
		
		// switch to window with home page
		driver.switchTo().window(homePageID);

		// sleeping thread to see that we switch to home page
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// find alert and click
		driver.findElement(By.id("alert")).click();
		
		// accept alert message
		driver.switchTo().alert().accept();
		
		// return to tab with yahoo
		driver.switchTo().window(yahooID);

		// clear search field
		driver.findElement(By.name("p")).clear();
		
		// type new search
		driver.findElement(By.name("p")).sendKeys("Cucumber BDD");

	}

}
