package WebTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithMethod {

	public static void main(String[] args) 
	{
		//launch browser
		
				System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//open Application
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//maximize window
				driver.manage().window().maximize();
				
				//user name
				
			//	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				
				//password
				
		//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
				
				//login
				
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
				
				//XPath with text()
				
			//	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
				driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
				
				//XPath  with normalize-space
				
		//	driver.findElement(By.xpath("//button[normalize-space='Login']")).click();
				
				
               //XPath With contains()
				
		//	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();	
				
				//forgot password
	//		driver.findElement(By.xpath("//p[contains(normalize-space(),'Forgot your')] ")).click();	
				
				//Xpath With startwith()
			
		//	driver.findElement(By.xpath("//p[starts-with(normalize-space(),'Forgot ')]")).click();
				
	}

}
