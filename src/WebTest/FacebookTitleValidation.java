package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTitleValidation {

	public static void main(String[] args)
	{
		
		
		//System.getproperty("user.dir")
		//  "./"
		
		//to launch browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to open Application
		
		driver.get("https://wwww.facebook.com/");
		
		// to capture title- getTitle()
		
		String title=driver.getTitle();
		System.out.println("Application title is: "+title);
		
		//validate title
		
		String actualtitle=title;
		String expectedtitle=" Facebook-log in or sign up ";
		
		if(expectedtitle.equals(actualtitle))
     	{
		System.out.println("Title is matched....Test is pass");
		}
		else
		{
			System.out.println("Title is not matched ....Test is fail");
		
		}
		
		// to close browser--close()-close current browser.....quit()-close all open window by selenium
		
		//driver.close();   //SocketException
		
	//	driver.quit();
		
		
		
		
		
		
		
		
		
	
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Downloads\\geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\msedgedriver.exe");
	//	WebDriver driver=new EdgeDriver();
		
	}

}
