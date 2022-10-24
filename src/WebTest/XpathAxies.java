package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxies {

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","./"+"\\driver\\chromedriver.exe");	
     WebDriver driver=new ChromeDriver();
     
       driver.get("https://www.amazon.in/");
     
     
       
       JavascriptExecutor js=(JavascriptExecutor)driver;
		
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       
       
         Thread.sleep(3000);
      
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
         
       
       
       
       
       
       
       
       
     /*  
     // search --------BestSeller
     
     
     WebElement ele=driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']//following::a[text()='Best Sellers'])[1]"));
     
       System.out.println("Text of link is: "+ele.getText());
     
       ele.click();
     
     
     //hello----SearchBox
     
     String text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::span[normalize-space()='Hello']")).getText();
    System.out.println("Test of element is: "+text);
     
       */
     
     
     
	}

}
