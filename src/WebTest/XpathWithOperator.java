package WebTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class XpathWithOperator {

	public static void main(String[] args) throws InterruptedException 
	{
		   
				System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();

						
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
				
				driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
				
				driver.manage().window().maximize();
				
				//frist name
				driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Gokul");
				
				//last name
				driver.findElement(By.xpath("//input[@class='form-control' and @name='lastname']")).sendKeys("Gavate");
				
				//email
				driver.findElement(By.xpath("//input[@name='email' or @id='input-email']")).sendKeys("gokul101@gamil.com");
				
				//password
				
				driver.findElement(By.id("input-password")).sendKeys("gokul123");
				
				Thread.sleep(2000);
				
				//JavascriptExcecutor---scroll uo and scroll down
				
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
				
		//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
				
				//radio button
				
			//	driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
				
			    //checkbox
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				
				
				
				
	}

}
