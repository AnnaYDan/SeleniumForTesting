package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChoosingFromCalendar {

	public static void main(String[] args) {
		// declare web driver
		WebDriver driver = new ChromeDriver();

		// wait will be applied for any element not available for the first try
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// open google flights website
		driver.get("https://www.google.com/flights/");

		// locate calendar icon
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/div[1]/div[5]/table/tbody/tr[2]/td[1]/div/div[1]/div[3]"))
				.click();

		// declare variable for month
		WebElement month = driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[1]/td/div/div[3]"));

		// declare variable for next arrow
		WebElement next = driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[1]/td/div/div[2]"));

		// click next icon while get September
		while (!month.getText().contains("September")) {
			next.click();
		}

		// choose departure date September 7th
		driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[2]/td/div/table[1]/tbody/tr[3]/td[6]/div"))
				.click();

		// choose arrival date September 14th
		driver.findElement(By.xpath("html/body/div[3]/div/div/table/tbody/tr[2]/td/div/table[1]/tbody/tr[4]/td[6]/div"))
				.click();

		// get date for "From" field
		String record = driver.findElement(By.xpath(
				".//*[@id='root']/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/div/div[1]/div[5]/table/tbody/tr[2]/td[1]/div/div[1]/div[1]"))
				.getText();

		// assertion with if-condition
		if (record.contains("September 7")) {
			System.out.println("Calendar worked successfully");
		} else {
			System.out.println("Check your date");
		}

	}

}
