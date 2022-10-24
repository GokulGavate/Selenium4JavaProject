package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCardLocatorDemo2 {

	public static void main(String[] args) 
	{
		
		   
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		
		//   email
		
		WebElement ele1= driver.findElement(By.id("input-email"));
		
		// validation
		
		if(ele1.isDisplayed() && ele1.isEnabled())
		{
			ele1.sendKeys("gokulpatil20@gmail.com");
			
		}
		
		// password
		
		driver.findElement(By.name("password")).sendKeys("Gokul");
		
		
		//login button
		
	//	driver.findElement(By.className("btn-primary")).click();
		
	//	driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	    // css selector
		
	//	driver.findElement(By.cssSelector("button.btn-primary")).click();
		
		driver.findElement(By.cssSelector("button.btn-primary[type='submit']")).click();
		
		System.out.println("Test case completed");
		
	}		
		
}
