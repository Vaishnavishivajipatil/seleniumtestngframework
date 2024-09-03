package saleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleniumbasiccommands {

public static void main(String[] args) throws InterruptedException {
			
           //To launch the browser 
			WebDriver driver =new ChromeDriver();
			
			// session ID - 123

			//To open the url
			driver.get("https://www.amazon.in/"); //123
			//driver.navigate().to("https://www.amazon.in/");
			
			//Window maximize
			driver.manage().window().maximize();  // 123
			
			
			//This will print current loaded url
			System.out.println(driver.getCurrentUrl()); //123
			
			//Title of the page 
			System.out.println(driver.getTitle());  //123
			
		   //back
			driver.navigate().back(); //123
			
			Thread.sleep(1000);
			
			// forward
			driver.navigate().forward(); //123
		
			
			//Refresh 
			driver.navigate().refresh(); //123
		
		//	driver.close();  //123  // close will make your session invalid
		
		//	driver.get("https://login.salesforce.com/?locale=in"); //123 //invalid session id
			
			
			driver.quit();  //123
			
			//driver.get("https://login.salesforce.com/?locale=in");  //Session ID is null
			
				
		}
		
	


	// if you have opene any browser withouusing close and quit then you have to close it manully
	// cntrl+shift+o

	//Difference between close and quit ----
			// close -- will close the current open browser
			// quit -- will close the all opened browser
			
	        // close will not termnate the session  --session id is invalid
	        // quit will terminate teh session    - session id is null
	}


