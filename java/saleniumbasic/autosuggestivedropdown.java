package saleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");

		Thread.sleep(2000);

		/*
		 * Not a suitable approach
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ARROW_UP);
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ARROW_UP);
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ENTER);
		 */

		List<WebElement> b = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));

		for (int i = 0; i < b.size(); i++) {

			if(b.get(i).getText().equalsIgnoreCase("India")) {
				
				b.get(i).click();
				break;
				
			}
			
		}

	}

}

	
	
	
	
	
	
	
	
	
	
	
	


