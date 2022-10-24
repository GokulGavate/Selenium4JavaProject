package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) 
	{
	
  
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	//	driver.findElement(By.name("Gokul")).sendKeys("Java");  //NoSuchElementException
		
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		
		
		/*
		//search box - address of element using by class 
		
		
	      By searchbox=By.name("q");
		 WebElement ele= driver.findElement(searchbox);
	     
	     //validate
		 
	      System.out.println("Is element displayed?: "+ele.isDisplayed());
	      
	      System.out.println(" Is element is enabled?: "+ele.isEnabled());
	      
	     // Action
	      
	     ele.sendKeys("TestNG",Keys.ENTER);
	      
	      */
	}      
	      
}      
	      
	      
	      
	      
	      
		
	


