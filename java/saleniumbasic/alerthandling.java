package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
	
	
		

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			
			driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			
			
			Thread.sleep(1000);
			
			
		// Print the text on the alert
			
			System.out.println(driver.switchTo().alert().getText());
			
			
			//To accept the alert
			driver.switchTo().alert().accept();
			
			//To dismiss the alert
			//driver.switchTo().alert().dismiss();
			
			
			//To type something on alert
			
			//driver.switchTo().alert().sendKeys("dbsjkadj");
			
		
		
			
		}

	}

	
	
	


