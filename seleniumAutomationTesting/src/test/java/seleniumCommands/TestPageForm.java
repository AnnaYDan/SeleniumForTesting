package seleniumCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageForm {

	public static void main(String[] args) {
		// declare web driver
		WebDriver driver = new ChromeDriver();
		
		// open test page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		// type "Name"
		driver.findElement(By.name("name")).sendKeys("Anna");
		
		// type "Email"
		driver.findElement(By.id("eml")).sendKeys("myemaildomaincom");
		
		// type "Website"
		driver.findElement(By.name("website")).sendKeys("myWebSite");
		
		// type "Comment"
		driver.findElement(By.name("comment")).sendKeys("comment is here\n");
		driver.findElement(By.tagName("textarea")).sendKeys("comment from tagName textarea");
		
		// choose "Gender"
		List<WebElement> allRadioButtons = driver.findElements(By.name("gender"));
		allRadioButtons.get(1).click();
		
		// work with check box
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		// check is WebElement from our list selected and uncheck
		for (WebElement oneCheckBox:checkBoxes) {
			//System.out.println(oneCheckBox.getAttribute("value"));
			
			if (oneCheckBox.isSelected()) {
				oneCheckBox.click();
			}
			
		}
		
		driver.findElement(By.name("horse")).click();
		
		
/*		int i;
		for (i=1; i <= 10; i = i + 1) { // i++ is a shortcut to write i = i + 1 
			System.out.println(i);
		}*/
			
		
		// work with dropdown
		driver.findElement(By.xpath("/html/body/form/select[1]/option[4]")).click();
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='ETHIOPIA']")).click();
				
		// work with multichoice
		
		
		
		// click "Send"
		
		
		
		// check 
		
		
		
	}

}
