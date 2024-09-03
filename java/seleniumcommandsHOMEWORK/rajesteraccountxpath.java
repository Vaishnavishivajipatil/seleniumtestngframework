package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rajesteraccountxpath {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.register.com/my-account/login");
	 
	driver.findElement(By.xpath("//input[@id=\"userId\"]")).sendKeys("1234");
	driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator reg-acc-login-next-btn mat-flat-button mat-button-base mat-primary mat-button-disabled\"]")).click();
	
	
	 // 2nd website
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vaish");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vais@123gamail.com");
    driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8459366007");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
    driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("123");
   driver.findElement(By.xpath("//input[@value='Continue']")).click();
}
} 
