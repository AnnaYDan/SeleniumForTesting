package seleniumClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionDragAndDrop {

	public static void main(String[] args) throws AWTException {
		// Drag book list from one tree to another tree
		// using Action class
		WebDriver driver = new ChromeDriver();
		// write the code to type http://newtours.demoaut.com/
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://localhost:8888/test/testPage2.php");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Point element2 = driver.findElement(By.id("c2")).getLocation();
		robot.mouseMove(element2.x + 50, element2.y +50);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(4000);
		Point cart2 = driver.findElement(By.id("cart2")).getLocation();
		robot.mouseMove(cart2.x + 100, cart2.y +100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(4000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}