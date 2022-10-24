package WebTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorDemo3 {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Emplicitly Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open application
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize Window
		
		driver.manage().window().maximize();
		
		
		//UserName

		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
		//login button
	    
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		
		
		//logout
			driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		//linkText
		
		//	driver.findElement(By.linkText("Logout")).click();
		
		
		
		// partial LinkText
		
		driver.findElement(By.partialLinkText("Change")).click();
		
	//	driver.findElement(By.partialLinkText("Password")).click();
		
	}

}
