package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		  // To open Application
		 driver.get("https://www.facebook.com/");
		 
		 
		 //Email id
		 driver.findElement(By.cssSelector("input#email")).sendKeys("test@gmail.com");
		 
		 
		 //Password
		 
		 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");
		 
		 

	}

}
