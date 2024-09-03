package seleniumcommandsHOMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito {

	public static void main(String[] args) {
		
		ChromeOptions  co =new ChromeOptions();
		
		co.addArguments("incognito");
		
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("rahul");
		
		}

	// headless

        ChromeOptions  co =new ChromeOptions();

        co.addArguments("headles);

       WebDriver driver= new ChromeDriver(co);

          driver.get("rahul");
}