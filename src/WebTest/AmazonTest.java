package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {

	public static void main(String[] args) 
	{
		
		
		//WebDriver browser based commands
		
		
		
		//to launch a browser
		
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//To open Application
		
		driver.get("https://www.amazon.in/");
		
		//To get the title of current page
		
	System.out.println("Application title is: "+driver.getTitle());
	
	// to get current url of page
		
		  System.out.println("Current url is: "+driver.getCurrentUrl());
		  
		  
		  // to get page source
		
         System.out.println(driver.getPageSource());
         
         //to close the browser 
         
         driver.quit();
         
	}
	
	

}
