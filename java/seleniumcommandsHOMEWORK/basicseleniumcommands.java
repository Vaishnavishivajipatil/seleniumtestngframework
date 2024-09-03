package seleniumcommandsHOMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicseleniumcommands {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().window();
	
	driver.navigate().forward();
	
	driver.navigate().back();
	
	driver.manage().window().maximize();
	
	driver.manage().window().minimize();
	
	 driver.navigate().refresh();
	 
	 driver.quit();
	
	

	 //FindElement- single------ NO SUCH EXCEPTION(XPATH GALATHAI TO)
	 //fINDeLEMENTS- MULTIPL----- KUCH GALAT PASS KARKE DEGA TO SIZE PASS KAREGA
	 // CLOSE ------  INVAILD EXCEPTION
	 //QUIT-----NULL EXCEPTION
	}
	
	


}