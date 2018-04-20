package seleniumCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineBatchTestPageScript1 {
	// this class is created to test submit form on Test Page

	public static void main(String[] args) {
		// create an object driver as a copy of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		// navigate to test page
		// driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.navigate().to("http://www.training.qaonlinetraining.com/testPage.php");
		
		// to declare implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// locate text field Name and type our name
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("My name");
		
		// locate text field Email and type our email
		driver.findElement(By.id("eml")).sendKeys("my email");
		
		// locate website and type out website
		driver.findElement(By.name("website")).sendKeys("website address");
		
		// locate comment and type our comment
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(">>>>>>>> comment <<<<<<<<");
		
		// locate radio buttons select gender equals to other
		driver.findElements(By.xpath("//input[@name='gender']")).get(2).click();
		
		// locate checkboxes and select Boat and Horse
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement oneCheckbox: allCheckboxes) {
			if (oneCheckbox.isSelected()) oneCheckbox.click();
		}
		allCheckboxes.get(3).click();
		driver.findElement(By.name("boat")).click();
		
		// locate drop down list and choose France
		// option 1
		//driver.findElement(By.xpath("//select[@name='country']")).sendKeys("France");
		// option 2
		//driver.findElement(By.xpath("//option[@value='INDIA']")).click();
		// option 3		
		driver.findElement(By.cssSelector("option[value='FRANCE']")).click();
		
		// locate multichoice list and select QA, programming and management
		Select multiChoice = new Select(driver.findElement(By.name("skill")));
		multiChoice.deselectAll();
		multiChoice.selectByVisibleText("Database");
		multiChoice.selectByValue("mgmt");
		multiChoice.selectByIndex(1);
		
		// locate Send and click
		//driver.findElement(By.name("submit")).click();
		
		// locate input and check that we get our information 
		// unable to locate input results
		
		
		// apply such locator as linkText and partialLinkText
		driver.findElement(By.partialLinkText("Goodle")).click();
		driver.navigate().back();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		driver.navigate().refresh();
		
		
		// close driver
		// driver.close();
		//driver.quit();
		
	}

}
