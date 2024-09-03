package seleniumcommandsHOMEWORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cheakboxhandling {
	
	
	private static int i;

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		a.click();
		 System.out.println(a.isDisplayed());
		 System.out.println(a.isEnabled());
		 System.out.println(a.isSelected());
		 
		// multiple cheak box  selected
		 
		 List<WebElement> B=driver.findElements(By.xpath("//input[@type='checkbox']"));
		 System.out.println(B.size());
		 
		 for(int i=0; i<B.size(); i++);
		 B.get(i).click();
		 
		 
		 for(WebElement k:B)
			 k.click();
		 
		 
		 // ALTERNET SELECT
		 for(int i=0;i<B.size(); i=i+2) {
			 B.get(i).click();
		 }
		 
		
		
		
		}	
		
	}


