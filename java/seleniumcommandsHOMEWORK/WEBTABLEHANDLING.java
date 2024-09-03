package seleniumcommandsHOMEWORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTABLEHANDLING {
	
	
	public  static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		
		List<WebElement> a= driver.findElements(By.xpath("table[@id='product'])[1]//td[3]"));
		
		int sum=0;
		for(int i=0; i<a.size(); i++) {
			
			
			String StringAmount=a.get(i).getText(); 
			// conver to integer
			
			int Amount= Integer.parseInt(StringAmount);
			
			
		}
	
	     System.out.println(sum);
		
		
		
		
	}

}
