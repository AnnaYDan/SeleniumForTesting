package seleniumClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCheckboxes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.walmart.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("global-search-input")).sendKeys("laptop");

		driver.findElement(By.xpath("//*[@id=\"global-search-dropdown\"]/div[1]/a/strong")).click();

		List<WebElement> allCheckoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement oneCheck : allCheckoxes) {
			System.out.println(">>>>..." + oneCheck.getAttribute("name") + " ... >>>>>>>");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(oneCheck));

			if (!oneCheck.isSelected()) {
				
				wait.until(ExpectedConditions.elementToBeClickable(oneCheck));

				// should work this way but doesn't
				//oneCheck.click();

				// one way
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300)");
				js.executeScript("arguments[0].click();", oneCheck);

				// second way
				//Actions actions = new Actions(driver);
				//actions.moveToElement(oneCheck).click().build().perform();
								
			}

		}

	}

}
