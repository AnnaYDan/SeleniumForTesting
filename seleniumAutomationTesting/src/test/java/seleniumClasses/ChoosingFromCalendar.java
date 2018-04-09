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
				"//*[@id=\"flt-app\"]/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div[5]/div[1]/div[2]"))
				.click();

		// declare variable for month
		WebElement month = driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/two-month-calendar/div/div/calendar-month[1]/month-header/jsl"));

		// declare variable for next arrow
		WebElement next = driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/two-month-calendar/div/calendar-flippers/div[1]"));

		
		// debugging
		// ???????? element not visible ???????? 
		// month.click();
		
		try {
			Thread.sleep(3000);    //milliseconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		System.out.println(next.isDisplayed());
		System.out.println(next.isEnabled());
		
		
		
		
		// click next icon while get September
		while (!month.getText().contains("September")) {
			next.click();
		}

		
		// choose departure date September 9th
		driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/two-month-calendar/div/div/calendar-month[6]/calendar-week[3]/calendar-day[1]/div[3]"))
				.click();

		// choose arrival date September 23th
		driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/two-month-calendar/div/div/calendar-month[6]/calendar-week[5]/calendar-day[1]/div[3]"))
				.click();

		// click Done button
		driver.findElement(By.xpath("//*[@id=\"flt-modaldialog\"]/div/div[5]/g-raised-button/div/jsl")).click();
		
		// get date for "From" field
		String record = driver.findElement(By.xpath(
				"//*[@id=\"flt-app\"]/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div[5]/div[2]"))
				.getText();

		// assertion with if-condition
		if (record.contains("Sep 9")) {
			System.out.println("Calendar worked successfully");
		} else {
			System.out.println("Check your date");
		}

	}

}
