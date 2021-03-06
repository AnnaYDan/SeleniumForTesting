package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownload {

	public static void main(String[] args) {

		// Create a profile
		FirefoxProfile profile = new FirefoxProfile();
		// using this preference you can give file path, extension type and any
		// other configurations to the browser
		System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver.exe");
		// Set preferences for file type not to raise any popup window, and use
		// the default one
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");

		// Open browser with profile
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(dc);

		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Open APP to download application
		driver.get("https://filehippo.com/download_free_pdf_reader/");

		// Click on download
		driver.findElement(By.xpath("//div[@class='program-header-download-link-container']/a")).click();
	}

}
