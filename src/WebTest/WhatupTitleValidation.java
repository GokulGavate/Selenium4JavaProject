package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhatupTitleValidation {

	public static void main(String[] args) 
	{
         // open the browser
        System.setProperty("webdriver.gecko.driver", "./"+"\\driver\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		
		//open the Application
		
		driver.get("https://wwww.amazon.com");
		
		
		//to capture titlt
		
		String title=driver.getTitle();
		System.out.println("Application Title is: "+title);
		
		// validation title
		
		
		    String actualtitle= driver.getTitle();
		    String Expectedtitle="Amazon.com. Spend less. Smile more.";
		
	      if(Expectedtitle.equals(actualtitle))
	      {
	    	  System.out.println("Title is matched........Test is pass");
	      }else 
	       {
	    	 System.out.println("Title is unmatched.......Test is fail"); 
	       }
	    	
	      //close the browser
	       driver.close();
	    		  	  
		
	}
	
	
	

}
