package saleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		System.out.println(driver.getCurrentUrl()); // rahulsheettacademy

		//Store driver.getWindowHandles in set of string
		Set<String> windows = driver.getWindowHandles();
		                     // parent child

		// second step -apply the iterator -

		Iterator<String> it = windows.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();
		
		//Third --We have to switch to window
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());  //qaclickacademy
		
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());  //rahulsheety

	}

}

	
	
	


