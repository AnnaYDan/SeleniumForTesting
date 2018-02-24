package seleniumCommands;

import java.awt.Dimension;
import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// Selenium Commands
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//drivet.get is to open browser window
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Page Title is: " + driver.getTitle()); //prints current page title
		System.out.println("Page URL is: " + driver.getCurrentUrl()); //prints current URL
		//System.out.println("Page ID is: " + driver.getWindowHandle()); //window ID
		//System.out.println("All pages ID is: " + driver.getWindowHandles());
		//System.out.println("Page source is: " + driver.getPageSource()); //page source
		//driver.manage().window().maximize();
		//driver.manage().window().setPosition(-2000, 0);
		//Dimension windowMinSize = new Dimension(100,100);
		//driver.manage().window().setSize(windowMinSize);.
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //close properly browser window

	}

}
