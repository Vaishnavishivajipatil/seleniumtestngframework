package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {
	private static CharSequence vaishnavi;

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.Saleforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys("vaishnavi");
		
		driver.findElement(By.name("pw")).sendKeys("123");
		
		driver.findElement(By.id( "Login")).click();
		
		driver.findElement(By.linkText("forgot your password")).click();
		
		driver.findElement(By.linkText("your pass")).click();
		
		
		
		

		
		
		
		
		
		
		
	}

}
