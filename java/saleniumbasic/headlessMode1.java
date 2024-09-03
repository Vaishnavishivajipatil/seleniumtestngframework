package saleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessMode1 {
	
	public static void main(String[] args) {
		
		//create the object of chromeOptions class
			
			ChromeOptions co=new ChromeOptions(); 
			co.addArguments("headless");
			
			
			WebDriver driver = new ChromeDriver(co);

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			System.out.println(driver.getCurrentUrl());
			
			

}
}