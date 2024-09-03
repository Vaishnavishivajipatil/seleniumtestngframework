package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salaniumlocaters {
	
public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		driver.findElement(By.id("username")).sendKeys("test123");
		
		
		driver.findElement(By.name("pw")).sendKeys("secure124");
		
		
		driver.findElement(By.id("Login")).click();
		
		
		// Those who are having tagname as 'a' those are links
		
		

	driver.findElement(By.linkText("Forgot Your Password?")).click();
	
	driver.findElement(By.name("cancel")).click();
	
	driver.findElement(By.partialLinkText("Use Custom")).click();
		
		
		
	}
	
}


// locator tehcniques ---
// ID  -done
// name  -done
// classname  --pending
// xpath
//css Selector
//tagname  --  pending
//linktext -done
//partialLinkText  --done
	
	
	
	
	


