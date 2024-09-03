package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingdemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement a = driver
				.findElement(By.xpath("(//a[@href=\"https://courses.rahulshettyacademy.com/sign_up\"])[3]"));

		     js.executeScript("arguments[0].scrollIntoView(true)", a);
		     
		     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", a);
	}

}
