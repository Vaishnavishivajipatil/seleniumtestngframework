package saleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumwaits {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//implict Wait----all elemt la apply hoty
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		//Explict Wait-- jya elment la garaj aahe thyala apply honnar
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='BOM'])[2]"))).click();
	}


}
