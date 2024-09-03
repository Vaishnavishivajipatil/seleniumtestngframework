package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {
public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		//Three ways to find frames
		// index
		//idORname
		//WebElement
		
		
		WebElement a= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//Switch to the frame
		driver.switchTo().frame(a);
		
		// grab the text
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		
		
		// to come outside the frame--
		driver.switchTo().defaultContent();
		
		

		
		
	}

}

	
	
	
	
	


