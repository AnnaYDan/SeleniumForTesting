package seleniumCommands;

import java.awt.Dimension;
import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// declare browser driver
		WebDriver driver = new ChromeDriver();
		// declare wait for FindElement(s) command
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open browser window and navigate to web page
		driver.get("http://newtours.demoaut.com/");
		// print current page title
		System.out.println("Page Title is: " + driver.getTitle()); 
		// print current URL
		System.out.println("Page URL is: " + driver.getCurrentUrl()); 
		// print window ID
		System.out.println("Page ID is: " + driver.getWindowHandle());
		// print window ID for each window
		System.out.println("All pages ID is: " + driver.getWindowHandles());
		// print page source
		System.out.println("Page source is: " + driver.getPageSource()); 
		// change position for browser window
		//driver.manage().window().setPosition(150, 150);
		// change dimension for window
		//Dimension windowMinSize = new Dimension(100,100);
		//driver.manage().window().setSize(windowMinSize);.
		// maximize browser window
		//driver.manage().window().maximize();
		
		// navigate to web page
		driver.navigate().to("https://www.google.com");
		// navigate back
		driver.navigate().back();
		// navigate forward
		driver.navigate().forward();
		//close all browser windows under automation control
		driver.quit(); 

	}

}
