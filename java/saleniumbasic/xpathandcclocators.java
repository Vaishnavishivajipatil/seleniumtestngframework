package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathandcclocators {


	public static void main(String[] args) {
		
	    WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("hello");
	
		driver.findElement(By.xpath("//input [@type ='password']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		
	}
}

	
	


