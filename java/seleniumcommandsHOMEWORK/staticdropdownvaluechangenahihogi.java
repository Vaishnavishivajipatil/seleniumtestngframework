package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdownvaluechangenahihogi {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// select tagname ho to fayda hai /object create karo
		WebElement a=driver.findElement(By.xpath("//select[@class='valid']"));
		
		Select s=new Select(a);
		
		// select ke method ISME SE KOI BHI CHOOS KAR SAKTE HAI
		
		s.selectByIndex(2);
		s.selectByValue("USD");
		s.selectByVisibleText("INR");
		
		// tagname select naserl tar hi method
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		for(int i=0; i<4; i++) {
		driver.findElement(By.xpath("(//span[@id='hrefIncAdt'])[1]")).click();
		
		
		}	
	}

}
