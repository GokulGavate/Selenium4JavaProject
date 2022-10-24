package WebTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksAutomation {

	public static void main(String[] args) 
	{

		
		System.setProperty("webdriver.chrome.driver", "./"+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Emplicitly Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open application
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// another application
		driver.get("https://www.naukri.com/allcompanies?");
		 
		
		//maximize Window
		
		driver.manage().window().maximize();
		
		// wrong tagname----No throw exception---get []
		
	//	List<WebElement>list=driver.findElements(By.tagName("abc"));
	//	System.out.println(list);
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on my page: "+links.size());
	
		
		
		     //iterate
		
		for(WebElement i:links)
		{
			System.out.println(i.getText());
			String attr=i.getAttribute("href");
			System.out.println(attr);
		}
		
		
		        // validation
	//	if(attr.equals("https://twitter.com/orangehrm?lang=en"))
	//		{
	//			System.out.println("Match found ------test case is passed");
	//		break;
	//		}
			
	
			
				
				
		}
		
		
		
		
		

	}


