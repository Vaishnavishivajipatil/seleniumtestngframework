package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// mouse related evenets
		// doubleclick, rightclick, moushover, draganddrop
		//For this we need to take help of actions class --
		
		//Right click --//contextClick 
		
		Actions a=new Actions(driver);
		
		
	    WebElement b=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		a.contextClick(b).perform();
		
		a.doubleClick(b).perform();
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement k= driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		a.moveToElement(k).perform();
		
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
	    WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));

		
		a.dragAndDrop(source, target).perform();
		

		

	}

}

	
	
	
	
	
	
	
	
	
	


