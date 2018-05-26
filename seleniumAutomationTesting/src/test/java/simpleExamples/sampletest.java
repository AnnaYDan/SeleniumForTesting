package simpleExamples;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class sampletest {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
		WebDriver driver = new ChromeDriver ();
		  
		  driver.get("http://newtours.demoaut.com/"); 
		  
		  driver.findElement(By.name("userName")).sendKeys(n);
			driver.findElement(By.name("password")).sendKeys(s);
			driver.findElement(By.name("login")).click(); 
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			
		 if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			 System.out.println("login was successfully");
		 }else {
			 System.out.println("login wasnot successfull");
	 }		
}
		
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
      new Object[] { "c", "c" },
      new Object[] { "d", "d" },
      new Object[] { "e", "e" },
    };
  }
}