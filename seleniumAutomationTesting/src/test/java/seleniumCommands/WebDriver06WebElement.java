package seleniumCommands;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver06WebElement {

	public static void main(String[] args) {
		// declare browser driver
		WebDriver driver = new ChromeDriver();
		// declare implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open browser window and navigate to web page
		driver.get("http://newtours.demoaut.com/");
		// declare variable for user name field
		WebElement userName = driver.findElement(By.name("userName"));
		// clean user name field
		userName.clear();
		// click in user name field
		userName.click();
		// get user name box size and print result
		System.out.println("User name box size is: " + userName.getAttribute("size"));
		// get user name box input type and print result
		System.out.println("User name input type is: " + userName.getAttribute("type"));
		// get user name box location and print result
		Point Location = userName.getLocation();
		System.out.println("User name box is located at: " + "x=" + Location.x + " and y=" + Location.y);
		// get user name box dimension and print result
		org.openqa.selenium.Dimension size = userName.getSize();
		System.out.println("User name height is " + size.height + " and width " + size.width);
		// get user name box tag name and print result
		System.out.println("User name tag : " + userName.getTagName());
		// get text on sign-on button and print result
		System.out.println("Text of sing-on link is: " + driver.findElement(By.linkText("SIGN-ON")).getText());

		// checking is user name box is displaying or not
		if (userName.isDisplayed()) {
			System.out.println("yes, user name is visible");
		}else {
			System.out.println("no, user name is invisible");
		}

		// checking is user name box has disable attribute or not
		if (userName.isEnabled()) {
			System.out.println("user name has not 'disabled' attribute");
		}else {
			System.out.println("user name has 'disabled' attribute");
		}

		// checking is user name box is selected or not
		if (userName.isSelected()) {
			System.out.println("yes, user name is selected");
		}else {
			System.out.println("no, user name is not selected");
		}
		
		// get and print background color
		System.out.println("Back ground color of user name is: " + userName.getCssValue("background-color"));

		// close browser window
		driver.close();
	}

}
