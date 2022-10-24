package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
