package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='DEL'])[1]")).click();
		
		
		
		
		
	}

}
