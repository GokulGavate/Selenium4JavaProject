package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title is: "+driver.getTitle());
		
		 //static wait
		
		Thread.sleep(3000);
		
		// navigation process
		// navigation interface and using navigate()
		
		
		driver.navigate().to("https:www.facebook.com/");
		
		Thread.sleep(3000);
		driver.navigate().back();    //google
		
		Thread.sleep(3000);
		driver.navigate().forward();   //facebook
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
