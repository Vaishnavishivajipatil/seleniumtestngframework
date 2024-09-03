package seleniumcommandsHOMEWORK;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bankofamerica.com/");
		
		// takescreenshot (interface)-will help to take the screenshot
		
		// store src
		
		File src=((TakesScreenshot)  driver).getScreenshotAs(OutputType.FILE);
		
		// store in system
		FileUtils.copyFile(src,new File("C:\\Intel\\sample.jpg"));
		
		// particl
		
		WebElement b= findElement(By.xpath("(//a[@id='product1Cta'])[1]"));
		
		File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src,new File("C:\\\\Intel\\\\sample.om"));
		
				
				

		
		
		
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
