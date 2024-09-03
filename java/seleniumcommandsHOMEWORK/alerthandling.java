package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		
	// to get print
		
	System.out.println(	driver.switchTo().alert().getText());
	
	// to write the box of alert
      driver.switchTo().alert().sendKeys("hi");
		
		
	}

}
