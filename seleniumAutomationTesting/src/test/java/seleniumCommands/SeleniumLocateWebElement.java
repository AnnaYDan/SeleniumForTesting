package seleniumCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLocateWebElement {

	public static void main(String[] args) {
		// Selenium Locate Web Elements
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// drivet.get is to open browser window
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Solomon");
		driver.findElement(By.id("eml")).sendKeys("anutski@yahoo.com");
		driver.findElement(By.xpath("/html/body/form[1]/input[3]")).sendKeys("localhost");
		driver.findElement(By.xpath("//form[1]/textarea")).sendKeys("i am writing a comment");
		// driver.findElement(By.linkText("Open Goodle")).click();
		driver.findElements(By.name("gender")).get(1).click();
		// driver.findElements(By.name("skill")).get(1).click();
		// driver.findElement(By.name("skill")).sendKeys("qa");
		// driver.findElement(By.name("skill")).sendKeys("ba");
		List<WebElement> clist = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement varia : clist) {
			if (varia.isSelected()) {
				varia.click();
			}
		}
		
		driver.findElement(By.cssSelector("option[value='ETHIOPIA']")).click();
		
		driver.findElement(By.xpath("/html/body/form/select[2]/option[2]")).click();
		driver.findElement(By.xpath("/html/body/form/select[2]/option[1]")).click();

		Select s = new Select(driver.findElement(By.name("skill")));
		s.deselectAll();
		s.selectByIndex(1);
		s.selectByIndex(2);
		//driver.findElement(By.name("submit")).click();
		
		
		// driver.navigate().back();
		// driver.findElement(By.partialLinkText("image")).click();
		// driver.navigate().back();
		// driver.findElement(By.className("special")).click();
		// driver.findElement(By.tagName("textarea")).clear();
		// driver.close();
		// String str = driver.findElement(By.xpath("/html/body/text()[4]")).getText();
		// //may access JSExecutor
		// System.out.println(str);
		
		
		/*driver.findElement(By.id("alert")).click();
		String srtalert = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(srtalert);
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Sunday batch");
		driver.switchTo().alert().accept();
		String srtcheck = driver.findElement(By.id("demo")).getText();
		if (srtcheck.contains("Sunday batch")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}*/
	}

}
