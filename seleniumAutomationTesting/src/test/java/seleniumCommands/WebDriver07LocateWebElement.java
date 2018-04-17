package seleniumCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver07LocateWebElement {

	public static void main(String[] args) {
		// declare web browser
		WebDriver driver = new ChromeDriver();
		// declare waiting for FindElement(s) command
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open browser window and navigate to web page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		// locate by name and type
		driver.findElement(By.name("name")).sendKeys("Salamandra");
		// locate by is and type
		driver.findElement(By.id("eml")).sendKeys("anutski@yahoo.com");
		// locate by xpath and type
		driver.findElement(By.xpath("/html/body/form[1]/input[3]")).sendKeys("localhost");
		// locate by xpath and type
		driver.findElement(By.xpath("//form[1]/textarea")).sendKeys("i am writing a comment");
		// locate by link text and type
		// driver.findElement(By.linkText("Open Goodle")).click();
		// locate and choose one from collection of web elements
		driver.findElements(By.name("gender")).get(1).click();
		// driver.findElements(By.name("skill")).get(1).click();
		// driver.findElement(By.name("skill")).sendKeys("qa");
		// driver.findElement(By.name("skill")).sendKeys("ba");
		
		// 
		List<WebElement> clist = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement varia : clist) {
			if (varia.isSelected()) {
				varia.click();
			}
		}
		
		// locating for dropdown list Country
		driver.findElement(By.name("country")).sendKeys("Ethiopia");
		driver.findElement(By.cssSelector("option[value='FRANCE']")).click();
		driver.findElement(By.xpath("//option[@value='INDIA']")).click();
		
		//driver.findElement(By.xpath("/html/body/form/select[2]/option[2]")).click();
		//driver.findElement(By.xpath("/html/body/form/select[2]/option[1]")).click();

		// using Select class for multichoice list
		Select s = new Select(driver.findElement(By.name("skill")));
		s.deselectAll();
		s.selectByIndex(1);
		//s.selectByIndex(2);
		s.selectByVisibleText("Management");
		s.deselectByValue("qa");;
		
		
		
		//driver.findElement(By.name("submit")).click();
		
		// driver.navigate().back();
		// driver.findElement(By.partialLinkText("image")).click();
		// driver.navigate().back();
		// driver.findElement(By.className("special")).click();
		// driver.findElement(By.tagName("textarea")).clear();
		// driver.close();
		// String str = driver.findElement(By.xpath("/html/body/text()[4]")).getText();
		// System.out.println(str);

	}

}
