package seleniumCommands;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) {
		// Selenium Web Elements Commands
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//drivet.get is to open browser window
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.click();
		System.out.println("User name box size is: " + userName.getAttribute("size"));
		System.out.println("User name input type is: " + userName.getAttribute("type"));
		Point Location = userName.getLocation();
		System.out.println("User name box is located at: " + "x=" + Location.x + " and y=" + Location.y);
		org.openqa.selenium.Dimension size = userName.getSize();
		System.out.println("User name height is " + size.height + " and width " + size.width);
		System.out.println("User name tag : " + userName.getTagName());
		System.out.println("Text of sing-on link is: " + driver.findElement(By.linkText("SIGN-ON")).getText());
		if (userName.isDisplayed()) {
			System.out.println("yes, user name is visible");
		}else {
			System.out.println("no, user name is invisible");
		}
		
		if (userName.isEnabled()) {
			System.out.println("yes, user name is active");
		}else {
			System.out.println("no, user name is inactive");
		}
		
		if (userName.isSelected()) {
			System.out.println("yes, user name is selected");
		}else {
			System.out.println("no, user name is not selected");
		}
		
		System.out.println("Back ground color of user name is: " + userName.getCssValue("background-color"));
		userName.sendKeys("solomon"); //type text
		userName.submit(); //press enter
		
		driver.close();
	}

}
