package saleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class celenderhandling {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		// month select 
		String monthAndYear="";
		
		while(!(monthAndYear.equalsIgnoreCase("November 2024"))) {
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			WebElement monthText= driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]"));
	
			WebElement yearText = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]"));
			
			monthAndYear= monthText.getText() + " "+ yearText.getText() ;
		}
	

	
		//date  select
		
		List<WebElement> a= driver.findElements(By.xpath("//td[@data-month='10']"));
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++) {
			
		 
			if(a.get(i).getText().equalsIgnoreCase("9")){
				
				a.get(i).click();
				break;
			}
			
		}
		
		
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


