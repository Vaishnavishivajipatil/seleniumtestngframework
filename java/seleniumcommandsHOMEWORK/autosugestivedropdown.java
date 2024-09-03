package seleniumcommandsHOMEWORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestivedropdown {
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER); */
		
		List<WebElement> a=driver.findElements(By.xpath("//a[@Class='ui-corner-all']"));
		
		for(int i=0; i<a.size(); i++) {
			
		if(	a.get(i).getText().equalsIgnoreCase("india")) {
			
			a.get(i).click();
			break;
			
		}
		
		
	}

	}
	

	
	}

	
	
	


