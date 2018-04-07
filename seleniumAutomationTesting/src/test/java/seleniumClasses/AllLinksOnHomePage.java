package seleniumClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnHomePage {

	public static void main(String[] args) {

		// declare browser driver
		WebDriver driver = new ChromeDriver();
		
		// navigating to website
		driver.get("http://newtours.demoaut.com/");
		
		// get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		// traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " >>>>>> " + link.getAttribute("href"));
		}
		
		System.out.println("On home page we have " + allLinks.size());
		
		driver.quit();
	}

}
