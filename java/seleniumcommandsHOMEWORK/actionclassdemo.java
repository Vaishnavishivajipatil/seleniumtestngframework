package seleniumcommandsHOMEWORK;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(("https://rahulshettyacademy.com/dropdownsPractise/"));
		
		//right click, mouserover, doubleclick, drapanddrop
		
		Actions a=new Actions(driver);
		
	WebElement b=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	
	    a.contextClick(b).perform();     // right click sathi
	    
	    
	    a.doubleClick(b).perform();      // doubleclick
	    
	    
	    a.moveToElement(b).perform();			// mouseover
	    
	    
	    
	    WebElement target;
		WebElement source;
		a.dragAndDrop(source, target).perform();  //draganddrop
	
	
	
		
		
		
		
		
	}


}
