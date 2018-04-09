package seleniumClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckboxes1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
/*		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		List<WebElement> allCheckoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement oneCheck : allCheckoxes) {
			System.out.println(">>>>..." + oneCheck.getAttribute("name"));
			
			if (!oneCheck.isSelected())	oneCheck.click();
			
		}
		
		
		//driver.quit();
	}
}
