package seleniumcommandsHOMEWORK;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.xpath("openwindow")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		//1 ST STEP
		
		Set<String> windows= driver.getWindowHandles();
		
		
		//2 ND STEP
		
		Iterator<String> it = windows.iterator();
		
		String parentwindow =it.next();
		String childwindow=it.next();
		
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getCurrentUrl());
		
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
