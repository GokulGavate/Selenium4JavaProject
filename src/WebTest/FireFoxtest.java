package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxtest {

	public static void main(String[] args) 
	{
		
		//launch browser
		
		System.setProperty("webdriver.gecko.driver", "./"+"\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.firefox.com");
		
		//open application
		
		
		driver.get("https://www.facebook.com");
		
		//to capture title
		
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		// Validate Title
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook - log in or sign up";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title is matched----testcase pass");
		}
		else
		{
			System.out.println("Title is unmatched------testcase fail");
		}
			
	  // close browser
		
		driver.close();
	}

}
