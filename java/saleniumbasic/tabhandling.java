package saleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabhandling {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		System.out.println(driver.getCurrentUrl()); // rahulsheettacademy

		// Store driver.getWindowHandles in set of string
		Set<String> tab = driver.getWindowHandles();
		// parent child

		// second step -apply the iterator -

		Iterator<String> it = tab.iterator();

		String parentTab = it.next();
		String childTab = it.next();

		// Third --We have to switch to tab
		driver.switchTo().window(childTab);
		System.out.println(driver.getCurrentUrl()); // qaclickacademy

		driver.switchTo().window(parentTab);
		System.out.println(driver.getCurrentUrl()); // rahulsheety

	}
}

	
	
	
	
	


