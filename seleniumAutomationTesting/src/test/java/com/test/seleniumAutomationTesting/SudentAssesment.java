package com.test.seleniumAutomationTesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SudentAssesment {
	
	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl;
		//System.setProperty("webdriver.gecko.driver","D:\\selenium_tools\\geckodriver.exe");
		 driver=new FirefoxDriver();
		baseUrl = "http://newtours.demoaut.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.get(baseUrl);
		//Login details		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		WebElement s= driver.findElement(By.name("login"));
		s.click();
		
		//registration page
	  String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle,"Find a Flight: Mercury Tours:");
		//select the trip type
		 List<WebElement> rdBtn_type = driver.findElements(By.name("tripType"));
		 int size = rdBtn_type.size();
		    System.out.println("Total no of radio button :"+size);
		    for (int i=0; i< size; i++)
		    {
		        String sValue = rdBtn_type.get(i).getAttribute("value");  
		     		        if (sValue.equalsIgnoreCase("oneway"))
		        {
		            rdBtn_type.get(i).click();

		        } }
		//select number of passengers
		WebElement passenger=driver.findElement(By.name("passCount"));
		Select sel=new Select(passenger);
		sel.selectByIndex(1);
		//select the departure location
		WebElement departing=driver.findElement(By.name("fromPort"));
		 sel=new Select(departing);
		sel.selectByVisibleText("Frankfurt");
		//Departure date 
		WebElement from_month=driver.findElement(By.name("fromMonth"));
		 sel=new Select(from_month);
		sel.selectByVisibleText("February");
		WebElement from_day=driver.findElement(By.name("fromDay"));
		 sel=new Select(from_day);
		sel.selectByIndex(3);
		
		//Arrival		
		WebElement arriving=driver.findElement(By.name("toPort"));
		 sel=new Select(arriving);
		sel.selectByVisibleText("London");
		
		//Service Class
		 List<WebElement> rdBtn_pref = driver.findElements(By.name("servClass"));
		 int pref= rdBtn_pref.size();
		   		    for (int j=0; j< pref; j++)
		    {
		        String sValue = rdBtn_pref.get(j).getAttribute("value");  
		     		        if (sValue.equalsIgnoreCase("Business"))
		        {
		            rdBtn_pref.get(j).click();

		        }}
		 //Airline Preference   
		WebElement airline=driver.findElement(By.name("airline"));
		sel=new Select(airline);
		sel.selectByIndex(1);
		//Continue button
		driver.findElement(By.name("findFlights")).click();
}}