package seleniumClasses;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		// Taking screen shot that should run during test case failure

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Pass the url
		driver.get("http://www.google.com");

		// Take screenshot and store as a file format
		takeScreenShot(driver, "myScreenShotOnline");
	}

	public static void takeScreenShot(WebDriver driver, String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:/selenium/" + fileName + ".png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
