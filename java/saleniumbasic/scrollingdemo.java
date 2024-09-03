package saleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrollingdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement facebook = driver.findElement(By.xpath("(//a[@class='makeFlex perfectCenter'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", facebook);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", facebook);

	}

}
