package saleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewebtab {
	
   public static void main(String[] args) {
	   
	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> tab1 = driver.getWindowHandles();
		// parent child

		// second step -apply the iterator -

		Iterator<String> it = tab1.iterator();

		String parentTab = it.next();
		String childTab = it.next();

		// Third --We have to switch to tab
		driver.switchTo().window(childTab);
		System.out.println(driver.getCurrentUrl()); // child tab urr pint //mnc 
		
		Set<String> tab2 = driver.getWindowHandles();
		// parent child1  child2

		// second step -apply the iterator -

		Iterator<String> it1 = tab2.iterator();

		String parentTab1 = it1.next();  //naukri
		String childTab1 = it1.next();  //mnc
		String childTab2 = it1.next(); //company 

		// Third --We have to switch to tab
		driver.switchTo().window(childTab2);
		System.out.println(driver.getCurrentUrl());   //cpompamy url print
   


     driver.switchTo().window(parentTab1 );
		System.out.println(driver.getCurrentUrl());    //naukri 
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
