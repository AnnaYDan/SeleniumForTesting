package seleniumCommands;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPageCommands {

	public static void main(String[] args) {
		// declare using Selenium Web Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// open test page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		
		// locating and sending keys for input web elements
		driver.findElement(By.name("name")).sendKeys("Selenium WebDriver");
		driver.findElement(By.id("eml")).sendKeys("Selenium@WebDriver.com");
		driver.findElement(By.name("website")).sendKeys("http://www.selenium-webdriver.com");
		driver.findElement(By.tagName("textarea")).sendKeys("i am writing the comment");
		driver.findElement(By.tagName("textarea")).clear();
		driver.findElement(By.tagName("textarea")).sendKeys("I would like to write a very very very very very very very very very very very very long comment");
		
		// locating and selecting radio button elements
		driver.findElement(By.id("other")).click();
		driver.findElements(By.name("gender")).get(1).click();
		driver.findElement(By.xpath(".//*[@id='other']")).click();
		driver.findElement(By.cssSelector("input[name='gender'][value='female']")).click();
		
		// locating and selecting check box
		java.util.List<WebElement> checkBoxs = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement checkBox : checkBoxs) {
			if (checkBox.isSelected()) {
				checkBox.click();
			}
			if (checkBox.getAttribute("value").contains("horse")) {
				checkBox.click();
			}
		}
		
		// locating and selecting list box
		driver.findElement(By.name("country")).sendKeys("Ethiopia");
		driver.findElement(By.xpath(".//select/option[@value='INDIA']")).click();
		driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='ETHIOPIA']")).click();
		
		// locating and selecting multichoice box using xpath
		driver.findElement(By.xpath("html/body/form/select[2]/option[3]")).click();
		driver.findElement(By.xpath("html/body/form/select[2]/option[4]")).click();
		
		// locating and selecting multichoice box using Select class
		Select skill = new Select(driver.findElement(By.name("skill")));
		skill.deselectAll();
		skill.selectByIndex(1);
		skill.selectByValue("ba");
		skill.selectByVisibleText("Database");
				
		// submitting results
		//driver.findElement(By.className("special")).click();
		//driver.findElement(By.name("submit")).click();
		
/*		// web page navigating
		driver.findElement(By.linkText("Open Goodle")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("open Yahoo page")).click();
		driver.navigate().back();
*/		

		//testing alerts
		driver.findElement(By.id("alert")).click();
		String srtalert = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println("Text in alert was: " + srtalert);
		
		// testing confirms
		driver.findElement(By.id("confirm")).click(); 
		driver.switchTo().alert().accept();
		String srtcheck1 = driver.findElement(By.id("demo")).getText();
		if (srtcheck1.contains("OK")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		// testing prompts
		driver.findElement(By.id("prompt")).click(); 
		driver.switchTo().alert().sendKeys("Saturday batch");
		driver.switchTo().alert().accept();
		String srtcheck2 = driver.findElement(By.id("demo")).getText();
		if (srtcheck2.contains("Saturday batch")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
