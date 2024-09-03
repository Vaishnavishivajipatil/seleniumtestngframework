package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
	  driver.get("https://demoqa.com/frames");
	  
	  
	  // there are ways-index,id, webelement(xpath) frame ke andar jane keliye
	  
	  driver.switchTo().frame("frame1");   //id  ghetali
	  
	  driver.findElement(By.xpath("")).getText();
	  
	  
	  // frame se bhaher ane keliyse defalut
	  driver.switchTo().defaultContent();
	  
	  
	  
	  
		
		
	}

}
