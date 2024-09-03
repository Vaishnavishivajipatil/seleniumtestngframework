package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {
	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement a = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		// We have to make sure the tagname is select
		// Creates object of select class
		Select s = new Select(a);

		// s.selectByIndex(2);
		// s.selectByValue("USD");
		s.selectByVisibleText("INR");
		
		

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		
		for (int i = 0; i < 4; i++) {

			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		}

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


