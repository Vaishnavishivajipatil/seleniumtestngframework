package saleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandeling {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		List<WebElement> b=driver.findElements(By.xpath("(//table[@id='product'])[2]//td[4]"));
		
		int sum=0;
		
		for(int i=0;i<b.size();i++) {
			
			  String StringAmount =b.get(i).getText();
			  //convert to integer -
			  int  amount=Integer.parseInt(StringAmount);
			  sum=sum+amount;  
			/*  sum = 28+23=51
					 51+ 48 =99
					 99+18= */	
		}
		System.out.println(sum); //integer
		
		
		
	String totalAmount=	driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
	
	String finalAmount =totalAmount.substring(24);  //String
	
	int famount=Integer.parseInt(finalAmount);  //integer 
	System.out.println(famount); 
	
	
	//compare 
	
	if(sum==famount) {
		
		System.out.println("amount mtahcing successfully");
	}else {
		
		System.out.println("amount not mtahcing successfully");

	

	
	}
	}
}
	
	
