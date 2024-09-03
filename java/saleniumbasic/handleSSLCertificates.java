package saleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleSSLCertificates {
	
	
	public static void main(String[] args) {

		// create the object of chromeOptions class

		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}



}

