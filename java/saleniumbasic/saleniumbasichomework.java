package saleniumbasic;

import java.nio.file.ReadOnlyFileSystemException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleniumbasichomework {
	
	
	  public static void main(String[] args) throws InterruptedException {
		  
		  WebDriver driver =new ChromeDriver();
		  // open  the url
		  driver.get("https://www.flipkart.com");
		  
		  // window minimaz
		  driver.manage().window().minimize();
		  
		  //  to current page 
		  System.out.println(driver.getCurrentUrl());
		  
		 // to title
         System.out.println(driver.getTitle());
         
         // back , forward
         driver.navigate(). forward();
         
         // thread sleep
         Thread.sleep(5000);
         
         // to refresh
          driver.navigate().refresh();
         
		  
		  
	  }


	}


